class A{

}

class Person{//声明了一个类（Person）   是引用类型
    //属性(成员变量)
    public  String name;
    //public 访问修饰限定符
    public int age=11;
    public  boolean flg;


    public static int count;//在内存的方法中，只有一份  存放在方法区
    public final int SIZE=10;//常量-》不能被修改的  属于对象
    public static final int SIZE2=100;//常量   不属于对象  一样，static修饰 存放在方法区
    public A a;


    //行为(成员方法)
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void show(){
        System.out.println("我叫:"+name+" 年龄："+age);
    }
    public static void func(){
        count++;
        System.out.println("static :func"+SIZE2);
    }
}




public class TestDemo {
    public static void function(){
        System.out.println("static:function");
    }
    public static void main(String[] args) {
        Person.func();
        Person person1=new Person();
        System.out.println(person1.age);
        function();
    }


    public static void main2(String[] args) {
        Person person1=new Person();
        person1.age=99;
        person1.show();
        System.out.println(Person.count);
        Person.func();
        System.out.println(Person.SIZE2);
        System.out.println(person1.SIZE);
    }

    public static void main1(String[] args) {
        Person person1=new Person();
        person1.name="李四";
        Person person2=new Person();
        person2.name="王麻子";
        Person person3=new Person();//实例化一个类，new关键字
        person3.name="张三";

        System.out.println(person3.age);
        System.out.println(person3.name);
        System.out.println(person1.name);
        person3.eat();
        person1.sleep();
        System.out.println(person3.flg);
        person1.show();
        System.out.println("Person="+Person.count);//count 用static修饰了 ，用类引用
        System.out.println(person1.SIZE);
        System.out.println(Person.SIZE2);
    }
}
