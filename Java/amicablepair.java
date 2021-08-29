    import java.util.*;
	public class amicablepair
	{
		public static void main(String args[]) {

			Scanner sc= new Scanner(System.in);
			int a,b,i,j,s1,s2;
			System.out.print("Enter 1st numbers = ");

			a= sc.nextInt();
			System.out.print("Enter 2st numbers = ");
			
			b= sc.nextInt();
            
			s1 =0;

			for (i=1;i<a ;i++ ) {
	            if (a%i==0)
	             {
	                   s1 += i;				
	              }			
			}
			s2 =0;
			for (j=1;j<b ;j++ ) {
	            if (b%j==0)
	             {
	                   s2 += j;				
	              }			
			}
			if (s1==b && s2==a) 
				System.out.println( "Both are amicable pair");
			else
				System.out.println( "Both are  Not Amicable pair");

		}
	}


