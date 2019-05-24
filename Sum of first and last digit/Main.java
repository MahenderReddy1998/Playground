import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int m=n%10;
      int rev=0;
      for(;n!=0;n=n/10)
      {
        int p=n%10;
        rev=rev*10+p;
	}
      int q=rev%10;
      int sum=m+q;
      System.out.println(sum);
}
}