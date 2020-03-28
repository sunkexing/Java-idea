import com.sun.org.apache.regexp.internal.REUtil;

class Node{
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}

public class MyLinedList {
    public Node head;

    public MyLinedList() {
        this.head = null;
    }

    //头插法
    public void addFirst(int data){
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
            return;
        }
        node.next=this.head;
        this.head=node;
    }

    //打印单链表数据
    public void disPlay(){
        Node cur=this.head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    //尾插法
    public void addLast(int data){
        Node node=new Node(data);
        if(this.head==null){
           this.head=node;
           return;
        }
        Node cur=this.head;
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
    }

    //走index-1 步
    public Node findIndex(int index){
        Node cur=this.head;
        int count=0;
        while (count<index-1){
            count++;
            cur=cur.next;
        }
        return cur;
    }
    //任意位置插入，第一个数剧节点为0号下标
    public void addIndex(int index,int data){
        //index是否合法
        if(index<0 || index>size()){
            System.out.println("位置不合法");
        }
        Node prev=findIndex(index);
        Node node=new Node(data);
        if(prev!=null){
            node.next=prev.next;
            prev.next=node;
        }
    }
    //单链表长度
    public int size(){
        Node cur=this.head;
        int count=1;
        while (cur.next!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }

    //查找是否包含关键字key在单链表中
    public boolean contains(int key){
        Node cur=this.head;
        while (cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    //删除第一次出现的关键字为key的节点
    public void remove(int key){
        if(this.head.data==key){
            this.head=null;
            return;
        }
        Node prev=findPrev(key);
        if(prev==null){
            System.out.println("找不到要删除的节点");
        }
        Node del=prev.next;
        prev.next=del.next;
    }

    //找前驱
    private Node findPrev(int key){
        Node cur=this.head;
        while (cur.next!=null){
            if(cur.next.data==key){
                return cur;
            }
            cur=cur.next;
        }
        return null;
    }
    //删除出现所有关键字为key的节点
    public void removeAllKey(int key){
        Node prev=this.head;
        Node cur=this.head.next;
        while (cur!=null){
            if(cur.data==key){
                prev.next=cur.next;
                cur=cur.next;
            }else {
                prev=prev.next;
                cur=cur.next;
            }
        }
        if(this.head.data==key){
            this.head=this.head.next;
        }
    }

    //反转一个单链表
    public Node reverseList(){
        Node prev=null;
        Node Newhead=null;
        Node cur=this.head;
        while (cur!=null){
            Node curNext=cur.next;
            if(curNext==null){
                Newhead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return Newhead;
    }
    //打印2
    public void disPlay2(Node newHead){
        Node cur=newHead;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    //返回单链表的中间节点，若为偶数则返回中间第二个节点
    public Node middleNode(){
        Node fast=this.head;
        Node slow=this.head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    //输入一个链表，输出该链表倒数第K个节点
    public Node findKthToTail(int k){
        if(k<=0 || k>size()){
            return null;
        }
        int count=0;
        Node fast=this.head;
        Node slow=this.head;
        while (count<k-1){
           if(fast.next!=null){
               fast=fast.next;
               count++;
           }
        }
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

    //以给定值x为基准将链表分割成两部分，所有小于等于x的结点排在大于或等于x的结点之前
    public Node partition(int x){
        Node cur=this.head;
        Node as=null;
        Node ae=null;
        Node bs=null;
        Node be=null;
        while (cur!=null){
            if(cur.data<x){
                if(bs==null){
                    bs=cur;
                    be=bs;
                }else {
                    be.next=cur;
                    be=be.next;
                }
            }else {
                if(as==null){
                    as=cur;
                    ae=as;
                }else {
                    ae.next=cur;
                    ae=ae.next;
                }
            }
            cur=cur.next;
        }
        if(bs==null){
            return as;
        }
        //连接
        be.next=as;
        if(as!=null){
            ae.next=null;
        }
        return bs;
    }



    //删除相同节点
    public  Node deleteDuplication(){
        Node node=new Node(-1);
        Node tmp=node;
        Node cur=this.head;//不重复的节点
        while (cur!=null){
            if(cur.next!=null &&cur.data==cur.next.data ){
                while (  cur.next!=null &&cur.data==cur.next.data){
                    cur=cur.next;
                }
                cur=cur.next;
            }else {
                tmp.next=cur;
                tmp=tmp.next;
                cur=cur.next;
            }
        }
        //走出循环后发现尾部全都是相同节点
        tmp.next=null;
        //返回不能返回head，因为如果头部都是相同节点，就无法达到删除效果
        return node.next;
    }


    //链表的回文结构  给定一个链表的头指针A，请返回一个boolean值，代表其是否为回文结构。保证链表长度小于等于900。
    public Boolean chkPaLindRoom(){
        Node slow=this.head;
        Node fast=this.head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node cur=slow.next;
        while (cur!=null){
            Node curNext=cur.next;
            cur.next=slow;
            slow=cur;
            cur=curNext;
        }
        while (this.head!=slow){
            if(this.head.data!=slow.data){
                return false;
            }
            if(this.head.next==slow){
                return true;
            }
            this.head=this.head.next;
            slow=slow.next;
        }
        return true;
    }

    //创建环
    public void creatLoop(){
        Node cur=this.head;
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=this.head.next;
    }

    //判断一个单链表是否有环
    public boolean hasCycle(){
        Node fast=this.head;
        Node slow=this.head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return false;
        }
        return true;
    }

    //返回相遇点
    public Node meet(){
        Node fast=this.head;
        Node slow=this.head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return null;
        }
        return fast;//相遇点

    }

    //返回开始入环的第一个节点，无环返回null
    public Node detectCycle(){
        Node fast=this.head;
        Node slow=this.head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return null;
        }
        //return fast;//相遇点
        slow=this.head;
        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
    }

}
