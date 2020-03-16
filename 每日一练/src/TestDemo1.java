public class TestDemo1 {
    //冒泡排序
    public static void main(String[] args) {
        int []arr={2,5,1,9,4,3};
        maopaoSort(arr);
    }

    public static void maopaoSort(int[]arrays) {
        int tmp=0;
        for (int j = 0; j <arrays.length ; j++) {
            for (int k = 0; k <arrays.length-1 ; k++) {
                if(arrays[k]>arrays[k+1]){
                    tmp=arrays[k];
                    arrays[k]=arrays[k+1];
                    arrays[k+1]=tmp;
                }
            }
        }
        maopaoPrint(arrays);
    }
    public static void maopaoPrint(int[] before) {
        for (int i = 0; i <before.length ; i++) {
            System.out.print(before[i]+" ");
        }
        System.out.println();
    }



    //打印9*9乘法口诀表

    public static void main3(String[] args) {
        for (int i = 1, j=1; j <=9 ; i++) {
            System.out.print(i+"*"+j+"="+i*j+" ");
            if(i==j){
                i=0;
                j++;
                System.out.println();
            }
        }
    }
    
    public static void main2(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+j*i+"  ");
            }
            System.out.println();
        }
    }




    //打印100以内的素数(权威)
    public static void main1(String[] args) {
        //主函数
        for (int i = 1; i <100 ; i++) {
           if(isPrint(i)){
               System.out.println(i);
           }
        }
    }
    public static boolean isPrint(int x) {
        //打印素数函数
        if(x==1){
            return false;
        }
        long spatNum=(long)Math.sqrt(x);
        for (int i = 2; i <spatNum ; i++) {
            if(x%i==0){
                return false;
            }
        }
        return true;
    }

}
