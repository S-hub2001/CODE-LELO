import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {

    int[][] arr = new int[3][3];
    int[][] arr2 = new int[3][3];

    Scanner sc=new Scanner(System.in);


     for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
             arr[i][j]=sc.nextInt();
         }
         System.out.println();
     }
     for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
             arr2[i][j]=sc.nextInt();
         }
         System.out.println();
     }


     for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
           System.out.print (" "+(arr[i][j]+arr2[i][j]));
         }
         System.out.println();
         
     }

    }
}