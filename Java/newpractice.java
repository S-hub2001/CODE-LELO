
import java.util.Scanner;

class circle {
    public double area(double t) {
        double v = 3.14 * t * t;
        return v;
    }
}

class celendar extends circle {
    public double Valume(double t, double h) {
        double v = super.area(t);
        double x = v * h;
        return x;
    }
}

public class newpractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radious");
        double r = sc.nextDouble();
        System.out.println("enter the height");
        double h = sc.nextDouble();
        sc.close();

        celendar obj2 = new celendar();

        System.out.println(obj2.area(r));

        System.out.println(obj2.Valume(r, h));

    }

}




