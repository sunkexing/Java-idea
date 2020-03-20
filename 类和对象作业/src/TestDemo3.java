class Person{
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void show(){
        System.out.println("count:"+count);
    }

}
public class TestDemo3 {
    public static void main(String[] args) {
        Person person=new Person();
        person.setCount(88);
        int a=person.getCount();
        System.out.println(a);
        person.show();
    }
}
