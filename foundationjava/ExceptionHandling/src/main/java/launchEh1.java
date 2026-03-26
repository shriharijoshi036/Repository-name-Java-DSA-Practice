import java.util.Scanner;

public class launchEh1 {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("connection is Establishing");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the numerator for division");
            int n = sc.nextInt();
            System.out.println("enter the denominator for division");
            int d = sc.nextInt();
            int res = n / d;

            System.out.println("Result is : " + res);
        } catch (Exception e) {
            System.out.println("enter the non zero denominator ");

        }

        System.out.println("connection is terminated");


    }
}
