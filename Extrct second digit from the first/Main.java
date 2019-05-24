import java.util.*;
class Main
{
  public static void main(String args[])
  {
Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int rev=0;
    for(;n!=0;n/=10)
    {
      int m=n%10;
      rev=rev*10+m;
    }
    int p=rev%100;
    int q=p/10;
    System.out.println(q);
  }
}