import java.util.Arrays;

class Book{
    private String name;
    private String author;
    private int price=8;
    private static int count=0;

    static {
        /*this.author="罗贯中" ;
        this.name="三国演义";
        this.price=80;
        在静态代码块中，是不可以初始化普通成员变量的，原因：static不依赖于对象
        */

        count=99;
        System.out.println("静态代码块");
    }

    {
        /*this.author="罗贯中" ;
        this.name="三国演义";
        this.price=80;
        count=99;
        普通代码块是可以初始化静态和非静态成员变量的，但是代码块一般不用来初始化
         */
        System.out.println("普通/实例代码块");
    }

    public Book(){
        System.out.println("没有参数的构造方法 Book()");
    }

    public Book(String name,String author,int price){
        this.author="罗贯中";
        this.name="三国演义";
        this.price=100;
        System.out.println("设置了三个参数的构造方法（这里体现了方法的重载） Book(String String int)");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("书名:"+name+"作者:"+author+"价格:"+price);
    }

    @Override
    public String toString() {//重写Object toString方法
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}



public class TestDemo {
    public static void func(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static  int sum(int  a ,int b){
        return a+b;
    }
    public static  int sum(int a,int b,int c){
        return a+b+c;
    }
    //可变参数编程
    public static int sum(int...array){
        int ret=0;
        for (int x:array) {
            ret+=x;
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        System.out.println(sum(array));
        System.out.println(sum(new int[]{1,2,3,4,5}));
        int ret=sum(1,2,3,4,5);
        System.out.println(ret);
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1));
        func(array);
    }

    public static void main3(String[] args) {
        Book book=new Book("三国演义","罗贯中",12);
        System.out.println("==============");
        book.show();
        System.out.println("==============");
        System.out.println(book);//地址的哈希值，原因：调用的是Object的toString方法
        //可以使用toString这样的方法将对象自动转化为字符串
        System.out.println("==============");
        new Book().show();//匿名数组  .调用，只能用一次，下次需要重新new
        System.out.println("==============");
        String s=new Book().toString();
        System.out.println(s);



    }


    public static void main2(String[] args) {
        Book book=new Book();
        book.setName("水浒传");
        System.out.println(book.getName());//没有setNeme  -》 null
        System.out.println("=================");
        Book book2=new Book();//优先执行静态代码块,只会执行一次
    }

    public static void main1(String[] args) {
        Book book=new Book();
        book.setName("bit");
        System.out.println(book.getName());
        //Book book1=new Book();
    }
}
