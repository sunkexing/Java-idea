class Student3{
    private String name;
    private int age;

    public Student3(){//没有参数
        //this调用构造函数
        this("bit",2);//必须放在第一行显示
    }

    //这两个构造函数之间的关系为重载
    public Student3(String name,int age){//有2个参数
        this.name=name;
        this.age=age;
    }

    public void show(){
        System.out.println("name="+name+",age="+age);
    }
}

public class TestDemo4 {
    public static void main(String[] args) {
        Student3 s1=new Student3();//调用不带参数的构造函数
        s1.show();
    }
}
