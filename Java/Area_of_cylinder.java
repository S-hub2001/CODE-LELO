import java.util.*;
public class Area_of_cylinder {
    public static void main(String[] args) {
        float pi=3.14f;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius = ");
        float radius= sc.nextFloat();
        System.out.print("Enter the height = ");
        float height= sc.nextFloat();
        
        System.out.print("Area of cylinder ="+pi*radius*radius*height );

        sc.close();

    }
}
