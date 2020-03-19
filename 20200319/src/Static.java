public class Static {
    public static void fib() {//加了static
        System.out.println("1");
    }
    public static void main(String[] args) {
        fib();
    }


    public void fib1(){  //没加static
        System.out.println("1");
    }
    public static void main1(String[] args) {
        Static t1=new Static();
        t1.fib();
    }
}
