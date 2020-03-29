import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TestDemo {


    public static Node mergeTwoLists(Node headA,Node headB){
        Node newHead=new Node(-1);
        Node tmp=newHead;
        while (headA!=null && headB!=null){
            if(headA.data<headB.data){
                tmp.next=headA;
                tmp=tmp.next;
                headA=headA.next;
            }else {
                tmp.next=headB;
                tmp=tmp.next;
                headB=headB.next;
            }
        }
        if(headA!=null){
            tmp.next=headA;
        }
        if (headB!=null){
            tmp.next=headB;
        }
        return newHead.next;
    }


    public static void main(String[] args) {
        MyLinedList myLinedList=new MyLinedList();
        myLinedList.addLast(1);
        myLinedList.addLast(2);
        myLinedList.addLast(3);
        myLinedList.addLast(4);
        myLinedList.addLast(5);
        myLinedList.disPlay();
        MyLinedList myLinedList2=new MyLinedList();
        myLinedList2.addLast(2);
        myLinedList2.addLast(4);
        myLinedList2.addLast(6);
        myLinedList2.addLast(8);
        myLinedList2.addLast(10);
        myLinedList2.addLast(16);
        myLinedList2.addLast(28);
        myLinedList2.addLast(112);
        myLinedList2.disPlay();

        Node ret=mergeTwoLists(myLinedList.head,myLinedList2.head);
        myLinedList.disPlay2(ret);
    }

    public static void main8(String[] args) {
        MyLinedList myLinedList=new MyLinedList();
        myLinedList.addLast(1);
        myLinedList.addLast(4);
        myLinedList.addLast(2);
        myLinedList.addLast(3);
        myLinedList.addLast(0);
        myLinedList.disPlay();
        myLinedList.creatLoop();
        System.out.println(myLinedList.hasCycle());
        Node ret=myLinedList.detectCycle();
        System.out.println(ret.data);
    }




    //让单链表两个相交
    public static void createCut(Node headA,Node headB){
        headA.next=headB.next.next;
    }

    //找出两个相交单链表的公共节点
    public static Node getIntersectionNode(Node headA,Node headB){
        if(headA==null || headB==null){
            return null;
        }
        int lenA=0;
        int lenB=0;
        Node pL=headA;
        Node pS=headB;
        while (pL!=null){
            lenA++;
            pL=pL.next;
        }
        while (pS!=null){
            lenB++;
            pS=pS.next;
        }
        //得指回来，不然为空了
        pL=headA;
        pS=headB;
        int len=lenA-lenB;
        if(len<0){
            pL=headB;
            pS=headA;
            len=lenB-lenA;
        }
        //可以保证：
        // 1、pL指向了长的单链表   pS指向了短的单链表
        //2、len的值 是一个正数


        //让pL先开始走len步
        while (len>0){
            pL=pL.next;
            len--;
        }

        //然后一人一步走，知道两个引用相同，否则，没有节点
        while (pL!=pS){
            pL=pL.next;
            pS=pS.next;
            if(pL==pS && pL!=null){
                return pL;
            }
        }
        return null;
    }



    public static void main7(String[] args) {
        MyLinedList myLinedList=new MyLinedList();
        myLinedList.addLast(1);
        myLinedList.addLast(4);
        myLinedList.addLast(2);
        myLinedList.addLast(3);
        myLinedList.addLast(0);
        myLinedList.disPlay();

        MyLinedList myLinedList2=new MyLinedList();
        myLinedList2.addLast(1);
        myLinedList2.addLast(3);
        myLinedList2.addLast(44);
        myLinedList2.addLast(121);
        myLinedList2.addLast(4);
        myLinedList2.addLast(6);
        myLinedList2.addLast(8);
        myLinedList2.addLast(2);
        myLinedList2.disPlay();
//        Node ret=getIntersectionNode(myLinedList.head,myLinedList2.head);
//        System.out.println(ret.data);//这里空指针异常，因为二者没相交
        createCut(myLinedList.head,myLinedList2.head);
        System.out.println("===========================");
        myLinedList.disPlay();
        myLinedList2.disPlay();
        System.out.println("===========================");
        Node ret=getIntersectionNode(myLinedList.head,myLinedList2.head);
        System.out.println(ret.data);

    }

    public static void main6(String[] args) {
        MyLinedList myLinedList=new MyLinedList();
        myLinedList.addLast(1);
        myLinedList.addLast(4);
        myLinedList.addLast(2);
        myLinedList.addLast(3);
        myLinedList.addLast(0);
        myLinedList.disPlay();
        Node ret=myLinedList.partition(3);
        myLinedList.disPlay2(ret);



    }
    public static void main5(String[] args) {
        MyLinedList myLinedList=new MyLinedList();
        myLinedList.addLast(1);
        myLinedList.addLast(2);
        myLinedList.addLast(3);
        myLinedList.addLast(4);
        myLinedList.addLast(5);
        myLinedList.disPlay();
        System.out.println("=========倒数第k个数字的节点============");
        Node ret=myLinedList.findKthToTail(1);
        System.out.println(ret.data);
    }

    public static void main4(String[] args) {
        MyLinedList myLinedList=new MyLinedList();
        myLinedList.addLast(1);
        myLinedList.addLast(2);
        myLinedList.addLast(3);
        myLinedList.addLast(4);
        myLinedList.addLast(5);
        myLinedList.disPlay();
        Node ret=myLinedList.middleNode();
        System.out.println("=========中间节点的数据==========");
        System.out.println(ret.data);
    }
    public static void main3(String[] args) {
        MyLinedList myLinedList=new MyLinedList();
        myLinedList.addLast(1);
        myLinedList.addLast(2);
        myLinedList.addLast(3);
        myLinedList.addLast(4);
        myLinedList.addLast(5);
        myLinedList.disPlay();
        System.out.println("========反转==========");
        Node ret=myLinedList.reverseList();
        myLinedList.disPlay2(ret);
    }


    public static void main2(String[] args) {
       MyLinedList myLinedList=new MyLinedList();
       myLinedList.addLast(1);
       myLinedList.addLast(2);
       myLinedList.addLast(3);
       myLinedList.addLast(4);
       myLinedList.addLast(5);
       myLinedList.disPlay();
       //System.out.println(myLinedList.size());
        System.out.println("=========================");
        myLinedList.addIndex(1,99);
        myLinedList.disPlay();
        myLinedList.remove(99);
        myLinedList.disPlay();
        myLinedList.removeAllKey(1);
        myLinedList.disPlay();
    }

    public static void main1(String[] args) {
        MyLinedList myLinedList=new MyLinedList();
        myLinedList.addFirst(1);
        myLinedList.addFirst(2);
        myLinedList.addFirst(3);
        myLinedList.addFirst(4);
        myLinedList.addFirst(5);
        myLinedList.disPlay();
    }
}


