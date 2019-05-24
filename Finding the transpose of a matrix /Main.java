import java.util.Scanner;
class Main{
  public static void main(String args[]){
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
    int t[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        t[j][i]=m[i][j];
        System.out.print(t[j][i]+" ");
    
  }
      System.out.println(" ");
}
  }
}