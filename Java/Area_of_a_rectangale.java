import java.util.Scanner;

public class Area_of_a_rectangale {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length =");
        float Length = input.nextFloat();
        System.out.print("Enter the Width =");
        float Width = input.nextFloat();

        System.out.print("Area=" + Length * Width);
        input.close();

    }

}