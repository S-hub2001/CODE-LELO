class company {
    private int slary = 30000;

    public void setsalary(int n) {
        slary = n;
    }

    public int getslary() {
        return slary;
    }

    // void details() {
    // System.out.println(slary);
    // }
}

public class tsopps {

    public static void main(String[] args) {
        company souvik = new company();
        company tanmay = new company();
        tanmay.setsalary(50000);
        // tanmay.slary = 50000;
        // souvik.details();
        // tanmay.details();
        // System.out.println(souvik.slary);
        // System.out.println(tanmay.slary);
        
        ;
        System.out.println(souvik.getslary());
        System.out.println(tanmay.getslary());
    }
}