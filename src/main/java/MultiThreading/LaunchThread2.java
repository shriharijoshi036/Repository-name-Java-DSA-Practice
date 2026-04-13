package MultiThreading;

class Mycar implements Runnable{

    /**
     * Runs this operation.
     */
    @Override
    synchronized public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " entered into the parking lot");
            Thread.sleep(200);
            System.out.println(Thread.currentThread().getName() + " entered into the car");
            Thread.sleep(200);
            System.out.println(Thread.currentThread().getName() + " Started the car and driving");
            Thread.sleep(200);
            System.out.println(Thread.currentThread().getName() + " came back and parked car");
            Thread.sleep(200);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class LaunchThread2 {
    public static void main(String[] args) {
        Mycar mc = new Mycar();
        Thread t1 = new Thread(mc);
        Thread t2 = new Thread(mc);
        Thread t3 = new Thread(mc);

        t1.setName("ramesh");
        t2.setName("Suresh");
        t3.setName("dinesh");

        t1.start();
        t2.start();
        t3.start();


    }
}
