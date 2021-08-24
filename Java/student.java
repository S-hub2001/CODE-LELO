import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        System.out.println("Enter the marks of 3 subject = ");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks of english = ");
        int english=sc.nextInt();
        System.out.println("Enter the marks of  bangali = ");
        int bangali=sc.nextInt();
        System.out.println("Enter the marks of  math = ");
        int math=sc.nextInt();

        sc.close();


        int av= (english+bangali+math)/3;
        System.out.println(av);
        if (av>=40 && english>=33 && bangali>=33 && math>=33  ) {
            
            System.out.println("Pass");

        }
        else{
            System.out.println("fail");
        }
    }
}
