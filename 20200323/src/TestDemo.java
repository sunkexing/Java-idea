
public class TestDemo {

    public static void main(String[] args) {
        MyLinedList myLinedList=new MyLinedList();
        myLinedList.addFirst(99);
        myLinedList.addFirst(1);
        myLinedList.addFirst(2);
        myLinedList.addFirst(3);
        myLinedList.addFirst(4);
        myLinedList.display();//4 3 2 1 99  头插
        System.out.println();
        System.out.println("=================");
        myLinedList.addLast(9);
        myLinedList.addLast(8);
        myLinedList.display();
        System.out.println();
        System.out.println("=================");
        System.out.println(myLinedList.size());
        System.out.println("=================");
        System.out.println(myLinedList.contains(0));
        System.out.println("=================");
        myLinedList.addIndex(1,1);
        myLinedList.display();
        System.out.println();
        System.out.println("=================");
        myLinedList.remove(99);
        myLinedList.display();
        System.out.println();
        System.out.println("=================");
        myLinedList.removeAllKey(1);
        myLinedList.display();


    }


}
