public class TowerHanio {
    public static void move(char pos1,char pos2){
        System.out.println(pos1+"--->"+pos2+" ");
    }
    public static void hanio(int n,char pos1,char pos2,char pos3){
        if(n==1){
            move(pos1,pos3);
            return;
        }
        hanio(n-1,pos1,pos3,pos2);//开始位置,中途转接依靠位置,目的位置
        move(pos1,pos3);
        hanio(n-1,pos2,pos1,pos3);
    }
    public static void main(String[] args) {
        hanio(1,'A','B','C');
        System.out.println();
        hanio(2,'A','B' ,'C');
        System.out.println();
        hanio(3,'A','B' ,'C');
        System.out.println();
        hanio(4,'A','B' ,'C');
    }


}
