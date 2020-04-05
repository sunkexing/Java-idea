package com.bit.demo5;

import java.util.Arrays;

class Student implements Comparable<Student>{//自定义类型比较，需要实现Comparable这个接口
    public String name;
    public int age;
    public int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
//        if(this.age<o.age){
//            return -1;
//        }
//        if(this.age==o.age){
//            return 0;
//        }
//        return 1;
        //return this.age-o.age;//年龄从小到大比较，this.age-o.age
        //return this.score-o.score;//分数从小到大比较
        //return this.name.compareTo(o.name);//字符串的比较大小(字母)
        return o.age-this.age;//年龄从大到小比较
    }

    @Override
    public String toString() {//重写toString,为了下面使用
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

}
public class TestDemo2 {
    //对自定义类型进行比较排序
    public static void main(String[] args) {
        Student[] students= new Student[3];
        students[0]=new Student("张一",18,100);
        students[1]=new Student("张二",10,38);
        students[2]=new Student("张三",13,66);
        Arrays.sort(students);//把数组中的元素转化为字符串的时候，会调用Student的toString()
        System.out.println(Arrays.toString(students));
    }

    public static void main1(String[] args) {
        int[] array={18,1,8,4,6,10};
        Arrays.sort(array);//底层调用了compare to方法
        System.out.println(Arrays.toString(array));
    }
}
