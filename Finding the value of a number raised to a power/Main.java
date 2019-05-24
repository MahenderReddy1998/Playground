import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in=new Scanner(System.in);
      int base=in.nextInt();
      int expo=in.nextInt();
      int c=0;
      int n=1;
      while(c<expo)
      {
       n = n * base; 
          c++;
      }
      System.out.println(n);
      
      
      
    }
}
