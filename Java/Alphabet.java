
import java.util.*;

class alphabet {
    public static void main(String args[]) {
        int alphabet = 65;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int r = sc.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}
