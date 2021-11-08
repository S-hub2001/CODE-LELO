
public class maxeliment {
    public static void main(String[] args) {
        int[] a = { 200, 43, 1, 10, 98, 4 };
        int k = 0;
        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] > a[i + 1]) {
                if (a[i] > k) {
                    k = a[i];
                }

            } else {

                if (a[i + 1] > k) {
                    k = a[i + 1];
                }

            }
          
        }

        System.out.println(k);

    }
}