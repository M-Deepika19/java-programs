import java.util.Scanner;
public class SquareNumberPattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                int value=Math.min(Math.min(i,j),Math.min((num-i+1),(num-j+1)));
                System.out.print((num-value)+" ");
            }
            System.out.println();
        }
    }
}