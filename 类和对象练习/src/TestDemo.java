class Test{
    public String toString() {
        System.out.print("aaa");
        return "bbb";
    }
}

class Calculator{
    private int num1;
    private int num2;

    public Calculator() {

    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add(){
        return this.num1+this.num2;
    }
    public int sub(){
        return this.num1-this.num2;
    }
    public int mul(int a,int b){
       return a*b;
    }
    public double dev(int a,int b){
       double ret=(double)a/b;
       return ret;
    }


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}


class MyValue{
    public int a;
}




public class TestDemo {
    public static void swap(int[] array2){
        int tmp=array2[0];
        array2[0]=array2[1];
        array2[1]=tmp;
    }

    public static void swap2(MyValue myValue1,MyValue myValue2){
        int tmp=myValue1.a;
        myValue1.a=myValue2.a;
        myValue2.a=tmp;
    }


    public static void main5(String[] args) {
        MyValue myValue1=new MyValue();
        myValue1.a=10;
        MyValue myValue2=new MyValue();
        myValue2.a=20;
        System.out.println(myValue1.a+" "+myValue2.a);
        swap2(myValue1,myValue2);
        System.out.println(myValue1.a+" "+myValue2.a);
    }

    public static void main4(String[] args) {
        int[] array={1,2};
        System.out.println(array[0]+" "+array[1]);
        swap(array);
        System.out.println(array[0]+" "+array[1]);
    }


    public static void main3(String[] args) {
        Calculator calculator=new Calculator(10,20);
        System.out.println(calculator.add());
    }


    public static void main2(String[] args) {
        System.out.println(new Test());
    }



    static int cnt = 6;
    static{
        cnt += 9;
    }

    public static void main1(String[] args) {
        System.out.println("cnt="+cnt);
    }
    static{
        cnt /=3;
    };

}
