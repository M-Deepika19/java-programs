import java.util.Scanner;
public class SpyNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int product=1;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            product=product*rem;
            num=num/10;
        }
        if(sum==product){
            System.out.println("Spy number");
        }
        else{
            System.out.println("no spy number");
        }
    }
}