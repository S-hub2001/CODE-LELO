import java.util.*;

public class hasNextInt {
    public static void main(String[] args) {
        System.out.println("Enter the  number=");
        Scanner in = new Scanner(System.in);

        boolean b = in.hasNextInt();
        System.out.println(b);

        in.close();
    }

}
