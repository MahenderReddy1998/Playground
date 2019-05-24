import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    //type your code;
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<=n-1;i++)
    {
      arr[i]=in.nextInt();
    }
    int mid=n/2;
    for(int j=0;j<mid-1;j++)
    {
      for(int i=0;i<mid-1-j;i++)
    {
      if(arr[i]>arr[i+1])
      {
      int temp=arr[i];
      arr[i]=arr[i+1];
        arr[i+1]=temp;
            }
    }
    }
            for(int i=0;i<n;i++)
            {
              System.out.print(arr[i]+" ");
            }
  
   
                       
  }
}