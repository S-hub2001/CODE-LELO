class basee {
    basee() {
        System.out.println("base class constructer");
    }

    public void method1() {
        System.out.println("i am a method 1 of class base");

    }

}

class derivee extends basee {

    derivee() {
        System.out.println("derive class constructer");

    }

    @Override
    public void method1() {

        System.out.println("i am a  method 1 of class derive");

    }

}

public class method_over_riding {

    public static void main(String[] args) {

        derivee xc = new derivee();
        xc.method1();

    }

}