import java.util.*;


public class javaprint { 

  public static void main(String args[]) 
  { 
      System.out.print("Enter the word = ");
      Scanner sc = new Scanner(System.in);
            // String input 
            String str = sc.nextLine(); 


      // Creating array of string length 
      char[] ch = new char[str.length()]; 

      // Copy character by character into array 
      for (int i = 0; i < str.length(); i++) { 
          ch[i] = str.charAt(i); 
      } 

      // Printing content of array 
      for (int i = 0; i <= str.length() ; i++)
      {
          for (int j= 0; j < i; j++)
          {
              System.out.print( ch[j]  + " ");
          }
          System.out.println();
      }
  } 
} 

