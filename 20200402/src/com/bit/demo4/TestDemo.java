package com.bit.demo4;
//接口:只有抽象方法，没有普通方法
/*
abstract class Shape{
    public abstract void draw();
}
注意事项：1.接口是用interface关键字修饰的
2.里面的属性必须是一个常量，默认是public static final类型的
3.里面的成员方法默认为抽象方法，public abstract
4.在接口当中不能被定义已经实现的方法 如：draw();
5.接口当中可以有实现的方法，但是需要关键字default修饰
6.类和接口的关系：实现 用关键字implements,而不用extends,可以实现多个接口,解决了java中的单继承问题
7.实现了该接口，一定要重写该接口的方法
8.接口仍然不可以被实例化
9.实现该接口重写方法时，一定不能省略
 */
interface IShape{
    //int b=10;//默认是public static final类型的
    //public static final int a=10;
    //public abstract void draw();
    void draw();
    //default void func(){加关键字default 可以具体实现方法
    //}
}
interface A{

}

class Cycle implements IShape,A {
    @Override
    public void draw() {
        System.out.println("一个圆");
    }
}
class Rect implements IShape {
    @Override
    public void draw() {
        System.out.println("一个矩形");
    }
}
class Flower implements IShape {
    @Override
    public void draw() {
        System.out.println("花花");
    }
}
public class TestDemo {
    public static void drawMap(IShape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        //接口也可以发生向上转型
        IShape shape=new Cycle();
        IShape shape2=new Rect();
        drawMap(shape);
        drawMap(shape2);
    }
}
