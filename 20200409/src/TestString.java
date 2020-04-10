import java.util.Arrays;

public class TestString {
    public static void main9(String[] args) {
        //String是不可变的,如果用“+=”  会不断的创建新的，删除旧的，这样就非常低效
        StringBuilder str= new StringBuilder();//通过StringBuilder/StringBuffer就可以解决这个问题，因为他们可以让字符串改为可变的
        //StringBuilder线程不安全的
        //StringBuffer线程安全的，一般都得通过加锁的方式保证安全，加锁之后，才基本认为这个代码和高性能无缘
        for (int i=0;i<100;i++){
            str.append("abcd");
        }
        System.out.println(str);
    }

    public static void main8(String[] args) {
        //isEmpty判断当前字符串是否为空字符串（""），判断是否长度为0
        //而不是判断是否为null
    }

    public static void main7(String[] args) {
        String str="hello";
        System.out.println(str.toUpperCase());//转大写   由于不可变性
        System.out.println(str.toLowerCase());//转小写   二者都没有修改str本身的内容，而是穿创建新的字符串
    }
    public static void main6(String[] args) {
        //trim取掉所有空白字符（包括）：空格，制表符，换行，回车，垂直制表符，翻页符...
        String str="\n\t      abcd  \n";
        System.out.println("["+str+"]");
        System.out.println();
        System.out.println("["+str.trim()+"]");
    }
    public static void main5(String[] args) {
        //字符串截取子串 substring
        String str="hello world";
        //前闭后开，子串要包含6位置的元素，不包含9位置的元素
        System.out.println(str.substring(6,9));
        //可以不要后下标，结果便是从6开始到完
        System.out.println(str.substring(6));


    }
    public static void main4(String[] args) {
        String str="name=张三&age=18";
        String[] result=str.split("&");
        for (String tmp:result){
            //预期tmp2数组中包含两个元素
            String[] tmp2=tmp.split("=");
            System.out.println(tmp2[0]+":"+tmp2[1]);
        }
    }
    public static void main3(String[] args) {
        String str="192.168.1.1";
        String[] result=str.split("//.");
        //.在正则表达式中具有特定含义，此处的切分并不是按照"."这样的文本切分的
        //如果想按照.的文本形式切分，就需要进行转义
        //正则中 通过"\."来查找文本"."
        //Java代码中又不能直接写\，需要用两个\\表示一个文本  即"\\."
        //| * + ...都有类似情况
        System.out.println(Arrays.toString(result));
    }
    public static void main2(String[] args) {
        //字符串切分 split
        String str1="aaa,bbb,,ccc";//切分成四个部分
        String[] result=str1.split(",");
        //得到的新的数组
        System.out.println(Arrays.toString(result));

    }
    public static void main1(String[] args) {
        String str1="hello worldwor";
        String str2="wor";
        //通过contains
        System.out.println(str1.contains(str2));//true
        //indexOf
        System.out.println(str1.indexOf(str2));//6 str2在str1所在字符串的下标  从左往右找
        //lastIndexOf
        System.out.println(str1.lastIndexOf(str2));//从右往左找
        //startsWith
        System.out.println(str1.startsWith("hello"));//是否以hello开头？
        //endsWith
        System.out.println(str1.endsWith("helllo"));
        //字符串替换 replaceAll  全部替换
        //replaceFirst  第一个下标位置替换
        String result=str1.replaceAll("world","java");
        System.out.println(str1);
        System.out.println(result);
        //1.因为不可变性，不修改原始字符串，二者都是创建新的字符串
        //2.二者第一个参数regex  正则表达式 是一个特殊的字符串 带有一些特殊符号 描述了你要找的字符串特征
    }
}
