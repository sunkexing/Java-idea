//异常

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDemo {

    public static void main(String[] args) {
        try {//用try catch解决  不让JVM解决
            System.out.println(readFile());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    //受查异常
    public static String readFile() throws FileNotFoundException {//抛出异常
        // 尝试打开文件, 并读其中的一行.
        File file = new File("d:/test.txt");
        // 使用文件对象构造 Scanner 对象.
        Scanner sc = new Scanner(file);
        return sc.nextLine();
    }



    public static void func3 (int x,int y)throws ArithmeticException{//声明这个函数有可能会存在异常
        if(y==0){//程序员想自己手动抛出异常   //抛出异常
            throw new ArithmeticException("你给的y==0 不能作为除数");
        }
        System.out.println(x/y);
    }

    public static void main7(String[] args) {

        try {//用于受查异常
            func3(4,0);
        }catch (ArithmeticException e){
            System.out.println("解决了异常");
        }
    }


    public static void func2() throws ArrayIndexOutOfBoundsException{//throws声明一个异常 告诉程序员调用此方法需要处理异常
        int[] arr={1,2,3,4,5,6};
        System.out.println(arr[100]);
    }

    public static void main6(String[] args) {
        try {
            func2();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常");
        }
    }


    public static int func() {
        try {
            int a=10/0;
            return a;//不会跳出，finally还会被执行
        }catch (ArithmeticException e){
            System.out.println("捕获数组越界异常");
            return 8;
        }finally {
            System.out.println("finally被执行了");
            return 19;//报警告了，不好的代码
        }
    }

    public static void main5(String[] args) {
//        int ret=func();
//        System.out.println(ret);
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            System.out.println(n);
        } catch (InputMismatchException e) {
            System.out.println("输入参数不匹配");
        }


    }

    public static void main4(String[] args) {
        //1.不管是否发生异常，finally 当中的代码肯定会被执行
        //2.finally当中千万不能写return语句
        //3.finally用于资源释放
        try {
            int[] arr={1,2,3};
            System.out.println(arr[1]);
            System.out.println("after");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("捕获数组越界异常");
        }finally {
            System.out.println("finally被执行了");
        }
        System.out.println("异常处理结束");
    }

    public static void main3(String[] args) {
        try {
            int[] arr={1,2,3};
            System.out.println(arr.length);
            System.out.println(arr[100]);
            System.out.println("bad");
        }catch (Exception e){//不推荐使用
            e.printStackTrace();
        }
        System.out.println("good");
    }

    public static void main2(String[] args) {
        try {
            int[] arr={1,2,3};
            System.out.println(arr.length);
            System.out.println(arr[100]);
        }catch (NullPointerException | ArrayIndexOutOfBoundsException e){//放一块
            e.printStackTrace();
            System.out.println("捕获数组越界异常");
        }
        System.out.println("good");

    }


    public static void main1(String[] args) {
        try {
            //int[] arr=null;
            int[] arr={1,2,3};
            System.out.println(arr.length);//程序发生异常，代码不再继续执行
            //System.out.println("gaobo");不会被打印
            System.out.println(arr[100]);
            System.out.println("bad");
        }catch (NullPointerException e){
            e.printStackTrace();//处理异常,必须捕获相对应的异常
            System.out.println("捕获空指针异常");
        }catch (ArrayIndexOutOfBoundsException e){//捕获多个异常
            e.printStackTrace();
            System.out.println("捕获数组越界异常");
        }
        System.out.println("good");
    }
}
