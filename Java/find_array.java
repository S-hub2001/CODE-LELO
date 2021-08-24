import java.util.Scanner;

public class find_array {
    public static void main(String[] args) {
        int[] ar = { 10, 20, 30, 40, 50 };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int count = 0;
        sc.close();
        for (int i = 0; i < ar.length; i++) {

            if (n == ar[i]) {
                // count = 1;

                System.out.println("emlimet is presnt in position = "+(i+1));
            }
            else
            {

                System.out.println("emlimet is not presnt in position = "+(i+1));

            }

        }

        // if (count == 1) {
        //     System.out.println("Eliment is present");
        // } else {
        //     System.out.println("Elemant is not presnt");
        // }
    }

}
