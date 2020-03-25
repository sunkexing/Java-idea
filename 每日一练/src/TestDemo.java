public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.add(4,5);
        myArrayList.disPlay();
        System.out.println("=======================");
        System.out.println(myArrayList.contains(8));
        System.out.println("=======================");
        System.out.println(myArrayList.search(9));
        System.out.println("=======================");
        System.out.println(myArrayList.getPos(1));
        System.out.println("=======================");
        myArrayList.remove(3);
        myArrayList.disPlay();
        System.out.println("=======================");
        System.out.println(myArrayList.size());
        System.out.println("======================");
        myArrayList.clean();
        myArrayList.disPlay();
    }
}
