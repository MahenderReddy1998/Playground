import java.util.*;
class Main
{
   public static void main (String[] args)
   {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
       int i =0;
       int num =0;
     

       for (i = 1; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     
	     System.out.println(i);
	  }	
       }	
      
       
   }
}