


 class Test1 {
     public static int aMethod() {
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



