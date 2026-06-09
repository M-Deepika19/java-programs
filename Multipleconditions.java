import java.util.Scanner;
public class Multipleconditions{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>=35){
            else if(mark>=90){
                System.out.println("a+ grade");
            }
            else if(mark>=80){
                System.out.println("a grade");
            }
            else if(mark>=70){
                System.out.println("b+ grade");
            }
            else if(mark>=60){
                System.out.println("b grade");
            }
            else if(mark>=50){
                System.out.println("c grade");
            }
        }
            else {
                System.out.println("fail");
            }
    }
}