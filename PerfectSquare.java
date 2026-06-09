import java.util.Scanner;
public class PerfectSquare{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int square=(int)Math.sqrt(num);
        int result=square*square;
        if(result==num){
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("no perfect square");
        }
    }
}