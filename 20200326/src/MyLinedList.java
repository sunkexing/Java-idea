//节点类
class Node{
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}
//单链表
public class MyLinedList {
    //头节点
    private Node head;

    public MyLinedList() {
    }//如果没定，系统会自动生成

    //头插法
    public void addFirst(int data){
        Node node=new Node(data);
        if(this.head==null){//优化
            this.head=node;
            return;
        }
        node.next=this.head;
        this.head=node;
    }

    //打印单链表
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

    //任意位置插入，第一个数剧节点为0号下标
    public void addIndex(int index,int data){
        //先看index是否合法
        if(index<0 || index>size()){
            System.out.println("要插入的位置不合法");
        }
        if(index==0){
            addFirst(data);
        }
        if (index==size()){
            addLast(data);
        }else {
            Node prev=findIndex(index);
            Node node=new Node(data);
            node.next=prev.next;
            prev.next=node;
        }

    }
    //先让一个引用走index-1步，走到index前面那个节点
    private Node findIndex(int index){
        Node cur= this.head;
        int count=0;
        while (count<index-1){
            cur=cur.next;
            count++;
        }
        return cur;
    }
    //返回单链表长度
    public int size(){
        Node cur=this.head;
        int count=0;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    //删除第一次出现关键字key的节点
    public void remove(int key){
        //头节点的关键字就是我想删除的
        if(this.head.data==key){
            this.head=this.head.next;
            return;//关键！！！！！
        }
        Node prev=findPrev(key);
        if(prev==null){
            System.out.println("未找到要删除的节点");
            return;
        }
        Node del=prev.next;
        prev.next=del.next;
    }
    //找key的前驱
    private Node findPrev(int key){
        Node prev=this.head;
        while(prev.next!=null){
            if(prev.next.data==key){
                return prev;
            }
            prev=prev.next;
        }
        return null;
    }

    //查找是否包含关键字key所在的节点
    public Boolean contains(int key){
        Node cur=this.head;
        while (cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    //删除所有值为key的节点
    public void removeAllkey(int key){
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

    //清空单链表
    public void  clear(){
        //this.head=null;//直接
        while (this.head.next!=null){
            Node del=this.head.next;
            this.head.next=del.next;
        }
        this.head=null ;//一个一个清空
    }


    //反转
    public Node reverseList(){
        Node cur=this.head;
        Node prev=null;
        Node newHead=null;
        while (cur!=null){
            Node curNext=cur.next;
            if(curNext==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;
    }

    //打印2
    public void display2(Node newHead){
        Node cur=newHead;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    //头插法完成反转
//    public Node reverseList2() {
//        Node cur = this.head;
//        while (cur != null) {
//        }
//    }

    //返回单链表中间节点，若为偶数，返回第二个中间节点
    public Node middleNode(){
        Node fast=this.head;
        Node slow=this.head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    //返回倒数第k个节点
    public Node findKthToTail(int k){
        if(k<0 || this.head==null){
            return null;
        }
        Node fast=this.head;
        Node slow=this.head;
        //让fast先走k-1步
        int count=0;
        while (count<k-1){
           if(fast.next!=null){
               fast=fast.next;
               count++;
           }
        }
        //让2个引用一起走，直到fast.next==null slow所指节点就是倒数第k个节点
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

    //按给定x为基准将链表分为两部分，小于x的节点排在大于或等于x节点之前
    public Node partition(int x){
        Node cur=this.head;
        Node bs=null;
        Node be=null;
        Node as=null;
        Node ae=null;

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
        be.next=as;

        if(as!=null){
            ae.next=null;
        }
        return bs;
    }
}
