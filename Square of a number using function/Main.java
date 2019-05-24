import java.util.Scanner;
class Main
{
   void square(int m)
  {
     int n;
     n=m*m;
      System.out.println(n);
  
    
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int m=in.nextInt();
      Main ob=new Main();
      ob.square(m);
     
      
	} 
 
}