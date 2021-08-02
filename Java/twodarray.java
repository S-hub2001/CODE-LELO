import java.util.*;

public class twodarray {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.println(a[i][j]);

            }
        }

        sc.close();
    }

}