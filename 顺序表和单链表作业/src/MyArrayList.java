
import java.util.Arrays;

public class MyArrayList {
    private int[] elem=null;
    private int usedSize=0;

    //设置默认容量
    private static final int DEFAULT_SIZE=10;

    public MyArrayList() {
        this.elem = new int[DEFAULT_SIZE];
        this.usedSize = 0;
    }

    //打印顺序表
    public void disPlay(){
        for (int i = 0; i <this.usedSize ; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    //判满
    private boolean isFull(){
        if(this.elem.length==this.usedSize){
            return true;
        }
        return false;
    }

    //判空
    private boolean isEmpty(){
        if(this.usedSize==0){
            return true;
        }
        return false;
    }

    //扩容
    private void grow(){
        this.elem= Arrays.copyOf(this.elem,this.elem.length*2);
    }

    //判定pos是否合法
    private void cheakPos(int pos){
        if(pos<0 || pos>this.usedSize){
            throw new RuntimeException("异常:pos位置不合法");
        }
    }

    //在pos位置新增元素
    public void add(int pos,int data){
        if(isFull()){
            grow();
        }
        cheakPos(pos);
        int i=usedSize-1;
        while (i>=pos){
            this.elem[i+1]=this.elem[i];
            i--;
        }
        this.elem[pos]=data;
        this.usedSize++;
    }

    //判断是否包含某个元素
    public boolean contains(int toFind){
        if(isEmpty()){
            throw new RuntimeException("异常:顺序表为空，不包含");
        }
        for (int i = 0; i <this.usedSize ; i++) {
            if(this.elem[i]==toFind){
                return true;
            }
        }
        return false;
    }

    //查找某个元素对应的位置
    public int search(int toFind){
        if(isEmpty()){
            throw new RuntimeException("异常:顺序表为空，不包含");
        }
        for (int i = 0; i <usedSize; i++) {
            if(this.elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }

    //获取pos位置的元素
    public int getPos(int pos){
        if(isEmpty()){
            throw new RuntimeException("顺序表为空");
        }
        return this.elem[pos];
    }

    //给pos位置的元素设为val
    public void setPos(int pos,int val){
        cheakPos(pos);
        this.elem[pos]=val;
    }

    //删除第一次出现的关键字Key
    public void remove(int toRemove){
        //1.调用search方法看返回值，-1说明没有key，就不需要删除了
        int index=search(toRemove);
        if(index!=-1){
            for (int i = index; i <usedSize-1 ; i++) {
                this.elem[i]=this.elem[i+1];
            }
            this.usedSize--;
        }
    }

    //获取顺序表的长度
    public int size(){
        return this.usedSize;
    }
    //清空顺序表
    public void clean(){
        this.usedSize=0;
    }

}
