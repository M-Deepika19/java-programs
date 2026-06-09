import java.util.Scanner;
public class DecimalToBinary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       System.out.print(Integer.toBinaryString(num)); 
    }
}