import java.util.Scanner;
public class CountOccurence{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem==3){
                count++;
            }
            num=num/10;
        }
        System.out.print("the count of a number is:"+count);
    }
}