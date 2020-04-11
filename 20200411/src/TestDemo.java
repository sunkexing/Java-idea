import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TestDemo {
    public static void main(String[] args) {
        //Collection是接口 add，remove，contains都是抽象方法
        //这些方法在执行时 具体的行为取决于Collection对应的真实对象的类型



        //1 实例化一个Collection对象，是一个接口，必须要new一个对应的类作为实例才可以
        Collection<String> collection=new ArrayList<>();
        //2 使用size/isEmpty
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        //3 使用add添加元素
        collection.add("我");
        collection.add("爱");
        collection.add("Java");
        //4 再次使用isEmpty 和size
        System.out.println("===============");
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        //5 toArray 把集合转为数组
        //String也是继承自Object   array看似是一个Object数组，其实是String数组
        System.out.println("===============");
        Object[] array=collection.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(collection);//可以直接打印
        System.out.println("=================");

        //6 使用for each 遍历collection
        //比较普通的遍历方式，如果想要用while或者普通for，需要搭配迭代器使用
        for (String s:collection){
            System.out.println(s);
        }

        //7 判断元素是否存在  contains内部会拿参数的对象和集中保存的对象值比较（而不是按身份）
        System.out.println("================");
        boolean ret=collection.contains("我");
        System.out.println(ret);
        //8.使用remove删除指定元素
        System.out.println("================");
        collection.remove("爱");
        for (String s:collection){
            System.out.println(s);
        }
        //9.使用clean清空所以元素
        System.out.println("================");
        collection.clear();
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());


    }
}
