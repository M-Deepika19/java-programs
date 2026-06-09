import java.util.Scanner;
public class OctalToBinary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int decimal=Integer.parseInt(String.valueOf(num),8);
        System.out.print(Integer.toBinaryString(decimal));
    }
}