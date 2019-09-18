package ex;
import java.util.Scanner;
public class myClass3 {
    public static void main(String [] args){
        Scanner ch = new Scanner(System.in);
        String a = ch.nextLine();
        int l = a.length();

        char c;
        if(check(a)){
            for(int i=0;i<l;i++)
            {  c = a.charAt(i);
                if(c=='a' | c=='A' | c=='u' | c=='U' | c=='o' | c=='O' | c=='i' | c=='I' | c=='e' | c=='E')
                    System.out.println("Vowel");
               else
                   System.out.println("Consonant");
            }

        }
        else
            System.out.println("Error!");
    }
    public static boolean check(String a){
        int l = a.length();
        for(int i=0;i<l;i++)
        {
            if(a.charAt(i) > 47 & a.charAt(i) < 58)
                return false;
        }
        return true;
    }
}

