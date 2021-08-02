import java.util.*;

public class Add_Two_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st Number  = ");
        int a = in.nextInt();
        System.out.print("Enter the 2st Number  = ");
        int b = in.nextInt();
        System.out.println("The Sum is=" + (a + b));

        in.close();
    }
}
