class cilinder {
    // private double radius;
    // private double hight;

    // void getter() {
    //     System.out.println("Valume = " + 3.14 * radius * radius * hight);
    // }

    // void setter(double x, double y) {
    //     radius = x;
    //     hight = y;
    // }
    


    cilinder(double r){
        System.out.println("Valume = " + 3.14 * r * r);
    }
    // consturctor
    cilinder(double r,double h){
        System.out.println("Valume = " + 3.14 * r * r * h);
    }
}

public class getAndSetInCininder {
    public static void main(String[] args) {
        double r = 4;
        double h = 7;

        // cilinder obj = new cilinder();

        // obj.setter(r, h);
        // obj.getter();


        // constructor obj
        cilinder obj = new cilinder(r,h);
    }
}
