import java.util.Arrays;

public class TestDemo1 {

    public static void tran(int[]arr1,int[]arr2){
        int[]tmp=new int[arr1.length];
        for (int i = 0; i <arr1.length ; i++) {
            tmp[i]=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=tmp[i];
        }
    }
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5,6};
        int[]arr2={7,8,9,10,11,12};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("============================");
        tran(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }


    public static void tmp(int[] arr){
        int left=0;
        int right=arr.length-1;
        while (left<right){
            while (left<right && arr[left]%2==0){
                left++;
            }
            while (left<right && arr[right]%2!=0){
                right--;
            }
            int tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
        }
    }

    public static void main1(String[] args) {
        int[] arr={1,2,3,4,5,6};
        tmp(arr);
        System.out.println(Arrays.toString(arr));
    }
}
