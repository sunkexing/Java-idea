import java.util.Arrays;
public class TestDemo {
    //参数传数组类型
    public static void main(String[] args) {
        int[] arr={1,2,3};
        func1(arr);
        System.out.println("arr[0]=" +arr[0]);
    }
    public static void func1(int[] x){
        x[0]=999;
        System.out.println("x[0]="+x[0]);
    }

    //参数传内置类型
    public static void main7(String[] args) {
        int num=0;
        func(num);
        System.out.println("num="+ num);
    }
    public static void func(int x){
        x=10;
        System.out.println("x= "+x);
    }


    //for each访问数组
    public static void main6(String[] args) {
        int[] arr={1,2,3};
        for (int x:arr
             ) {
            System.out.println(x);
        }
    }

    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static void setArr(int[] arr){
        for(int i=0;i<100;i++){
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main5(String[] args) {
        int[] arr=new int[100];
        setArr(arr);
    }

    //实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main4(String[] args) {
        int[] arr={1,2,3,4,5};
        printArray(arr);
    }


    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
    // 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
    public static int[] transform(int[] arr) {
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i]*2;
        }
        return arr1;
    }
    public static void main3(String[] args) {
        int[] arr={1,2,3};
        int[]ret=transform(arr);
        System.out.println(Arrays.toString(ret));
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    //实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
    public static int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main2(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(sum(arr));
    }



    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
    public static double avg(int[] arr){
        double sum=0;
        double count=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            count++;
        }
        return sum/count;
    }
    public static void main1(String[] args) {
        int[] array={1,4,2,7,9};
        System.out.println(avg(array));
    }

}
