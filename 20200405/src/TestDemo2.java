//自定义异常

class MyException extends Exception{
    //class MyException extends  RuntimeException自定义  运行时期异常（非受查异常）
    //class MyException extends Exception  编译异常（受查异常）

    public MyException(String message) {
        super(message);
    }
}

//用异常模拟密码输入
class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}
class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

public class TestDemo2 {
    private static String userName = "admin";
    private static String password = "123456";


    public static void login(String userName, String password) throws UserException,
            PasswordException {
        if (!TestDemo2.userName.equals(userName)) {//  !为非
            throw new UserException("用户名错误");
        }
        if (!TestDemo2.password.equals(password)) {
            throw new PasswordException("密码错误");
        }
        System.out.println("登陆成功");
    }


    public static void main(String[] args) {
        try {
            login("admin", "123456");
        } catch (UserException | PasswordException userError) {
            userError.printStackTrace();
        }/* catch (PasswordException passwordError) {
            passwordError.printStackTrace();
        }*/
    }



    public static void func(int a){
        try {
            if(a==10){
                throw new MyException("十六班加油！！");
            }
        }catch (MyException e){
            e.printStackTrace();
            System.out.println("捕获MyException异常");
        }

    }
    public static void main1(String[] args) {
        func(10);
    }
}
