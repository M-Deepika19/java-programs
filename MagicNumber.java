import java.util.Scanner;
public class MagicNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=num;
        while(sum>9){
            int temp=sum;
            sum=0;
            while(temp>0){
                sum=sum+temp%10;
                temp=temp/10;
            }
        }
        if(sum==1){
            System.out.println("magic number");
        }
        else{
            System.out.println(" not a magic number");
        }
    }
}