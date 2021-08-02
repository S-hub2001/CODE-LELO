import java.util.*;

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

     

        // /traversing the array with for-each loop
        for (int i : a) {
            System.out.println(i);

        }

        sc.close();
    }

}
