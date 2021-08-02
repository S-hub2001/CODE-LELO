import java.util.*;

public class Area_of_circle {

    public static void main(String[] args) {
        float pi=3.14f;

        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the radius = ");
        float radius = sc.nextFloat();
        
        System.out.print("Area of circle ="+pi*radius*radius); 
        sc.close();
    }


    

    
}
