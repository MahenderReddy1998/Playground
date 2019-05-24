import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int large=gcd(n1,n2);
      int hcf=gcd(large,n3);
      System.out.println(hcf);
	    // Type your code here
	}
  public static int gcd(int n1,int n2)
  {
int min,k=0;
    if(n1<n2)
    {
      min=n1;
    }
    else
    {
      min=n2;
  }
    if((n1%min==0)&&(n2%min==0))
    {
      k=min;
     
    }
    min--;
    return k;
    
  
}
}