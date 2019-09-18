package ex;
import java.util.Scanner;
public class myClass9 {
    public static void main(String [] args){
        Scanner str = new Scanner(System.in);
        String s = str.next();
        int l = s.length();
        char[] s1 = new char[l];
        for(int i=0;i<l;i++)
            s1[i] = s.charAt(l - 1 - i);
        System.out.print(s1);
    }
}
