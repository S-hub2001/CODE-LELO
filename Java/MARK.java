
import  java.util.Scanner;
public class MARK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       float mark=500;

        System.out.println("Subject 1 :- ");
        float a = sc.nextFloat();

        System.out.println("Subject 2 :- ");
        float b = sc.nextFloat();

        System.out.println("Subject 3 :- ");
        float c = sc.nextFloat();

        System.out.println("Subject 4 :- ");
        float d = sc.nextFloat();

        System.out.println("Subject 5 :- ");
        float e = sc.nextFloat();

        float total= a + b + c + d + e ;

        float av = total * 100 ;

        float pe =  av / 500;

        System.out.println( pe );


    }
}
