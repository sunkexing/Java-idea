import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//小明想从一段英文短文中提取潜在的年份信息，待匹配的年份的范围为1000年至3999年，包含1000和3999。
//
//输入一段英文短文，按出现次序输出所提取到的所有可能的年份字符串。

//输入描述： 单组输入，输入一段英文短文，可能包含字母大小写，标点符号及空格。（不超过2000个字符）
//
//输出描述： 输出所提取到的所有可能的年份字符串，两两之间用一个空格隔开。
public class Test {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        List<Integer> res= new ArrayList<>();
        String input=in.nextLine();
        in.close();//获取键盘输入值
        int count=0;//计数count
        for (int i = 0; i <input.length() ; i++) {
            if(input.charAt(i)>='0' && input.charAt(i)<='9'){//charAt(int index)方法是一个用来检索特定索引下的字符的String实例的方法
                if(count==0 && input.charAt(i)=='0'){
                    continue;
                }else {
                    count++;
                }
            }else {
                if(count==4){
                    res.add(Integer.parseInt(input.substring(i-count,i)));//int的封装integer
                    /*
                    xx.substring()括号中带的参数不一样，效果就会有很大的区别，详细如下：

                    xx.substring(0,2)表示取第一个和第二个字符（0,1,2表示第一、二、三个字符，含头不含尾的原则就只包含第一、二个字符），返回一个新的字符串（只包含指定的第一和第二个字符）；

                    xx.substring(2)表示去掉前两个字符，返回一个新的字符串（只包含去掉前两个字符后剩下的字符串）
                     */
                }
                count=0;
            }
        }
        if (count==4){
            res.add(Integer.parseInt(input.substring(input.length()-count,input.length())));
        }
        boolean first=true;
        for (Integer s:res){//for each循环   遍历
            if(s<=3999 && s>=1000){
                if (first){
                    System.out.print(s);
                    first=false;
                }else {
                    System.out.print(" "+s);
                }
            }
        }
    }
}
