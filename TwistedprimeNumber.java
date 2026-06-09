import java.util.Scanner;
public class TwistedprimeNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans=ans*10+rem;
            num=num/10;
        }
        int count=0;
        for(int i=1;i<=ans;i++){
            if(ans%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("twisted prime number");
        }
        else{
            System.out.println("not a twisted prime number");
        }
    }
}