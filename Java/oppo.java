import java.util.Scanner;

public class oppo {
    int nat(int j) {
        if (j == 1) {
            return 1;
        } else {
            return j + nat(j - 1);
        }

    }
public class oppo1 {
    int nat(int j) {
        if (j == 1) {
            return 1;
        } else {
            return j + nat(j - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oppo st = new oppo();
        oppo1 st1 = new oppo1();
        System.out.println("Total " + st.nat(n));
        System.out.println("Total " + st1.nat(n));

    }

}