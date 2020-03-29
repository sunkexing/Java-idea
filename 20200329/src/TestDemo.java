public class TestDemo {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
        doubleLinkedList.addFirst(1);
        doubleLinkedList.addFirst(5);
        doubleLinkedList.addFirst(5);
        doubleLinkedList.addFirst(5);
        doubleLinkedList.addFirst(5);
        doubleLinkedList.addFirst(1);
        doubleLinkedList.disPlay();
        doubleLinkedList.removeAllKey(5);
        doubleLinkedList.disPlay();
        doubleLinkedList.remove(1);
        doubleLinkedList.disPlay();

    }

    public static void main1(String[] args) {
        //com.bit.src1.TestDemo demo=new com.bit.src1.TestDemo();
        //不在同一个包中，不能互相访问
        //System.out.println(demo.val);
    }

    public static void main2(String[] args) {
        DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
        doubleLinkedList.addFirst(1);
        doubleLinkedList.addFirst(2);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(4);
        doubleLinkedList.addFirst(5);
        doubleLinkedList.disPlay();
        doubleLinkedList.addLast(0);
        doubleLinkedList.disPlay();
        System.out.println(doubleLinkedList.size());
        doubleLinkedList.addIndex(4,0);
        doubleLinkedList.disPlay();
        doubleLinkedList.removeAllKey(0);
        doubleLinkedList.disPlay();
        doubleLinkedList.remove(1);
        doubleLinkedList.disPlay();
    }
}
