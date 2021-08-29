import java.util.Scanner;

public class addfloats{
	public static void main(String[] args) {
	System.out.print("Enter the value of n =");
	Scanner sc= new Scanner (System.in);
	int n=sc.nextInt();
    float i , s = 0 ;
	for (i = 1; i <= n; i++)
	{
		s = s + 1/i;
	} 

         
		

	System.out.println("Total="+s);
	}
}