import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int sum=0;
        int digit=String.valueOf(num).length();
        while(num>0){
             int rem=num%10;
            sum=sum+(int)Math.pow(rem,digit);
            num=num/10;
        }
        if(sum==original){
            System.out.print("armstrong number");
        }
        else{
            System.out.print("no armstrong number");
        }
    }
}