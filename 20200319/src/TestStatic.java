class Test{
    public int a;
    public static int count;
}


public class TestStatic {
    public static void main(String[] args) {
        Test t1=new Test();
        t1.a++;
        Test.count++;
        System.out.println(t1.a);
        System.out.println(Test.count);
        System.out.println("===================");
        Test t2=new Test();
        t2.a++;
        Test.count++;
        System.out.println(t2.a);
        System.out.println(Test.count);
    }
}
