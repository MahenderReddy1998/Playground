import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int size=in.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<=size-1;i++)
    {
      arr[i]=in.nextInt();
  }
    int max;
    if(arr[0]>arr[1])
      max=0;
    else
      max=1;
    for(int i=2;i<=size-1;i++)
    {
      if(arr[max]<arr[i])
        
        max=i;
    }
    System.out.println(max);
  } 
}