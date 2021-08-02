
import java.util.*; 

class factorialadd { 
	
	// Utility function to find 
	static int factorial(int n) 
	{ 
		int res = 1; 
		for (int i = 2; i <= n; i++) 
		res *= i; 
		return res; 
	} 
	
	// A Simple Function to return value 
	// of 1/1! + 1/2! + .. + 1/n! 
	static double sum(int n) 
	{ 
		double sum = 0; 
		for (int i = 1; i <= n; i++) 
			sum += 1.0/factorial(i); 
		return sum; 
	} 

	// Driver program 
	public static void main (String[] args) 
	{ 

		Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the value of n =  "); 
        int n = sc.nextInt();  
		System.out.println(sum(n)); 
	} 
} 

// This code is contributed by Ajit. 
