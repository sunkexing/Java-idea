import java.util.Arrays;//工具类
import java.util.Scanner;

public class Array {
        public static int[] func2(){
                int[] array={1,2,3,4,5,6};
                return array;
        }
        public static void main(String[] args) {
                int[] ret=func2();
                System.out.println(Arrays.toString(ret));
        }

        public static void main7(String[] args) {
                String[] strings=new String[2];
                Scanner scanner=new Scanner(System.in);
                for(int i=0;i<strings.length;i++){
                        strings[i]=scanner.next();
                        System.out.print(strings[i]+" ");
                }

        }

//        public static void main6(String[] args) {
//               int[] arr={1,2,3,4,5};
//               arr=null;
//               System.out.println(arr[0]);
//               System.out.println(arr.length);
//        }


        public static void swap2(int[] array2){
                int tmp=array2[0];
                array2[0]=array2[1];
                array2[1]=tmp;
        }

        public static void main5(String[] args) {
                int[] array={10,20};
                System.out.print(Arrays.toString(array));
                swap2(array);
                System.out.println();
                System.out.print(Arrays.toString(array));
        }

        public static void swap1(int x,int y){
                int tmp=x;
                x=y;
                y=tmp;
        }
        public static void main4(String[] args) {
                //交换两个数字
                int a=10;
                int b=20;
                System.out.println(a+" "+b);
                swap1(a,b);
                System.out.println(a+" "+b);
        }

        public static void print(int[] array){
                array[0]=999;
                for(int i=0;i<array.length;i++){
                        System.out.print(array[i]+" ");
                }
                System.out.println();
        }
        public static void main3(String[] args) {
                int[] array2={1,2,3,4,5,6,7,8,9,10};
                print(array2);
                System.out.println(Arrays.toString(array2));
        }




        public static void main2(String[] args) {
                int[] array2={1,2,3,4,5,6,7,8,9,10};
                System.out.println(array2.length);
                System.out.println(array2[0]);
                array2[0]=888;
                System.out.println(array2[0]);
        }



public static void main1(String[] args) {
        int[] arr1=new int [3];//定义，未初始化，默认值为0
        int[] arr2={1,2,3,4,5,6,7,8,9,10};//定义且初始化了一个数组，数组大小为10
        int[] arr3=new int[]{1,2,3,4,5,6,7};//定义且初始化了一个数组，数组大小为7
        System.out.println("=====for循环打印=======");
        for(int i=0;i<arr1.length;i++){//i代表下标
        System.out.println(arr1[i]);
        }
        System.out.println("========for each=========");
        for (int i:arr2) {//i代表每个元素的值
                System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("====数组内容以字符串形式进行输出====");
        System.out.println(Arrays.toString(arr3));
}
}
