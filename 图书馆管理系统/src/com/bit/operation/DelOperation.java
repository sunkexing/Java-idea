package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{//删除

    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要删除书籍的名字");
        String name=scanner.nextLine();
        for (int i=0;i<bookList.getUsedSize();i++){
                Book book=bookList.getBook(i);
                if(book.getName().equals(name)){
                    if(i+1<bookList.getUsedSize()){
                        bookList.setBooks(i,bookList.getBook(i+1));
                        bookList.setUsedSize(bookList.getUsedSize()-1);
                    }
                }
        }
        System.out.println("删除成功");
        if(bookList.getUsedSize()==0 ){
            System.out.println("删除失败");
        }
    }
}
