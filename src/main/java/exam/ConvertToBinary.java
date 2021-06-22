import java.util.Scanner;
public class ConvertToBinary
{
  public static void main(String[]args)
  {
    int n,m;
    String x="";
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the decimal number:");
    n=s.nextInr();
    while(n>0)
    {
      int a=n%2;
      x=a+x;
      n=n/2;
    }
    system.out.println(x);
  }
