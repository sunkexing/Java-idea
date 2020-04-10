public class Test {
    public static void main(String[] args) {
        String str1="c";
        String str2="a";
        System.out.println(str1.compareTo(str2));//大于，返回内容为正数
        System.out.println("A".compareTo("A"));//0相等返回0
        System.out.println("ab".compareTo("ac"));//小于，返回值为负数
        System.out.println("A".compareTo("a"));
        System.out.println("a".compareTo("A"));
    }

    public static void main3(String[] args) {
        String s1="abc"+"def";//1
        String s2=new String(s1);//2
        if(s1.equals(s2))//3
            System.out.println(".equals succeeded");//4
        if(s1==s2)//5
            System.out.println("==succeeded");//6
    }



    public static boolean isAdmin(String userId){
        return userId.toLowerCase()=="admin";
    }

    public static void main2(String[] args) {
        System.out.println(isAdmin("Admin"));
    }






    String str = new String("good");//具有不可变性
    char[ ] ch = { 'a' , 'b' , 'c' };
    public static void main1(String[] args) {
        Test test=new Test();
        test.change(test.str,test.ch);
        System.out.print(test.str + " and ");
        System.out.print(test.ch);
    }
    public void change(String str,char ch[ ]){
        str = "test ok";//new了一个新的字符串
        ch[0] = 'g';
    }
}
