import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    String str1=in.nextLine();
    int k=str.length();
    int l=str1.length();
    String c="";
    String d="";
    
    int res = 0; 
  
        
        for (int i = 0; i <= k-l; i++) { 
           
            int j;             
            for (j = 0; j < l; j++) { 
                if (str.charAt(i + j) != str1.charAt(j)) { 
                    break; 
                } 
            } 
  
            // if pat[0...M-1] = txt[i, i+1, ...i+M-1]  
            if (j == l) {                 
                res++;                 
                j = 0;                 
            }             
        }         
        System.out.println(res);
  }
}