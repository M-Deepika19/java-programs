import java.util.Scanner;
public class BinaryAddition{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        System.out.print(Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2)));
    }
}