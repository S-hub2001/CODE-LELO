import java.lang.*;
class ctof {
  public static void main(String[] args) {
    float temperature;


    System.out.println(args[0]);
    int temp=Integer.parseInt(args[0]);

    temperature = ((temp - 32)*5)/9;

    System.out.println("temperature in Celsius = " + temperature);
  }
}