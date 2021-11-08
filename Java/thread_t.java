// Creating a Thread by Extending Thread class

// class mythread extends Thread{
//     public void run(){
//         for (int i = 0; i < 10; i++) {
//             System.out.println("Souvik ");
//         }

//     }
// }
// class mythread2 extends Thread{
//     public void run(){

//         for (int i = 0; i < 10; i++) {
//             System.out.println("Das");
//         }
//     }
// }

// Creating a Java Thread Using Runnable Interface
class mythread implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Souvik ");
        }

    }
}

class mythread2 implements Runnable {
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Das");
        }
    }
}

public class thread_t {
    public static void main(String[] args) {

        // mythread obj=new mythread();
        // mythread2 obj2=new mythread2();
        // obj.start();
        // obj2.start();

        mythread obj = new mythread();
        mythread2 obj2 = new mythread2();
        Thread obj3 = new Thread(obj);
        Thread obj4 = new Thread(obj2);
        obj3.start();
        obj4.start();
    }
}