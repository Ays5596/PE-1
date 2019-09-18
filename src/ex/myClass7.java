package ex;
import java.util.Scanner;
public class myClass7 {
    public static void main(String [] args){
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int l=0,m=n;
        for(int i=0;m != 0;i++)
        {   l++;
            m = m/10;
        }
        System.out.printf("%d\n",l);

        int[] arr = new int[l];
        for(int i=0;n!=0 ;i++)
        {   arr[i] = n%10;
            n = n/10;
        }
        int sum = cal(arr);
        int number = sort(arr);
        System.out.printf("Sorted number in non-increasing order : %d\n",number);
        System.out.printf("and the sum of all even numbers : %d\n",sum);
        if(sum > 15)
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static int sort(int[] a){
        int l = a.length;
        System.out.printf("%d\n",l);
        int n = 0;
        for(int i=0;i<l;i++)
        {   for(int j=i+1;j<l;j++)
          {    if(a[i] < a[j]){
               int temp = a[i];
               a[i] = a[j];
               a[j] = temp;
              }
          }
        }
        n = a[0];
        for(int i=1;i<l;i++)
        {
            n = n*10 + a[i];
        }
        return n;
    }
    public static int cal(int[] a){
        int l = a.length;
        int s = 0;
        for(int i=0;i<l;i++)
        {
            if(a[i]%2 == 0)
                s = s + a[i];
        }
        return s;
    }
}
