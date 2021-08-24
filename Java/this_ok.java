class Employeee {

    int i;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;

    }

    public void setId(int i) {
        this.i = i;
    }

    public int getId() {
        return i;
    }
}

public class this_ok {
    public static void main(String[] args) {
        Employeee emp1 = new Employeee();

        emp1.setName("Shubham");
        System.out.println(emp1.getName());
        emp1.setId(1);
        System.out.println(emp1.getId());

    }
}