
class Person{

}

public class TestDemo {

    public static void main(String[] args) {
        MyLinedList myLinedList=new MyLinedList();
        myLinedList.addLast(0);
        myLinedList.addLast(1);
        myLinedList.addLast(2);
        myLinedList.addLast(3);
        myLinedList.addLast(0);
        myLinedList.disPlay();
        System.out.println("===========倒数第k个数据==============");
        Node cur=myLinedList.findKthToTail(2);
        System.out.println(cur.data);
        //myLinedList.display2(myLinedList.findKthToTail(2));
        System.out.println("==========基准============");
        Node a=myLinedList.partition(2);
        myLinedList.display2(a);
    }

    public static void main2(String[] args) {
        Person[] people=new Person[3];
    }

    public static void main1(String[] args) {
        MyLinedList myLinedList=new MyLinedList();
        myLinedList.addFirst(1);
        myLinedList.addFirst(2);
        myLinedList.addFirst(3);
        myLinedList.disPlay();
        System.out.println();
        System.out.println("===============");
        myLinedList.addLast(0);
        myLinedList.disPlay();
        System.out.println();
        System.out.println("================");
        myLinedList.addIndex(2,999);
        myLinedList.disPlay();
        System.out.println();
        System.out.println("==================");
        System.out.println(myLinedList.size());
        System.out.println("==================");
        myLinedList.remove(999);
        myLinedList.disPlay();
        System.out.println();
        System.out.println("===================");
        System.out.println(myLinedList.contains(999));
        System.out.println("===================");
        myLinedList.addFirst(1);
        myLinedList.addLast(1);
        myLinedList.removeAllkey(1);
        myLinedList.disPlay();
        System.out.println();
        System.out.println("========反转===========");
        //myLinedList.clear();
        //myLinedList.disPlay();
        //System.out.println();
        Node ret=myLinedList.reverseList();
        myLinedList.display2(ret);
        //System.out.println("========反转2=========");
        //Node ret2=myLinedList.reverseList2();
        //myLinedList.display2(ret2);
    }


}
