package ex;
import java.util.Scanner;
public class myClass6 {
    public static void main(String [] arg){
        Scanner ch = new Scanner(System.in);
        char x = ch.next().charAt(0);

        if(x>=48 & x<=57)
            System.out.println("Digit");
        else if(x>=65 & x<=90)
            System.out.println("Capital letter");
        else if(x>=97 & x<=122)
            System.out.println("Small letter");
        else
            System.out.println("Special symbol");
    }
}
