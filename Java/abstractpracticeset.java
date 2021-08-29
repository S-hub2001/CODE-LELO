abstract class pen {

    abstract public void write();

    abstract public void refill();
}

class fontainpain extends pen {

    public void write() {
        System.out.println("Hi");
    };

    public void refill() {
        System.out.println("hello");
    }

    public void changenib(){
        System.out.println("kutta");
    }

}

public class abstractpracticeset {
    public static void main(String[] args) {

        fontainpain obj= new fontainpain();

    }
}
