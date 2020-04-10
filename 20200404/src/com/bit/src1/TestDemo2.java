package com.bit.src1;

class Money implements Cloneable{
    public int money=19;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

//克隆Person
class Person implements Cloneable{
    //面试问题：你知道Cloneable接口吗？为什么他是一个空接口(标志接口)?
    //如果一个类实现了Cloneable接口（标志接口）,代表这个类可以被克隆
    //然后重写Object的clone方法
    public int age;
    public Money m;
    public Person(int age) {
        this.age = age;
        m=new Money();
    }

    @Override  //alt+insert
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

//    @Override//第二步：重写Object的克隆   //ctrl+o  可自定义快捷键
//    protected Object clone() throws CloneNotSupportedException {//声明了一种异常
//        return super.clone();
//    }

    @Override//第二步：重写Object的克隆   //ctrl+o  可自定义快捷键
    protected Object clone() throws CloneNotSupportedException {//声明了一种异常
        Person person1=(Person) super.clone();//克隆person
        person1.m=(Money) this.m.clone();//克隆m
        return person1;//此时person m都被克隆  达成深拷贝
    }
}



public class TestDemo2 {

    public static void main(String[] args) throws CloneNotSupportedException{
        Person person=new Person(10);
        Person person1=(Person) person.clone();
        System.out.println(person.m.money);//19
        System.out.println(person1.m.money);//19
        System.out.println("=======================");
        person1.m.money=999;
//        System.out.println(person.m.money);//999  未加cloneable接口 并且没有被调用
//        System.out.println(person1.m.money);//999 未加cloneable接口 并且没有被调用
        System.out.println(person.m.money);//19
        System.out.println(person1.m.money);//999 money加了cloneable接口 并且通过两步，1 先克隆person 2 再克隆m
          // 被调用   达成深拷贝
    }



    public static void main1(String[] args) throws CloneNotSupportedException {
        Person person=new Person(10);
//   两种方法
//   1.
//   try {//处理异常
//            Person person1=(Person) person.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//   2.
        Person person1=(Person) person.clone();
        System.out.println(person.age);
        System.out.println(person1.age);
        person1.age=999;
        System.out.println("=========通过person1修改age===========");
        System.out.println(person.age);
        System.out.println(person1.age);

    }
}
