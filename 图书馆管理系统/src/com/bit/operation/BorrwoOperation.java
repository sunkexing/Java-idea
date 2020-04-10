package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

import java.util.Scanner;

public class BorrwoOperation implements IOperation{//借阅

    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要借阅的书籍：");
        String name=scanner.nextLine();

        for (int i = 0; i <bookList.getUsedSize() ; i++) {
            Book book=bookList.getBook(i);
            if(book.getName().equals(name)){
                //说明有这本书

                if(book.isBorrowed()){
                    System.out.println("已经被借出去了");
                }else {
                    book.setBorrowed(true);
                    System.out.println("借阅成功");
                    return;
                }
            }
        }
        System.out.println("没有这本书！");

    }
}
