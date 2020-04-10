package com.bit.user;

import com.bit.operation.*;
import com.sun.org.apache.xpath.internal.operations.Operation;

import java.util.Scanner;

public class AdminUser extends User{//管理员用户   都有name 那么可以用一个继承形式完成
    //继承抽象类User
    public AdminUser(String name){
        super(name);
        //数组中存放的 AdminUser 管理员对应的操作
        this.Operations=new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }

   public int menu(){
       Scanner scanner=new Scanner(System.in);
       System.out.println("hello"+this.name+"欢迎来到图书系统");
       System.out.println("========1.查找图书======");
       System.out.println("========2.增加书籍=======");
       System.out.println("========3.删除书籍=======");
       System.out.println("========4.打印书籍=======");
       System.out.println("========0.退出系统=======");
       int choice=scanner.nextInt();
       return choice;
   }
}
