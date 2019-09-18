package ex;
import java.util.Scanner;
public class myClass8 {
    public static void main(String [] args){
        int N = 78;
        System.out.print("Enter the number from 1-100\n");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        for(;N!=n;) {
            if(N<n)
            {  System.out.println("Number guessed is more than original number\n");
               n = num.nextInt();
            }
            else if(N>n)
            {  System.out.println("Number guessed is less than original number\n");
               n = num.nextInt();
            }
        }
        if(N == n)
            System.out.println("Number guessed  matches the original number\n");

    }
}
