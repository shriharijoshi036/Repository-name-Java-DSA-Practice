package MultiThreading;

class Library implements Runnable {

    String res1 = "java";
    String res2 = "DSA";
    String res3 = "SpringBoot";

    public void run() {
        String name = Thread.currentThread().getName();

        if (name.equals("stu1")) {
            try {
                synchronized (res1) {
                    System.out.println(name + " acquired " + res1);

                    Thread.sleep(100);

                    synchronized (res2) {
                        System.out.println(name + " acquired " + res2);

                        Thread.sleep(100);

                        synchronized (res3) {
                            System.out.println(name + " acquired " + res3);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                synchronized (res3) {
                    System.out.println(name + " acquired " + res3);

                    Thread.sleep(100);

                    synchronized (res2) {
                        System.out.println(name + " acquired " + res2);

                        Thread.sleep(100);

                        synchronized (res1) {
                            System.out.println(name + " acquired " + res1);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class DeadLockThread {
    public static void main(String[] args) {

        Library lib = new Library();

        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);

        t1.setName("stu1");
        t2.setName("stu2");

        t1.start();
        t2.start();
    }
}