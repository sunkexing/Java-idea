import java.util.Scanner;
public class Frog {
    //一只青蛙一次可以跳上一个台阶，也可以跳上两个，求该青蛙跳上一个n级台阶总共有多少种跳法
    public static int fib(int x){
        if(x==1 ){
            return 1;
        }else if(x==2){
            return 2;
        }else{
            return fib(x-1)+fib(x-2);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println( fib(n));
    }
}
