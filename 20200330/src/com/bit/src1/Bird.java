package com.bit.src1;

public class Bird extends Animal{
//    public String name;
//    public void eat(){
//        System.out.println(this.name+"正在吃");
//    }

    public int age;

    //子类构造方法
    public Bird(String name,int age) {
        // 首先 需要构造父类  用 super //代表调用父类的带有一个参数的构造方法,只能调用一次，放在第一行
        //super("sa");
        super(name);//子类并没有继承父类的构造方法，只是在子类当中通过super进行了显示的调用

        //再构造子类
        this.age=age;
    }

    public void fly (){
        System.out.println(this.name+"正在飞");//name可以使用  因为继承了父类
        System.out.println(super.name);
        super.eat();
    }

    public void testProtected(){
        System.out.println(this.sex);//可以访问
    }


}
