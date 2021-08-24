
import java.util.Scanner;

public class floatarraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element");
        int n = sc.nextInt();
        float[] array = new float[n];
        float sum = 0;

        sc.close();
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextFloat();

        }
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];

        }
        System.out.println(sum);

    }

}