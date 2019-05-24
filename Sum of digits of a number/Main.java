import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int rev=0;
      for(;n!=0;n/=10)
      {
        int a=n%10;
        rev=rev+a;
         
	}
      System.out.println(rev);
}
}