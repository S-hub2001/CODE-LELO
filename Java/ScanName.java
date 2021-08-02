import java.util.*;
public class ScanName{
    public static void main(String[] args) {
        System.out.println("enter the name = ");
        Scanner in= new Scanner(System.in);

        String m=in.nextLine();
        System.out.println("Good morining "+ m);
       
        in.close();
    }
}