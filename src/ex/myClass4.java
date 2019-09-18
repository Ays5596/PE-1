package ex;
import java.util.Scanner;
public class myClass4 {
    public static void main(String [] args){
          Scanner num = new Scanner(System.in);
          int n = num.nextInt();
          for(int i =1; i<=n;i++)
          {  for(int j=1;j<=i;j++)
              {
                  System.out.printf("%d ",i);
              }
          }
    }
}
