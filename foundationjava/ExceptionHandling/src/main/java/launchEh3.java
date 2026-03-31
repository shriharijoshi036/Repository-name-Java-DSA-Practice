import java.util.Scanner;

import java.util.Scanner;

class Alpha {
    public void disp() throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your age");
        int age = sc.nextInt();

        if (age <= 0) {
            throw new IllegalArgumentException("Invalid age! Age cannot be 0 or negative");
        }

        if (age >= 18) {
            System.out.println("eligible for vote");
        } else {
            System.out.println("age is not valid for voting");
        }
    }
}

class Beta extends Alpha{

}


public class launchEh3 {
    public static void main(String[] args) {
        Alpha a = new Alpha();
        try {
            a.disp();
        } catch (IllegalArgumentException e) {
            System.out.println(" some problem");
        }
        finally {
            System.out.println("connetion is terminated");
        }

    }
}