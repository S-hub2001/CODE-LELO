import java.util.Scanner;

public class oppo {
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
        System.out.println("Total " + st.nat(n));

    }

}