class Student2{
    private String name;
    private int age;

    public Student2(){//默认构造方法，没有返回值
        this.age=18;
        this.name="男人";
        System.out.println("Student");
    }
    public Student2(String name,int age){//带有2个参数的构造方法
        this.name="1";
        this.age=age;
    }
    public void show(){
        System.out.println("name:"+name+" ,age:"+age);
    }
}

public class TestDemo3 {
    public static void main(String[] args) {
        Student2 s1=new Student2();
        s1.show();
        Student2 s2=new Student2("zhangfei",80);
        s2.show();
    }
}
