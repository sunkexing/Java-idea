import org.omg.CORBA.NO_IMPLEMENT;

public class TestDemo {

    //两个有序递增单链表合并为一个单链表
    public Node mergeTwoLists(Node headA,Node headB) {
        Node node=new Node(88);
        Node tmp=node;
        while (headA!=null && headB!=null){
            if(headA.data<headB.data){
                tmp.next=headA;
                tmp=tmp.next;
                headA=headA.next;
            }else{
                tmp.next=headB;
                tmp=tmp.next;
                headB=headB.next;
            }
        }
        if(headA==null){
            tmp.next=headB;
        }
        if(headB==null){
            tmp.next=headA;
        }
        return node.next;
    }

    public static void main2(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.FindKthToTail(0);
    }

    public static void main1(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.removeAllKey(1);
        myLinkedList.reverseList();
        myLinkedList.middleNode();
    }

}
