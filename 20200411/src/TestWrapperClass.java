import java.util.ArrayList;
import java.util.List;

public class TestWrapperClass {
    public static void main(String[] args) {

//        //内置类型--》包装类（装箱）
//        Integer i=Integer.valueOf(10);
//        Integer i2=new Integer(10);
        Integer i=10;//自动装箱
//        //包装类-->内置类型（拆箱）
//        int j=i.intValue();
        int j=i;//自动拆箱


    }
    public static void main1(String[] args) {
        List<Integer> list=new ArrayList<>();//用一个类Integer  把内置类型包装了
    }

}
