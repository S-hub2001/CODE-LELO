
import java.util.*;

public class switchh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number=");
        int a = sc.nextInt();
        sc.close();
        switch (a) {
            case 1:
                System.out.println("your rating is=" + a);
                break;

            case 2:
                System.out.println("your rating is=" + a);
                break;
            case 3:
                System.out.println("your rating is=" + a);
                break;
            case 4:
                System.out.println("your rating is=" + a);
                break;
            case 5:
                System.out.println("your rating is=" + a);
                break;

            default:
                System.out.println("you enter a wrong ratting");
                break;
        }
    }
}
