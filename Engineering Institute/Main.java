//import required packages
import java.util.*;
class Faculty
{
  public void salary(int BaseSalary)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: "+BaseSalary);
  }
}
class CSE extends Faculty
{
  public void salary(int s)
  {
    System.out.println("CSE Faculty: "+(s+3000));
    //write your CSE class statements
  }
}
class IT extends CSE
{
  public void salary(int ss)
  {
    System.out.println("IT Faculty: "+(ss+5000));
    //write your IT class statements
  }
}
class ECE extends IT
{
  public void salary(int n)
  {
    System.out.println("ECE Faculty: "+(n+4500));
    //write your ECE class statements
  }
}

class Main
{
  public static void main(String[] args)
  {
    //implement your required concept here
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    Faculty o = new Faculty();
    o.salary(base);
    CSE oo = new CSE();
    oo.salary(base);
    IT it = new IT();
    it.salary(base);
    ECE obj = new ECE();
    obj.salary(base);
  }
}
