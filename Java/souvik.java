
import java.util.Scanner;

public class souvik {
	
	 public static void main(String args[]) {
	        Scanner cmd = new Scanner(System.in);
	 
	        System.out.print("Enter the number of rows =");
	        int rows = cmd.nextInt();
	        System.out.print("Enter the last number of every rows =");
	        int p = cmd.nextInt();
	        
	        
	       
	        System.out.println("Floyd's triangle = ");
	 
	        for (int i = 1; i <= rows; i++) {

	            for (int j = 1; j <p; j++) {
	            	if(j==3) {
	            		continue;
	            	}
	                System.out.print(j + " ");

	                
	            }
	 
	            System.out.println();
	        }
	    }
	 

}
