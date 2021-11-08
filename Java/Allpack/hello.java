
import PackG.*;

public class hello {
    public static void main(String[] args) {
        cylinder obj = new cylinder();
        int height =10;
        int radius=20;
        System.out.println(  obj.volume(height,radius));
        
        square obj2=new square();

        System.out.println(obj2.area(10));

        rectangle obj3=new rectangle();
        System.out.println(obj3.area(12,13));

        circle obj4=new circle();
        System.out.println(obj4.area(10));


    }
}
