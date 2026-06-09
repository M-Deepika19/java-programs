import java.util.Scanner;
public class NeonNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int square=num*num;
        int sum=0;
        while(square>0){
            int rem=square%10;
            sum=sum+rem;
            square=square/10;
        }
        if(sum==original){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("not a neon number");
        }
    }
}