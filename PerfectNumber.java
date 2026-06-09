import java.util.Scanner;
public class PerfectNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        System.out.print(sum);
        if(sum==original){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("no perfect Number");
        }
    }
}