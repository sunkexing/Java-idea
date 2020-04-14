import java.util.Scanner;

//错题纠正
public class TestDemo {


    //6.输入一个字符串，求出该字符串包含的字符集合  <不包括重复的>
    public static void main3(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){//hasNext（） 是检测 还有没有下一个输入
            String str=scanner.nextLine();//nextLine（） 把指针移动到下一行 让然后取出当前这一行的输入
            StringBuilder builder=new StringBuilder();//StringBuilder 线程不安全的  可变字符串
            for (int i = 0; i <str.length() ; i++) {
                char tmp=str.charAt(i);//charAt  反转字符串
                if(!builder.toString().contains(tmp+"")){
                    builder.append(tmp);//append()方法 相当于"+"
                }
            }
            System.out.println(builder.toString());
        }
    }


    //5.
    //public static void main(String[] args){ String foo1 = args[1]; String foo2 = args[2]; String foo3 = args[3]; }
    //程序运行错误


    //4.==  优先级高于 三目运算
    public static void main2(String[] args) {
        boolean b=true?false:true == true?false:true;
        System.out.println(b);
    }




//1.在运行时，由java解释器自动引入，而不用import语句引入的包是()  java.lang      //java.lang.String
    //2.当try区段的程序发生异常且被catch捕捉到时，才会执行catch区段的程序


    //3.
    public static boolean isAdmin(String userId){
        return userId.toLowerCase()=="admin";//== 对字符串来说判断的是地址，即所指对象
    }//字符串的不可变性
    public static void main1(String[] args) {
             System.out.println(isAdmin("Admin"));
    }



}
