import java.util.Arrays;

public class MyArrayList {
private int[] elem;//null
private int usedSize;//0

//设置默认容量
private static final int DEFAULT_SIZE=10;

public MyArrayList(){
    //this.elem=new int[10];
    this.elem=new int[DEFAULT_SIZE];
    this.usedSize=0;
}


//打印顺序表
public void display(){
    for (int i = 0; i <this.usedSize ; i++) {
        System.out.println(this.elem[i]);
    }
}


private void grow(){
    this.elem=Arrays.copyOf(this.elem,this.elem.length*2);
}



// 在 pos 位置新增元素
public void add(int pos, int data) {
    if(isFull()){
        //System.out.println("顺序表是满的");
        //return;
        //扩容
        grow();
    }
    cheakPos(pos);
    //开始挪数据
    int i=this.usedSize-1;
    while (i>=pos){
        this.elem[i+1]=this.elem[i];
         i--;
    }
    this.elem[pos]=data;
    this.usedSize++;
}



private boolean isFull(){
    if(this.usedSize==this.elem.length){
        return true;
    }
    return false;
}



// 判定是否包含某个元素
public boolean contains(int toFind) {
    if(isEmpty()){
        throw new RuntimeException("顺序表为空");
    }
    for (int i = 0; i <this.usedSize ; i++) {
        if(this.elem[i]==toFind)
            return true;
    }
    return false;
}


private boolean isEmpty(){
    if(this.usedSize==0){
        return true;
    }
    return false;
}


// 查找某个元素对应的位置
public int search(int toFind) {
    if(isEmpty()){
        throw new RuntimeException("顺序表为空");
    }
    for (int i=0;i<this.usedSize;i++){
        if(this.elem[i]==toFind)
            return i;
    }
    return -1;
}


     //只是提供给内部使用  可以设置为私有的
private void cheakPos(int pos){
    if(pos<0 || pos>this.usedSize){
        // System.out.println("pos位置不合法");
        throw new RuntimeException("pos位置不合法");
    }
}


// 获取 pos 位置的元素
public int getPos(int pos) {
    if (isEmpty()) {
        throw new RuntimeException("顺序表为空");
    }
    return this.elem[pos];
}


// 给 pos 位置的元素设为 value
public void setPos(int pos, int value) {
    cheakPos(pos);
    this.elem[pos]=value;
}



//删除第一次出现的关键字key
public void remove(int key) {
       //1.调用search方法看返回值，-1说明没有key，就不需要删除了
       //index, i=index ,[i]=[i+1] , i<usedSize-1
       //usedSize=usedSize-1
    int index=search(key);
    if(index!=-1){
        for (int i = index; i <usedSize-1 ; i++) {
               this.elem[i]=this.elem[i+1];
        }
    }
    this.usedSize--;
}



   // 获取顺序表长度
public int size() {
    return this.usedSize;
}


    // 清空顺序表
public void clean(){
    this.usedSize=0;
}

}
