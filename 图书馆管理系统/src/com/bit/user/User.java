package com.bit.user;

import com.bit.book.BookList;
import com.bit.operation.IOperation;

//父类
public abstract class User {//抽象类更好
    public String name;


    public IOperation[] Operations;//这个数组当中保存每个对象对应的操作

    public User(String name) {
        this.name = name;
    }


    public abstract int menu();//如果不写  Main中无法访问   不能通过user访问到
    //发生运行时绑定
//    public int menu() {
//        return 0;
//    }



    public void doOperation(int choice, BookList bookList){
        //Operations[choice]--->拿到的是数组中元素的对象
        Operations[choice].work(bookList);//通过.调用操作方法
    }

}
