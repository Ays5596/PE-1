package ex;
import java.util.Scanner;
public class myClass10 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int n = input.nextInt();
        int l = str.length();
        char[] arr = new char[n*n];
        System.out.print(str);
        for(int i=0;i<n;i++)
        {  for(int j=l-n;j<l;j++)
            System.out.printf("%c",str.charAt(j));
        }
    }
}
