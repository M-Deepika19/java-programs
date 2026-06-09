import java.util.Scanner;
public class SunnyNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num+1;
        int sqrt=(int)Math.sqrt(temp);
        int result=sqrt*sqrt;
        if(result==temp){
            System.out.println("sunny number");
        }
        else{
            System.out.println("no sunny number");
        }
    }
}