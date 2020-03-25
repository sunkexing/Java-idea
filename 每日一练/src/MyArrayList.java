import java.util.Arrays;

public class MyArrayList {
    private int[]elem;//null
    private int usedSize;//0

    private static final int DEFAULT_SIZE=10;

    //构造方法
    public MyArrayList(){
        this.elem=new int[DEFAULT_SIZE];
        this.usedSize=0;
    }

    public void disPlay(){
        for (int i = 0; i <this.usedSize ; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    //在pos位置添加元素
    public void add(int pos,int data){
        //1.看他是否满了
        while (isFull()){
            //若满，扩容
            grow();
        }
        //2.检测pos位置是否合法
        cheakPose(pos);
        //3.挪数据
        int i=this.usedSize-1;
        while (i>=pos){
            this.elem[i+1]=this.elem[i];
            i--;
        }
        this.elem[pos]=data;
        this.usedSize++;
    }

    //顺序表是否满
    private boolean isFull(){
        if(this.usedSize==this.elem.length){
            return true;
        }
        return false;
    }

    //扩容
    private void grow(){
        this.elem= Arrays.copyOf(this.elem,this.elem.length*2);
    }

    //顺序表是否为空
    private boolean isEmpty(){
        if(this.usedSize==0){
            return true;
        }
        return false;
    }

    //检测p输入的pos是否合法
    private void cheakPose(int pos){
        if(pos<0 || pos>this.elem.length){
            throw new RuntimeException("输入pos的位置不合法，抛出异常");
        }
    }

    //判定是否包含某个元素
    public boolean contains(int key){
        if(isEmpty()){
            throw new RuntimeException("顺序表为空");
        }
        for (int i = 0; i <this.elem.length ; i++) {
            if(this.elem[i]==key){
                return true;
            }
        }
        return false;
    }

    //查找某个元素对应的位置
    public int search(int toFind){
        if(isEmpty()){
            throw new RuntimeException("此顺序表为空");
        }
        for (int i = 0; i <this.usedSize ; i++) {
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
        cheakPose(pos);
        return this.elem[pos];
    }

    //给pos位置的元素设置为val
    public void setPos(int pos,int val){
        cheakPose(pos);
        this.elem[pos]=val;
    }

    //删除第一次出现的关键字key
    public void remove(int key){
        int index=search(key);
        if(index==-1){
            return;
        }
        for (int i=index;i<this.usedSize-1;i++){
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }

    //获取顺序表长度
    public int size(){
        return this.usedSize;
    }

    public void clean(){
        this.usedSize=0;
    }

}
