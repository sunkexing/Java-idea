class Student{
    private  String name;//封装，降低管理复杂程度，这样的好处是，就算name名字改了，也不影响下面调用
    private int age;
    /*
        //快捷键 alt+insert
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        */
    public void setName(String userName){//写个方法，用来调用，成员变量被设置为私有的，所以需要set来提供
        name=userName;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){//形参age为局部变量
        // age=age;//自己给自己赋值
        this.age=age;//加上this,表示当前实例的引用
    }
    public int getAge(){
        return age;
    }
}

public class TestDemo2 {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("曹操");
        System.out.println(student.getName());
        System.out.println("====================");
        student.setAge(99);
        System.out.println(student.getAge());
    }
}
