package com.bit.src1;
//final public class Animal {//final修饰类，密封类，限制继承
public class Animal {
    public String name;
    public void eat(){
        System.out.println(this.name+"正在吃");
    }
    public int age;//不能被访问

    //先给父类构造方法
    public Animal(String name){
        this.name=name;
        //super();//子类并没有调用
    }

    public Animal(int age) {
        this.age = age;
    }//子类只能调用父类的一个构造方法

    protected String sex;

    int count;//默认权限，包访问权限

}
