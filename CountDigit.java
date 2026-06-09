import java.util.Scanner;
public class CountDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=String.valueOf(num).length();
        System.out.print(count);
    }
}