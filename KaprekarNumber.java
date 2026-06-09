import java.util.Scanner;
public class KaprekarNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int square=num*num;
        int digit=String.valueOf(num).length();
        int div=(int)Math.pow(10,digit);
        int right=square%div;
        int left=square/div;
        if(left+right==num){
            System.out.println("kaprekar number");
        }
        else{
            System.out.println("not a kaprekar number");
        }
    }
}