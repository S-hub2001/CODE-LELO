 import java.util.*;
  class munu
   {
    public static void main(String arg[])
     {
      int n,p;
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the number of row(n)=");
     n=sc.nextInt();

  System.out.print("Enter the last number of row(p)=");
  p=sc.nextInt();

System.out.println("Print "+n+" rows except the number 3 till "+p);
 for(int i=1;i<=n;i++)
  {
   for(int j=1;j<p;j++)
    {
    if(j==3)
     System.out.print("");
    else
     System.out.print(j);
    }
  System.out.println("");
   }
  }
 }