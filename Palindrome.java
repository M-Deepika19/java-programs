import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans=ans*10+rem;
            num=num/10;
        }
        if(ans==original){
            System.out.println("palindrome");
        }
        else{
            System.out.println("no palindrome");
        }
    }
}