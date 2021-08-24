import java.util.Scanner;

public class Print_Fibonacci_Series_in_Java_using_Recursion {

    static void fibo (int f , int a ,int b){
        // int x ;
        
        // for (int i = 0; i <=f-2; i++) {

        //  x = a+b ;
        //  a= b;
        //  b = x;
    
        // System.out.println(x);
        // }




        
    }

    public static void main(String[] args) {
        
        
        System.out.print("Enter the number =");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int a=0;
        int b =1;
      
        System.out.println(a);
        System.out.println(b);
        
        fibo(n,a,b);

            
      
    }
    
}
