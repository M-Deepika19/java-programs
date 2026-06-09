import java.util.Scanner;
public class AutomorphicNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int square=num*num;
        int digit=String.valueOf(num).length();
        int mod=(int)Math.pow(10,digit);
        if(square%mod==num){
            System.out.println("automorphic number");
        }
        else{
            System.out.println("no automorphic number");
        }
    }
}