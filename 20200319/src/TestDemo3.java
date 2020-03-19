class Student2{
    private String name;
    private int age;

    public Student2(){//默认构造方法，没有参数
        this("1",1);
    }
    public Student2(String name,int age){//带有2个参数的构造方法
       this.name=name;//参数
       this.age=age;//参数
       //this("name",1);
    }
    public void show(){
        System.out.println("name:"+name+" ,age:"+age);
    }
}

public class TestDemo3 {
    public static void main(String[] args) {
        Student2 s1=new Student2();//调用没有参数的构造函数
        s1.show();
        Student2 s2=new Student2("zhangfei",80);
        s2.show();
    }
}
