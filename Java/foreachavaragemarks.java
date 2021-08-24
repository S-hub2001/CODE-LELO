public class foreachavaragemarks {
    public static void main(String[] args) {
        int[] marks = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int i : marks) {
            sum = sum + i;
        }
        int ava = sum / marks.length;

        System.out.println(ava);
    }

}
