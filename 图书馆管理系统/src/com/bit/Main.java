package com.bit;

import com.bit.book.BookList;
import com.bit.user.AdminUser;
import com.bit.user.NormalUser;
import com.bit.user.User;


import java.util.Scanner;


public class Main {
    public static User login(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入你的姓名");
        String name=scanner.nextLine();//读入一行
        System.out.println("输入你的身份：1-管理员  0-普通用户");
        int num=scanner.nextInt();
        if(num==1){
            return new AdminUser(name);
        }else {
            return new NormalUser(name);
        }
    }



    public static void main(String[] args) {
        //1.准备书籍
        BookList bookList=new BookList();
        //2.登录
        User user=login();

        while (true) {
            //写个死循环

            int choice=user.menu();//user  如果父类不声明menu  就无法访问menu   更不能打印出对应的menu
            //3.根据你的选择  确定调用哪个操作方法
            user.doOperation(choice,bookList);
        }



    }
}
