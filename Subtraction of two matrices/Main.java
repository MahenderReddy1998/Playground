import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int m[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        m[i][j]=in.nextInt();
      }
    }
    int m1[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        m1[i][j]=in.nextInt();
      }
    }
    int sub[][]=new int[r][c];
    for(int i=0;i<sub.length;i++)
    {
      for(int j=0;j<sub.length;j++)
      {
        sub[i][j]=m[i][j]-m1[i][j];
      
    
    System.out.print(sub[i][j]+" ");
      }
      System.out.println(" ");
    }
    
      
  }
}