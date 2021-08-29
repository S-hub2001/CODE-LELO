import java.util.Scanner;

class squer{
    
    // int s;
    // int p;


//     public void area(){
//         System.out.println("Area ="+s*s);
//    }
   
//    public int peramiter(){
          
//         return 4*p;

//    }

   




}



public class prcatice {


    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int side= sc.nextInt();
     squer obj=new squer();

     obj.s=side;
     obj.p=side;


     obj.area();
     
     System.out.println("peramiter is ="+obj.peramiter());
     
    }
}
