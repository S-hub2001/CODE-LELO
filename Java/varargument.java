import java.util.*;

public class varargument {
    static int timt(int... arr) {

        int c = 0;
        for (int i : arr) {
            c = c + i;

        }
        return c;

        // int z = arr[0] + arr[1];
        // return z;

    }

    // static int timt(int x, int y) {
    // int z;
    // z = x + y;
    // // System.out.println(z);
    // return z;
    // }
    // static void timt(int x, int y,int z) {
    // System.out.println(x+y+z);
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers=");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int f = sc.nextInt();
        sc.close();

        int xe = timt(n1, n2);

        System.out.println(xe);

        // timt(n1, n2, f);
        int py = timt(n1, n2, f);
        System.out.println(py);

    }

}