import java.util.concurrent.CountDownLatch;

public class array_sort {
    public static void main(String[] args) {
        int[] ar = { 1, 2, 3, 5, 4 };

        int count = 0;

        for (int i = 0; i <ar.length-1; i++) {
            if (ar[i] > ar[i + 1]) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }
    }
}
