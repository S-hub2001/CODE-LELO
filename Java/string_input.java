import java.util.*;
public class string_input {
    public static void main(String[] args) {
        System.out.println("enter the string=");
        Scanner sc=new Scanner(System.in);
        // String n=sc.nextLine();
        // sc.close();
        // String n="my name is tanmay";
        String n=new String(sc.nextLine());
        System.out.printf("the string is= %s",n);
        sc.close();
    }
    
}