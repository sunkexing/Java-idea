
class Test{
    public static void hello() {
        System.out.println("hello");
    }
    public String s;
}


public class TestDemo {
     String s;

    public static void main(String[] args) {
        TestDemo testDemo=new TestDemo();
        System.out.println(testDemo.s);


        Test t=new Test();
        /*
        t.hello();
         */
        System.out.println(t.s);
        Test test=null;
        test.hello();
    }

    public static void main1(String[] args) {
        Test.hello();
    }
}
