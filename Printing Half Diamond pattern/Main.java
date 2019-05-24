import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int row=1;row<=n;row++)
      {
        for(int space=1;space<=(n-row);space++)
        {
System.out.print(" ");
	}
        for(int col=1;col<=row*2-1;col++)
        {
          System.out.print("*");
          
}
        System.out.print("\n");
      }
    }
}