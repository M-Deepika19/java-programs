import java.util.Scanner;
public class AutobiographicNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        int n=num.length();
        boolean isAuto=true;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(num.charAt(j)-'0'==i){
                    count++;
                }
            }
            if(count!=num.charAt(i)-'0'){
                isAuto=false;
                break;
            }
        }
        if(isAuto){
            System.out.println("autobiographic number");
        }
        else{
            System.out.println("not a autobiographic number");
        }
    }
}