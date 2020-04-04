package com.bit.src3;

class Animal{
    public String name;
    //构造方法
    public Animal(String name) {
        this.name = name;
        //eat();
    }
    protected void eat(){
        System.out.println("Animal"+this.name+"正在吃");
    }
}

class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }
    public void fly(){
        System.out.println(this.name+"正在飞");
    }
    @Override  //注解 重写
    //sta修饰的静态方法不能被重写
    public void eat(){
        System.out.println("Bird"+this.name+"正在吃米");//发生重写
    }
}


class Cat extends  Animal{
    public Cat(String name) {
        super(name);
    }
}

public class TestMain {

    //面试问题：构造函数能发生运行时绑定（多态）？
    public static void main(String[] args) {
        Animal animal=new Animal("将军");
        System.out.println();
        Animal bird=new Bird("将军2");
    }

    //演示向下转型不安全事例
    public static void main6(String[] args) {
        Animal animal=new Cat("咪咪");

        //此时可以用关键字instanceof判断,   改进：
        if(animal instanceof Bird){
            Bird bird=(Bird)animal;
            bird.fly();
        }
        /*
        //此时animal并不是Bird的一个引用,出异常
        Bird bird=(Bird)animal;
        bird.fly();//没报错，发生类型转换异常,要发生向下转型，必须先发生向上转型
         */
    }



    public static void main5(String[] args) {
        Animal animal=new Bird("将军");
        animal.eat();

        //animal.fly();错误，如果非要这么做：
        //向下转型
        Bird bird=(Bird) animal;
        bird.fly();
    }


    public static void main4(String[] args) {
        Animal animal=new Bird("将军");
        animal.eat();//  动态绑定 前提：1，发生向上转型 2，发生重写  3，通过父类引用调用该重写方法
        // 运行时调用子类方法，编译时调用父类方法
    }







    //返回值发生向上转型
    public Animal func2(){
        //return new Bird("愤怒");
        Bird bird=new Bird("愤怒");
        return bird;
    }


    //传参发生向上转型
    public static void func(Animal animal){
        animal.eat();
    }
    public static void main3(String[] args) {
        Bird bird=new Bird("小诺");
        func(bird);
    }

    //直接赋值发生向上转型
    public static void main2(String[] args) {
        Animal animal=new Bird("初一");//向上转型：父类引用引用了子类对象，即把子类对象赋值给父类
        animal.eat();
        //animal.fly();错误，发生向上转型，通过父类引用，只能引用父类自己的方法、属性
    }

    public static void main1(String[] args) {
        Animal animal=new Animal("将军");

        Bird bird=new Bird("初一");

        Cat cat=new Cat("咪咪");
    }
}
