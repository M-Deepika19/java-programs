import java.util.Scanner;
public class MixedNumberPyramid{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int k=1;k<=2*(num-i);k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
            System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=num-1;i>=1;i--){
            for(int k=1;k<=2*(num-i);k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
            System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}