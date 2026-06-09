import java.util.Scanner;
public class EvilNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int count=0;
        while(temp>0){
            int rem=temp%2;
            if(rem==1){
                count++;
            }
            temp=temp/2;
        }
        if(count%2==0){
            System.out.println("evil number");
        }
        else{
            System.out.println("no evil number");
        }
    }
}