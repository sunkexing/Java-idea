package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{//增加   都有work  可写成接口，每个函数用到work 并且方便发生向上转型

    @Override
    public void work(BookList bookList) {
        System.out.println("新增书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入图书的名字");
        String name=scanner.nextLine();
        System.out.println("请输入图书的作者");
        String author=scanner.nextLine();
        System.out.println("请输入图书的价格");
        int price=scanner.nextInt();//nextInt和nextLine不能同时使用
        System.out.println("请输入图书的类型");
        String type=scanner.next();//只能改为next

        Book book=new Book(name,author,price,type);
        int curSize=bookList.getUsedSize();
        bookList.setBooks(curSize,book);
        bookList.setUsedSize(curSize+1);
        System.out.println("新增图书成功！");
    }
}
