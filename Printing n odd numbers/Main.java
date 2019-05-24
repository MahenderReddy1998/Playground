import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count=1;
      for(int temp=1;temp<=n;count++)
      {
        if(count%2==1)
        {
          System.out.println(count);
          temp++;
	}
        
}
    }
}