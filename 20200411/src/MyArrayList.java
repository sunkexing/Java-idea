import java.util.Arrays;

class Student{
    public String name;
    public String sex;
}

public class MyArrayList<E> {
    //Object可以表示各种类型的
    //private E[] array=new E[100];//这种直接new【100】的方式是不行的
    private E[] array=(E[]) new Object[100];//强转型
    private  int size;

    void add(E o){//包访问权限
        array[size]=o;
        size++;
    }

    E  get(int index){
        return array[index];
    }


    public static void main(String[] args) {
//        MyArrayList myArrayList=new MyArrayList();
//        myArrayList.add("我");
//        myArrayList.add("爱");
//        myArrayList.add("Java");
//        String ret=(String)myArrayList.get(0);//向上转型
//
//        MyArrayList myArrayList2=new MyArrayList();
//        myArrayList.add(new Student());
//        myArrayList.add(new Student());
//        myArrayList.add(new Student());
//        String ret2=(String)myArrayList2.get(0);//向上转型


        //对于这种情况可以用泛型 解决这种问题
        MyArrayList<String> myArrayList=new MyArrayList<>();
        myArrayList.add("hehe");
        String s=myArrayList.get(0);

        MyArrayList<Student> myArrayList2=new MyArrayList<>();
        myArrayList2.add(new Student());
        String student=myArrayList.get(0);


    }


}
