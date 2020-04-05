package com.bit.demo5;

import org.omg.CORBA.PUBLIC_MEMBER;
interface A{
   void  func1();
}
//interface B implements{接口是不能被接口实现的
//
//}
interface B extends A{//接口之间可以通过extends联系
    void func2();
}
interface C extends B,A{
    //一个借口可以extends多个接口
    void func3();
}
class AA implements C{
    @Override
    public void func1() {

    }

    @Override
    public void func2() {

    }

    @Override
    public void func3() {

    }
}



//多个接口使用实例，将功能进行独立
class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
}
interface IFlying {
    void fly();
}
interface IRunning {
    void run();
}
interface ISwimming {
    void swim();
}
//一个类可以继承父类的同时实现多个接口
class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用四条腿跑");
    }
}

class Frog extends Animal implements IRunning, ISwimming {
    public Frog(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在往前跳");
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在蹬腿游泳");
    }
}
class Robot  implements IRunning{
    private  String name;
    public Robot(String name){
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在用轮子跑");
    }
}
public class TestDemo {
    public static void walk(IRunning iRunning){
        iRunning.run();
    }
    public static void swim(ISwimming iSwimming){
        iSwimming.swim();
    }
    public static void main(String[] args) {
        Cat cat=new Cat("小花");
        walk(cat);
        Frog frog=new Frog("小青");
        walk(frog);
        swim(frog);
        Robot robot=new Robot("小机");
        walk(robot);
    }
}
