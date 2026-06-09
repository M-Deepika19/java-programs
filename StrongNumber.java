import java.util.Scanner;
public class StrongNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            int fact=1;
            for(int i=1;i<=rem;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;
        }
        if(sum==original){
            System.out.println("Strong number");
        }
        else{
            System.out.println("not a strong number");
        }
    }
}