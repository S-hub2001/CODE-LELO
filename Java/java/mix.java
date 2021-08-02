import java.util.*; 

public class mix { 

static public void main (String args[]) 
	{ 
		System.out.print("Enter your input = ");
		Scanner sc= new Scanner (System.in);
		String str = sc.nextLine();
		
		  int word=1;  
		// Declare the variable vowels, consonant, digit 
		// and special characters 
		int vowels = 0, consonant = 0, specialChar = 0, 
			digit = 0; 
	
		// str.length() function to count number of 
		// character in given string. 
		for (int i = 0; i < str.length(); i++) { 
			
			if(str.charAt(i)==' ')
                   word++;

			char ch = str.charAt(i); 
	
			if ( (ch >= 'a' && ch <= 'z') || 
				(ch >= 'A' && ch <= 'Z') ) { 
	
				// To handle upper case letters 
				ch = Character.toLowerCase(ch);; 
	
				if (ch == 'a' || ch == 'e' || ch == 'i' || 
					ch == 'o' || ch == 'u') 
					vowels++; 
				else
					consonant++; 
			} 
			else if (ch >= '0' && ch <= '9') 
				digit++; 
			else
				specialChar++; 
		} 



 
   
        System.out.println("Number of words="+word);
        System.out.println("Number of spaces="+(word-1));
		System.out.println("Vowels: " + vowels); 
		System.out.println("Consonant: " + consonant); 
		System.out.println("Digit: " + digit); 
		System.out.println("Special Character: " + specialChar); 
	} 
	
	
} 


