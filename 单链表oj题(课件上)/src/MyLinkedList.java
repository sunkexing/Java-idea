import java.util.WeakHashMap;

class Node{
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}

public class MyLinkedList {
    public Node head=null;

    public MyLinkedList() {
        this.head =null;
    }

    //删除所有出现关键字key的节点
    public void removeAllKey(int key){
        if(this.head==null){
            return;
        }
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
        if(this.head==null){
            return null;
        }
        Node newHead=null;
        Node prev=null;
        Node cur=this.head;
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

    //返回链表的中间结点
    public Node middleNode(){
        if(this.head==null){
            return null;
        }
        Node fast=this.head;
        Node slow=this.head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    //求链表长度
    public int size(){

        Node cur=this.head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }

    //输入一个链表，输出该链表中倒数第k个结点
    public Node FindKthToTail(int k) {
        if(this.head==null){
            return null;
        }
        if(k<0 || k>size()){
            return null;
        }
        Node fast=this.head;
        Node slow=this.head;
        int count=0;
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
        return  slow;
    }

    //链表分割
    public Node partition(int x) {
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


    //删除链表重复节点
    public Node deleteDuplication(){
        Node node=new Node(1);
        Node tmp=node;
        Node cur=this.head;
        while (cur!=null){
            if(cur.next!=null && cur.data==cur.next.data){
                while (cur.next!=null && cur.data==cur.next.data){
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
        return node.next;
    }


    //链表的回文结构
    public boolean chkPalindrome() {
        Node fast=this.head;
        Node slow=this.head;
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
            this.head=this.head.next;
            slow=slow.next;
            if(this.head.next==slow){
                return true;
            }
        }
        return true;
    }


    //输入两个链表，找出它们的第一个公共结点
    public Node getIntersectionNode(Node headA, Node headB) {
        int lenA=0;
        int lenB=0;
        Node NL=headA;
        Node NS=headB;

        while (NL!=null){
            lenA++;
            NL=NL.next;
        }
        NL=headA;
        while (NS!=null){
            lenB++;
            NS=NS.next;
        }
        NS=headB;

        int ln=lenA-lenB;
        if(ln<0){
            NL=headB;
            NS=headA;
            ln=lenB-lenA;
        }

        while (ln>0){
            NL=NL.next;
            ln--;
        }

        while (NL!=NS){
            NL=NL.next;
            NS=NS.next;
        }
        if(NL==NS && NL!=null){
            return NL;
        }
        return null;
    }

    //给定一个链表，判断链表中是否有环
    public boolean hasCycle(Node head) {
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
        return fast;
    }

    //链表开始入环的第一个节点
    public Node detectCycle(Node head) {
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
        slow=this.head;
        while (slow!=fast){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }




}
