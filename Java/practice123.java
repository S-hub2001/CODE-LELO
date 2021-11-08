class souvik23 {

    private int vut = 12;

    void setvalue(int j) {
        vut = j;
    }

    int getvalue() {
        int j = vut;
        return j;
    }

    souvik23(int r) {
        System.out.println(r * 2);
    }

    souvik23(int r, int k) {
        System.out.println(r * k);
    }

    void kutta(int p) {
        System.out.println(p * 2);
    }

    void kutta(int p, int x) {
        System.out.println(p * x);
    }

}

public class practice123 {
   public static void main(String[] args) {
       souvik23 obj1= new souvik23(2,4);
      obj1.setvalue(20);
      obj1.getvalue();
       obj1.kutta(4);
       obj1.kutta(4,2);
   }
}
