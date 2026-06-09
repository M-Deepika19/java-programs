import java.util.Scanner;
public class BinaryToDecimal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int base=1;
        while(num>0){
            sum=sum+(num%10)*base;
            base=base*2;
            num=num/10;
        }
        System.out.print(sum);
    }
}
