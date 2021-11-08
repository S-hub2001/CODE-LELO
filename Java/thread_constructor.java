class MyThr extends Thread{
    public MyThr(String name){
        super(name);
        
    }

}
public class thread_constructor  {
    public static void main(String[] args) {
    MyThr t1 = new MyThr("Harry");

 
    System.out.println("The name of the thread t is " + t1.getName());
    

    }
}
