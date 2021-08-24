class base {
    base() {
        System.out.println("base class constructer");
    }

    base(int a) {
        System.out.println("i have money rs=" + a);
    }
}

class derive extends base {

    derive() {
        System.out.println("derive class constructer");

    }

    derive(int a, int b) {
        super(a);
        System.out.println("i have money rs=" + b);
    }

}

public class superkey {

    public static void main(String[] args) {
        derive sc = new derive(10, 20);
        derive xc=new derive();

    }

}