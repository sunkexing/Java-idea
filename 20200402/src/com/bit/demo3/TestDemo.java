package com.bit.demo3;
abstract class Shape{
    //抽象方法:没有具体实现的方法
    public abstract void draw();//本来就写啥也没用，不想实现它可以加关键字abstract
    //可以拥有普通类的成员或者方法
    public int a;
    public void func(){
        System.out.println("func()");
    }
}
//1.用关键字abstract修饰，2.抽象类当中可以有普通类的所有属性,方法
//3.包含了抽象方法（没有具体实现的方法）,其他和普通方法都一样 4.不能被实例化，即不能new
//5.抽象类的主要作用是用来被继承的，不能被final修饰
//7.抽象方法不能说私有的private 或者静态static
//抽象类：包含抽象方法的类
class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("一个圆");
    }
}
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("一个矩形");
    }
}
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("花花");
    }
}
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("△");
    }
}

class A extends Shape{
    @Override
    public void draw() {
        //8.只要有一个类继承了这个抽象类，那么必须要重写抽象类当中的方法
    }
}

abstract class B extends Shape{
    //9.如果这个类不想重写抽象类里面的抽象方法，那么这个类可以设置为抽象类
}
class C extends B{//继承B
    //10.这里就必须要重写了
    @Override
    public void draw() {

    }
}

public class TestDemo {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        //也可以发生向上转型，只是改成了抽象类。用来继承
        Shape shape1=new Cycle();
        drawMap(shape1);
        Shape shape2=new Rect();
        drawMap(shape2);
    }
}
