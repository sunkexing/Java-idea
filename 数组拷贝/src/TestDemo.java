import java.lang.reflect.Array;
import java.util.Arrays;

public class TestDemo {
    //数组拷贝4     要拷贝的数组名.clone();
    public static void main(String[] args) {
        int[] arr={1,2,3,45,6};
        int[] ret=arr.clone();
        System.out.println(Arrays.toString(ret));
    }

    //数组拷贝3    Arrays.copyOf(要拷贝的数组，要拷贝的数组长度)
    public static void main5(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] ret=Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(ret));
    }


    //数组拷贝2     System.arraycopy（要拷贝的数组名，左下标，新数组名，右下标，数组长度）
    public static void main4(String[] args) {
        int[] arr={1,2,3,45,6};
        int[] ret=new int[arr.length];
        System.arraycopy(arr,0,ret,0,arr.length);
        System.out.println(Arrays.toString(ret));
    }



    //数组拷贝1    自己实现
    public static int[] arrayCopy1(int[] arr) {
        int[] ret=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ret[i]=arr[i];
        }
        return ret;
    }
    public static void main3(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arrayCopy1(arr)));
    }

    //自己实现数组转字符串
    public static String toString(int[] arr){
        String ret="[";
        for (int i=0;i<arr.length;i++){
            ret=ret+arr[i];
            if(i!=arr.length-1){
                ret+=",";
            }
        }
        ret+="]";
        return ret;
    }
    public static void main2(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(toString(arr));
    }

    //数组转字符串
    public static void main1(String[] args) {
        int[] arr={1,2,3,4,5,6};
        String newArr= Arrays.toString(arr);
        System.out.println(newArr);
    }
}
