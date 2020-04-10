package com.bit.operation;

import com.bit.book.BookList;

public class DisplayOperation implements IOperation{//显示
    @Override
    public void work(BookList bookList) {
        System.out.println("显示书籍");
        for (int i = 0; i <bookList.getUsedSize() ; i++) {
            System.out.println(bookList.getBook(i));
        }
    }
}
