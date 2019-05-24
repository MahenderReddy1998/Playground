import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
      int count=0;
        for(int index = 0; index <= (size - 1); index++)
        {
            arr[index] = in.nextInt();
        }
      
      
      for(int index=0;index<=size-1;index++)
      {
        if(arr[index]!=0)
        {
        int r=arr[index];
        arr[index]=arr[count];
        arr[count]=r;
        count++;
    }
      }
      for(int index=0;index<=size-1;index++)
      {
        System.out.print(arr[index]+" ");
}
    }
}