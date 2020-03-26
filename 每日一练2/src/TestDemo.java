public class TestDemo {
    public static void main(String[] args) {
        MyLinedList myLinedList=new MyLinedList();
        myLinedList.addFirst(1);
        myLinedList.addFirst(2);
        myLinedList.addFirst(3);
        myLinedList.disPlay();
        System.out.println();
        System.out.println("=================");
        myLinedList.addLast(3);
        myLinedList.disPlay();
        System.out.println();
        System.out.println("=================");
        System.out.println(myLinedList.size());
        System.out.println("=================");
        myLinedList.addIndex(2,99);
        myLinedList.disPlay();
        System.out.println();
        System.out.println("===================");
        myLinedList.remove(99);
        myLinedList.disPlay();
        System.out.println();
        System.out.println("====================");
        myLinedList.removeAllkey(3);
        myLinedList.disPlay();
    }

}
