import java.util.Arrays;
public class TestDemo {

    ////不规则的二维数组
    public static void main13(String[] args) {
        int[][]arr=new int[2][];
        arr[0]=new int[3];
        //arr[0]=new int{1,2,3};
        arr[1]=new int[5];
        System.out.println(Arrays.deepToString(arr));
    }

    //二维数组
    public static void main11(String[] args) {
        int[][]arr=new int[2][3];
        int[][]arr1=new int[][]{{1,2,3},{4,5,6}};
        int[][]arr2=new int[][]{{1,2},{3,4},{5,6}};//规则的二维数组，知道行和列
        for(int i=0;i<arr1.length;i++){
            for (int j = 0; j <arr1[i].length ; j++) {
                System.out.print(arr1[i][j]+" ");//for循环打印二维数组
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr1));//二维数组，（deep深度）打印
    }

    //数组数字排列，偶数在前，奇数在后
    public static void transform(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while (left<right && arr[left]%2==0){//left下标对应的值是奇数
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
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        transform(arr);
        System.out.println(Arrays.toString(arr));
        //System.out.println(arr);//地址的哈希值 也是唯一的
    }

    //原地逆置
    public static void reverse(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
            left++;
            right--;
        }
    }
    public static void main9(String[] args) {
        int[]arr={1,5,3,1,5,8};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }


    //冒泡排序，最优化
    public static void bubbleSort(int[] arr) {
        boolean flg=false;
        for (int i = 0; i <arr.length-1 ; i++) {//i是趟数
            flg=false;//不一定一开始就是有序的，他可能在排序过程当中的某一次有序了
            for (int j = 0; j <arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    flg=true;
                }
            }
            if(flg!=true){
                return ;
            }
        }
    }
    public static void main8(String[] args) {
        int[] arr={1,7,3,2,8};
        bubbleSort(arr);//       引用   浅拷贝类型
        System.out.println(Arrays.toString(arr));
    }

    //判断数组是否是有序的（升序）
    public static boolean isSorted (int[] arr) {
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main7(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(isSorted(arr));
    }

    //判断数组内容
    public static void main6(String[] args) {
        int[]arr1={1,2,3,4};
        int[]arr2={1,2,3,4};
        System.out.println(Arrays.equals(arr1, arr2));//判断的是地址的内容
        System.out.println(arr1==arr2);//比较的地址，（引用）
    }

        public static void main12(String[] args) {
        int[] arr={1,3,2,4,5,6};
        Arrays.sort(arr);//排序数组
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,5));//二分查找
        System.out.println(Arrays.binarySearch(arr,32));
        System.out.println(Arrays.binarySearch(arr,-32));

   }


    //查找数组中指定元素（二分查找）必须是有序数组，这样提高了效率
    public static int count=0;//成员变量，共享的
    public static int binarySearch(int[] arr,int x) {
       int left=0;
       int right=arr.length-1;
       while(left<=right){
           count++;
           int mid=(left+right)/2;
           if(arr[mid]<x){
               left=mid+1;
           }else if(arr[mid]>x){
               right=mid-1;
           }else{
               return mid;
           }
       }
       return -1;
    }
    public static void main5(String[] args) {
        int[]arr={1,2,3,6,9,12};
        System.out.println(binarySearch(arr, 9999));
        System.out.println("找了"+count+"次");
    }

    //查找数组中的指定元素,显示他的下标(顺序查找)
    public static int find(int[] arr,int num) {
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==num){
                return i;
            }
        }
        return -1;//数组没有-1下标,表示没找到
    }
    public static void main4(String[] args) {
        int[]arr={11,22,33,44,55};
        System.out.println(find(arr, 22));
    }


    //求数组里面数据的平均数
    public static double avg(int[] arr){
        double sum=0;
        for (int x:arr
             ) {
            sum+=x;
        }
        return sum/arr.length;
    }
    public static void main3(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(avg(arr));
    }

    //找出数组里面最大的值
    public static int max(int[] arr) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]) {
               max=arr[i];
            }
        }
        return max;
    }
    public static void main2(String[] args) {
        int[] arr={1,2,3,45,8};
        System.out.println(max(arr));
    }
    //范围拷贝数组
    public static void main1(String[] args) {
        int[]arr={1,2,3,4,5};
        int[]ret= Arrays.copyOfRange(arr,0,4);//左闭右开
        System.out.println(Arrays.toString(ret));
    }

}
