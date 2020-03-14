import java.util.Arrays;
public class TestDemo {
    //clone实现数组拷贝
    public static void main5(String[] args) {
        int[] array={1,2,3,4,5};
        int[] ret=array.clone();
        System.out.println("ret="+Arrays.toString(ret));
    }

    //Arrays.copyOf实现数组拷贝
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        System.out.println("拷贝前array="+Arrays.toString(array));
        int[] ret=Arrays.copyOf(array,array.length);
        ret[0]=999;
        System.out.println("拷贝后ret修改="+Arrays.toString(ret));
        System.out.println("拷贝后array="+Arrays.toString(array));
    }

    //System.arraycopy实现数组拷贝
    public static void main3(String[] args) {
        int[] array={1,2,3,4,5};
        int[] dest=new int[array.length];
        System.arraycopy(array,0,dest,0,array.length);
        System.out.println("dest"+Arrays.toString(dest));
    }

    //写一个方法实现数组拷贝
    public static  int[] copyArray(int[] arr){
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        return arr1;
    }
    public static void main2(String[] args) {
        int[] array={1,2,3,4,5};
        int[] ret=copyArray(array);
        System.out.println(Arrays.toString(ret));
    }




    //自己实现一个toString
    public static String myToString(int[] array){
        String ret="[";
        for(int i=0;i<array.length;i++){
            ret=ret+array[i];
            if(i!=array.length-1){
                ret=ret+",";
            }
        }
        ret=ret+"]";
        return ret;
        }
    public static void main1(String[] args) {
        int[] array={1,2,3,4,5,6};
        //System.out.println(Arrays.toString(array));//打印数组
        System.out.println(myToString(array));
    }
}
