import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      String c="";
      for(int i=str.length()-1;i>=0;i--)
      {

    c=c+str.charAt(i);  
    } 
      
      if(str.equals(c))
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
}
}