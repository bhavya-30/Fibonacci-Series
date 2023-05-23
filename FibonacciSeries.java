package fibonacciseries;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
       int n;
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
       int a=0,b=1,c;
       System.out.print(a+","+b+",");
       for(int i=0;i<n-2;i++)
       {
           c=a+b;
           System.out.print(c+",");
           a=b;
           b=c;
       }
    }
    
}
