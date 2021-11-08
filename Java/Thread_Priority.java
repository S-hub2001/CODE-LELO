public class Thread_Priority extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Souvik ");
        }

    }

    public static void main(String args[]) {
        Thread_Priority t1 = new Thread_Priority();
        Thread_Priority2 t2 = new Thread_Priority2();

        // t1.setPriority(Thread.MIN_PRIORITY); // setting priority of t1 thread to
        // MIN_PRIORITY (1)
        // t2.setPriority(Thread.MAX_PRIORITY); // setting priority of t2 thread to
        // MAX_PRIORITY (10)
        
        
        t2.start();

        try {
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t1.start();


    }
}

class Thread_Priority2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("kutta");
        }

    }
}