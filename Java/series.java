public class series {
    static void siri(int x) {
        if (x > 0) {
            siri(x + 1);
            System.out.println(""+x+"");

        }

        // for (int i = 1; i <= x; i++) {
        // System.out.println(i);

        // }
    }

    public static void main(String[] args) {
        int n = 10;
        siri(n);
    }

}