import java.util.Scanner;
public class calculator {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter value of 1st number =  ");
      int a = sc.nextInt();

      System.out.print("Enter value of 2nd number =  ");
      int b = sc.nextInt();

      System.out.println("Select operation");
      System.out.println(" Addition = a  ");
      System.out.println(" Subtraction = s ");
      System.out.println(" Multiplication = m  ");
      System.out.println(" Division = d ");
      System.out.print(" Whice operation you want to do? = ");
      
      char ch = sc.next().charAt(0);
      switch(ch) {
         case 'a' :
         System.out.println(" Sum of the given two numbers: = "+(a+b));
         break;
         case 's' :
         System.out.println(" Difference between the two numbers: = "+(a-b));
         break;
         case 'm' :
         System.out.println(" Product of the two numbers: = "+(a*b));
         break;
         case 'd' :
         System.out.println(" Result of the division: = "+(a/b));
         break;
         default :
         System.out.println("Invalid grade");
      }
   }
}


