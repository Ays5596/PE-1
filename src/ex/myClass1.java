package ex;
import java.util.Scanner;
public class myClass1 {
    public static void main(String [] args){
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int l=0,m=n;
        int number = n;
        for(;m != 0;){
            l++;
            m = m/10;
        }

        int[] a = new int[l];
        for(int i=0;i<l;i++){
            a[i] = n%10;
            n = n/10;
        }

        int c=0;
        for(int i=0;i<l;i++)
        {   if(a[i]!=a[l-1-i])
            {  System.out.printf("%d is not palindrome\n",number);
               c++;
               break;
            }
        }
        int sum = 0;
        if(c==0){
            System.out.printf("%d is palindrome ",number);
            for(int i=0;i<l;i++)
            {   if(a[i]%2 == 0)
                   sum = sum + a[i];
            }
            System.out.printf("%d",sum);
            if(sum < 25)
                System.out.printf(" and sum of even numbers is less than 25\n");
            else
                System.out.printf(" and sum of all even numbers is grrater than 25\n");
        }
    }
}
