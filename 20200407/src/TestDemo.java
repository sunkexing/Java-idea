import java.lang.reflect.Field;

public class TestDemo {
    public static void main(String[] args) {
        //字典序 compareTo 比较
        String str1="hehe";
        String str2="Hehe";
        System.out.println(str1.compareTo(str2));

    }
    public static void main10(String[] args) {
        String str1="hehe";
        String str2="Hehe";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));//忽略大小写比较
    }
    public static void main9(String[] args) {
        char[] array={'h','e','h','e'};
        String str=new String(array);
        System.out.println(str);
        System.out.println("==================");
        //toCharArray  用来将字符串转为字符数组
        char[] array2=str.toCharArray();//相当于把字符串拷贝了一份，效率不够好
        for (int i = 0; i <array2.length ; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("===========");
        //charAt   可以通过下标访问字符
        System.out.println(str.charAt(0));
        System.out.println("===========");
        //这种遍历方法更好
        for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    //用反射来改固定字符串，特殊手段，与封装背道而驰，不建议滥用
    public static void main8(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str="hehe";
        //需要先根据“value”这个名字找到str中内部存储的value数组
        Field field= String.class.getDeclaredField("value");
        //1.获取String对象的图纸，
        //获取到String类对象，类对象中包含这个类的名字，有那些成员，每个成员类型和名字，private还是public
        field.setAccessible(true);
        //2.根据图纸找到str里面的value数组
        char[] value=(char[])field.get(str);
        //然后修改这个数组 内容
        value[0]='a';
        System.out.println(str);
    }
    public static void main7(String[] args) {
        String str="hehe";
        str="haha";
        System.out.println(str);
    }
    public static void main6(String[] args) {
        String str1="hehe";
        //intern方法 可以主动去池子中查找，看看当前这个String是否在池中存在
        //如果池中不存在，就把这个String加入到池中
        //如果已经存在，就舍弃当前对象，直接获取到池中的对应对象的引用，提高效率
        String str2=new String("hehe").intern();
        System.out.println(str1==str2);
    }
    public static void main5(String[] args) {
        String str1="hehe";
        String str2="hehe";
        String str3="hehe";
        String str4="hehe";
        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str3==str4);
    }
    //面试重点，equals会考虑是否为空，增加了容错率
    public static void main4(String[] args) {
        String str1=null;
        //System.out.println(str1.equals("hehe"));//str1有可能是null
        System.out.println("hehe".equals(str1));//更推荐这种写法
    }
    public static void main3(String[] args) {
        String str1="hehe";
        String str2=new String("hehe");
        String str3="hehe";
        //== 对于引用类型，比较的是对象的身份（对比两个引用中保存的地址是否一样）（person 、go、 c++）
        System.out.println(str1==str2);//false
        //要想比较内容，用equals  比较对象的值（java、 c）
        System.out.println(str1.equals(str2));// true
    }
    public static void main2(String[] args) {
        int a=10;
        int b=10;
        System.out.println(a==b);
    }
    public static void main1(String[] args) {
        //创建几个String对象
        String str1="hehe";
        String str2=new String("hehe");
        char[] buffer={'a','b','c'};
        String str3=new String(buffer);
    }
}
