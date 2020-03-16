import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class TestDemo {
    //实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
    public static String toString(int[] arr) {
        String ret="[";
        for(int i=0;i<arr.length;i++){
            ret+=arr[i];
           if(i<arr.length-1)
           {
               ret+=",";
           }
        }
        ret+="]";
        return ret;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(toString(arr));
    }

    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
    public static int[] copyOf(int[] arr) {
        int[]arr1=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr1[i]=arr[i];
        }
        return arr1;
    }
    public static void main4(String[] args) {
        int[]arr={1,2,3,6,5,6};
        System.out.println(Arrays.toString(copyOf(arr)));
    }

    //给定一个有序整型数组, 实现二分查找(必须是有序的)
    public static int binarySearch(int[] arr,int x) {
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(arr[mid]<x){
                left=mid+1;
            }else if(arr[mid]>x){
                right=mid-1;
            }else{
                return arr[mid];
            }
        }
        return -1;
    }
    public static void main3(String[] args) {
        int[] arr={1,2,3,4,7,9};
        System.out.println(binarySearch(arr, 1));
    }

    //给定一个整型数组, 判定数组是否有序（递增）
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main2(String[] args) {
        int[] arr={1,2,5,7,9};
        System.out.println(isSorted(arr));
    }

    //给定一个整型数组, 实现冒泡排序(升序排序)
    public static void bubbleSort(int[] arr) {
        boolean ret=false;
        for(int i=0;i<arr.length-1;i++){
            ret=false;
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    ret=true;
                }
            }
            if(ret==false){
                return;
            }
        }
    }
    public static void main1(String[] args) {
        int[] arr={1,3,2,6,4,7,5};
        bubbleSort( arr);
        System.out.println(Arrays.toString(arr));
    }
}
