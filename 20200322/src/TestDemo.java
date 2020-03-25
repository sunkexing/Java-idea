public class TestDemo {

    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(0,10);
        myArrayList.add(1,20);
        myArrayList.add(2,30);
        myArrayList.add(3,40);
        myArrayList.display();
        System.out.println("=====================");
        System.out.println(myArrayList.contains(10));
        System.out.println("=====================");
        System.out.println(myArrayList.search(2));
        System.out.println("=====================");
        System.out.println(myArrayList.getPos(0));
        System.out.println("=====================");
        myArrayList.setPos(1,10);
        myArrayList.setPos(2,10);
        myArrayList.display();
        System.out.println("=====================");
        myArrayList.remove(10);
        myArrayList.display();
        System.out.println("=====================");
        System.out.println(myArrayList.size());
        System.out.println("=====================");
        myArrayList.clean();
        myArrayList.display();
        System.out.println("================================");
    }


    public static void main1(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[]arr1=new int[]{1,2,3};
        int[] arr2=new int[3];
        arr2[2]=0;
    }


}
