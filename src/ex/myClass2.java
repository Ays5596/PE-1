package ex;
import java.util.Scanner;
public class myClass2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a);

        if(a>20 &  a<30)
        {
            if(a%2 != 0)
                System.out.println("Tom");
            else
                System.out.println("Jerry");
        }

    }
}
