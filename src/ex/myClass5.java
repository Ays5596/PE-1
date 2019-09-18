package ex;
import java.util.Scanner;
public class myClass5 {
    public static void main(String [] args){
        Scanner num = new Scanner(System.in);
        int sum =0;
        int n;
        while((n=num.nextInt())!=0){
            sum = sum + n;
        }
        System.out.printf("%d",sum);
    }
}
