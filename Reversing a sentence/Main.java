import java.util.*;
public class Main{ 
  
public static void main(String[] args) { 
  Scanner in=new Scanner(System.in);
  String str=in.nextLine();
    String s[]=str.split(" "); 
    String ans=""; 
    for(int i=s.length - 1; i >= 0; i--) { 
        ans+=s[i]+" "; 
          
    } 
    
    System.out.println(ans.substring(0,ans.length()-1)); 
      
} 
} 