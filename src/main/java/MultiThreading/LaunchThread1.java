package MultiThreading;

import java.util.Scanner;
class Alpha extends Thread{
    public void run(){
        try{
            banking();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void banking() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the usernumber");
        int n = sc.nextInt();
        Thread.sleep(100);
        System.out.println("please enter the password");
        int p = sc.nextInt();
        Thread.sleep(100);
        System.out.println("please enter amount");
        int a = sc.nextInt();
        Thread.sleep(100);
        System.out.println("please collect your cash and exit");

    }

}
class Beta extends Thread {
    public void run() {
        try {
            printStar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void printStar() throws InterruptedException {
        for(int i =0;i<=4;i++){
            System.out.println("**");
            Thread.sleep(200);
        }
    }

}
public class LaunchThread1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application started...");
        Alpha a = new Alpha();
        Beta b = new Beta();
        a.start();
        a.join();
        b.start();
    }
}