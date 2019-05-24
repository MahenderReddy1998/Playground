import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<=size-1;i++)
      {
        arr[i]=in.nextInt();
      }
    
      int se1=in.nextInt();
      int se2=in.nextInt();
      int se1_ind=-1;
      int se2_ind=-1;
     for(int i=0;i<=size-1;i++)
     {
     
      if(se1==arr[i])
      {
        se1_ind=i;
        System.out.println(se1_ind);
      }
     
      if(se2==arr[i])
      {
       se2_ind=i;
        System.out.println(se2_ind);
      }
     
   
     }
    
      
     //    if(se1==arr[i])       {
    
      //System.out.println(-1);
     //  }
      if(se1_ind==-1)
      {
        System.out.println(-1);
      }
        if(se2_ind==-1)
      {
        System.out.println(-1);
      }
      
      
    
}
}