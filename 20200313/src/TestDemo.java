import java.util.Scanner;
public class TestDemo {
    
    //递归求5的阶乘，加上日志版本
    public static void main(String[] args) {
        int n=5;
        int ret=factor(n);
        System.out.println("ret="+ret);
    }
    public static int factor(int n){
        System.out.println("函数开始，n="+n);
        if(n==1){
            System.out.println("函数结束,n=1,ret=1");
            return 1;
        }
        int ret=n*factor(n-1);
        System.out.println("函数结束,n="+n+"ret="+ret);
        return ret;
    }


    //循环实现第n项斐波那契数列
    public static int fib2(int n) {
        int f1=1;
        int f2=1;
        int f3=1;
        for(int i=3;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }

    public static void main8(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fib2(n));
    }

    //多路递归  求第n项斐波那契数列
    public static int fib(int x){
        if(x==0){
            return 0;
        }else if(x==1 || x==2){
            return 1;
        } else{
            return fib(x-1)+fib(x-2);
        }
    }

    public static void main7(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fib(n));
    }
    //递归求各位数字之和
    public static int sum1(int x){
        if(x<10){//递归必须考虑终止条件
            return x;
        }else{
            return x%10+sum1(x/10);
        }
    }
    public static void main6(String[] args) {
        int a=1729;
        System.out.println(sum1(a));
    }
    //递归打印各位数字
    public static void print(int num){
        if(num>9){//终止条件
            print(num/10);
        }
        System.out.println(num%10);
    }

    public static void main5(String[] args) {
        int a=123;
        print(a);
    }
    //打印各位数字
    public static void main4(String[]args){
    int a=123;
    while(a!=0){
        System.out.println(a%10);
        a=a/10;
    }
}
    //递归求1+2+..+n
    public static int sum(int x){
        if(x==1){
            return 1;
        }else{
            return x+sum(x-1);
        }
    }

    public static void main3(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(sum(n));
    }

    //递归求阶乘

    public static int fac(int x){
        if(x==1){
            return 1;
        }else{
            return x*fac(x-1);
        }
    }

    public static void main2(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fac(n));
    }

    //初识Idea
    public static void func(int a){
        a=20;
    }
    public static void main1(String[] args) {
        int a=10;
        int b=30;
        int c=a+b;
        String s="hello";
        func(a);
        System.out.println(c);
        System.out.println("Hello idea");
    }

}
