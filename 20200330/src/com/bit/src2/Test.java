package com.bit.src2;

import com.bit.src1.Animal;


class Money{

}
class Person{
    public Money money;//组合  has-a
}


public class Test extends Animal{
    public static void main(String[] args) {

    }



    public Test(String name) {
        super(name);
    }
    public void func(){
        System.out.println(super.sex);
        //System.out.println(super.count);
    }

    public static void main1(String[] args) {
        Animal animal=new Animal("大黄");
        //System.out.println(animal.sex);
    }
}
