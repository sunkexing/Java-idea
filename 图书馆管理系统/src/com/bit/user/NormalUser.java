package com.bit.user;

import com.bit.operation.*;

import java.util.Scanner;

public class NormalUser extends User{//普通用户

    public NormalUser(String name) {
        super(name);
        //普通用户对应操作
        this.Operations=new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new BorrwoOperation(),
                new ReturnOperation(),
        };
    }

    public int menu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("hello"+this.name+"欢迎来到图书系统");
        System.out.println("========1.查找图书======");
        System.out.println("========2.借阅书籍=======");
        System.out.println("========3.归还书籍=======");
        System.out.println("========0.退出系统=======");
        int choice=scanner.nextInt();
        return choice;
    }
}
