import java.util.*;

public class amicable {

		public static void main(String args[]) {

			Scanner sc= new Scanner(System.in);
			int a,i,s1;
			System.out.print("Enter the two numbers: ");
			a= sc.nextInt();

			s1 =0;
			for (i=1;i<a ;i++ ) {
	            if (a%i==0)
	             {
	                   s1 += i;				
	              }			
			}
			
				System.out.println("Amicable pair of this num is =  "+s1);
			
		}
	}



