package com.bit.src1;

import java.util.Arrays;

class Student implements Comparable<Student>{//Comparable  比较接口
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override//重写compareTo方法
    public int compareTo(Student o) {
        return this.age-o.age;//从小到大排序
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student[] student=new Student[3];
        student[0]=new Student("sunkexing",23);
        student[1]=new Student("bit",11);
        student[2]=new Student("zhuxuying",21);
        System.out.println(Arrays.toString(student));
        Arrays.sort(student);//排序
        System.out.println(Arrays.toString(student));

    }
}
