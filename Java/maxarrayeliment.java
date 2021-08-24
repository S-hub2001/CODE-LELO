public class maxarrayeliment {
    public static void main(String[] args) {
        int[] ar = { 10, 20,500, 30, 40, 50 ,10};

        int max=0;

       for (int i = 0; i < ar.length; i++) {
        
        if (max<ar[i]) {
            max=ar[i];
        }
     

       }


       System.out.println(max);
    }
}
