import java.util.Scanner;

public class addnumber{
	public static void main(String args[]) {
	System.out.print("Enter the value of n =");
	Scanner sc= new Scanner (System.in);
	int n=sc.nextInt();
    int s = 0,i ;
	for (i = 0; i <= n; i++)
	{
		s = s + i;
	} 

         
		

	System.out.println("Total="+s);
	}
}