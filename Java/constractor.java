class company1 {

    int slary = 30000;

    // paramitarized
    company1(int x) {

        System.out.println(x);

    }

    // default
    company1() {

        System.out.println(slary);

    }

}

public class constractor {

    public static void main(String[] args) {

        company1 souvik = new company1();
        company1 tanmay = new company1(50000);

        // tanmay.slary = 50000;

        // System.out.println(souvik.slary);
        // System.out.println(tanmay.slary);

    }
}
