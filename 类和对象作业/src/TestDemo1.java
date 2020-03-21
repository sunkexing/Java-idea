


 class Test1 {
     public static int aMethod() {
         //static int i=0;  不管是静态还是非静态的方法，内部都不可以定义static类型的变量
         // static类型的变量只能定义在类内，方法外，属性，存放在方法区，有且只有一份
         //只要写在方法内，他就局部变量   栈
         int i = 0;
         i++;
         return i;
     }
 }

public class TestDemo1{



    private static int x = 100;
    public static void main2(String args[]) {
        TestDemo1 hsl = new TestDemo1();
        hsl.x++;
        TestDemo1 hs2 = new TestDemo1();
        hs2.x++;
        hsl = new TestDemo1();
        hsl.x++;
        TestDemo1.x--;
        System.out.println(" x=" + x);
    }


    static boolean Paddy;
    public static void main(String args[]){
        System.out.println(Paddy);
    }


    public static void main1(String args[]){
        Test1.aMethod();
        int j = Test1.aMethod();
        System.out.println(j);
    }
}



