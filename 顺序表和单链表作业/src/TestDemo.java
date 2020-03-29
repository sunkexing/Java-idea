public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(4);
        myLinkedList.disPlay();
        myLinkedList.addLast(0);
        myLinkedList.disPlay();
        System.out.println(myLinkedList.size());
        System.out.println("===================");
        myLinkedList.addIndex(2,88);
        myLinkedList.disPlay();
        System.out.println(myLinkedList.contains(88));
        myLinkedList.remove(88);
        myLinkedList.disPlay();
        myLinkedList.addLast(4);
        myLinkedList.disPlay();
        myLinkedList.removeAllKey(4);
        myLinkedList.disPlay();
        myLinkedList.clean();
        myLinkedList.disPlay();
    }

    public static void main1(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(0,3);
        myArrayList.disPlay();
        System.out.println(myArrayList.contains(0));
        System.out.println(myArrayList.search(1));
        System.out.println("================");
        System.out.println(myArrayList.getPos(0));
        System.out.println("=============");
        myArrayList.remove(3);
        myArrayList.disPlay();

    }
}
