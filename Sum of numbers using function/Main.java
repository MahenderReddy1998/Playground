import java.util.Scanner;
class Main{
  void ss(int m)
  {
    int count=0;
    for(int i=0;i<=m;i++)
    {
      count=count+i;
    }
    System.out.println(count);
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int m=in.nextInt();
      Main ob=new Main();
      ob.ss(m);
	}
}
