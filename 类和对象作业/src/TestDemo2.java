
public class TestDemo2 {
    private int count;
    public static void main(String[] args) {
        TestDemo2 t=new TestDemo2(8);
        System.out.println(t.count);
    }
//    TestDemo2(int a){
//        count=a;
//    }
     public TestDemo2(int count){
        this.count=count;
     }

}
