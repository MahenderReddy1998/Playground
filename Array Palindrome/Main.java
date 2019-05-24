import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<=size-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int l=0;
      int r=size-1;
      int p=1;
      while(l<=r)
      {
       if(arr[l]!=arr[r])
       {
         p=0;
       }
        l++;
        r--;
      }
      if(p==1)
      {
        System.out.println("Yes");
      }
      else
        System.out.println("No");
    }
}
        
          
 