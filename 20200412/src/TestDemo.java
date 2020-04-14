import java.util.ArrayList;
import java.util.List;

public class TestDemo {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        if(numRows<=0){
            return  result;
        }
        // 处理第一行的情况, 就固定只有一个 1
       ArrayList<Integer> firstLine=new ArrayList<>();
        firstLine.add(1);
        result.add(firstLine);
        if(numRows==1){
            return  result;
        }
        // 处理第二行的情况. 就固定只有两个 1
        ArrayList<Integer> secondLine=new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);
        if(numRows==2){
            return result;
        }
        // 处理后面的行
        // 第 i 行的相关规律
        // a) 第1列和最后1列都是1
        // b) 第 i 行有 i 列
        // c) i, j = (i - 1, j - 1) + (i - 1, j)
        for (int row=3;row<=numRows;row++){
            // 需要构造第 row 行的内容, 构造第 row 行内容依赖 row - 1 行
            List<Integer> prevLine=result.get(row-1-1);
            List<Integer> curLine=new ArrayList<>();
            // 当前行的第一列, 就是 1
            curLine.add(1);
            // 第 row 行一共有 col 列, 这个循环实际循环的次数是 row - 2 次
            for (int col=2;col<=row-1;col++){
                // 要计算 第 col 列的值, 需要知道上一行的 col - 1 列和 col 列.
                // 由于 col 是从 1 开始算的. 换算成 List 下标还得再 - 1
                int tmp1=prevLine.get(col-1-1);
                int tmp2=prevLine.get(col-1);
                curLine.add(tmp1+tmp2);
            }
            // 当前行的最后一列也是 1
            curLine.add(1);
            result.add(curLine);
        }
        return result;
    }

}
