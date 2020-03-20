
class Test{
    public static void hello() {
        System.out.println("hello");
    }
    public String s;
}


public class TestDemo {

    public static void main(String[] args) {
        Test t=new Test();
        System.out.println(t.s);
    }

    public static void main1(String[] args) {
        Test.hello();
    }
}
