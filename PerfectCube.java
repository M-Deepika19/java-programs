import java.util.Scanner;
public class PerfectCube{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int cube=(int)Math.round(Math.cbrt(num));
        int result=cube*cube*cube;
        if(result==num){
            System.out.println("perfect cube");
        }
        else{
            System.out.println("no perfect cube");
        }
    }
}