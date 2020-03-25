
class MyValue{
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

public class TestDemo2 {

    public static void tmp(MyValue myValue1,MyValue myValue2){
        int tmp=myValue1.getA();
        myValue1.setA(myValue2.getA());
        myValue2.setA(tmp);
    }

    public static void main(String[] args) {
        MyValue myValue1=new MyValue();
        myValue1.setA(1);
        MyValue myValue2=new MyValue();
        myValue2.setA(2);
        System.out.println(myValue1.getA()+" "+myValue2.getA());
        tmp(myValue1,myValue2);
        System.out.println(myValue1.getA()+" "+myValue2.getA());
    }

}
