import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        int num , reversedInteger = 0, remainder, originalInteger;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number = ");
        num = sc.nextInt();
        originalInteger = num;
        // reversed integer is stored in variable 
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}