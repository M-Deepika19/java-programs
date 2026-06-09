import java.util.Scanner;
public class Swap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=b;
        b=a;
        a=c;
        System.out.print(a+" "+b);
    }
}