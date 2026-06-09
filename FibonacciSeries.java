import java.util.Scanner;
public class FibonacciSeries{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int count=1;
        System.out.print(a);
        while(count<=num){
        System.out.print(" "+b);
        int temp=b;
        b=a+b;
        a=temp;
        count++;
        }
        System.out.println();
    }
}
