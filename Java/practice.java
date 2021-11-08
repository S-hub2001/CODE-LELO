import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        int sum=0;
    
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }

        for (int i : a) {
            sum=sum+a[i-1]; 
        }

        // for (int i = 0; i < a.length; i++) {
        //     sum=sum+a[i];
        // }
    

       System.out.println("Avarage ="+ a.length );
    }
}