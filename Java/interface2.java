
interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle extends Bicycle{
    int x = 45;
    void blowHornK3g();
    void blowHornmhn();


}


class AvonCycle implements HornBicycle{
    //public int x = 5;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake for "+decrement+"time");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP"+increment+"km/h");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po");
    }
}

public class  interface2 {
    public static void main(String[] args) {

        AvonCycle cycleHarry = new AvonCycle();


       
        cycleHarry.speedUp(cycleHarry.a);

        // You can create properties in Interfaces

        System.out.println(cycleHarry.a);
        System.out.println(cycleHarry.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;


        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();
    }
}
