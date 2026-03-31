package BasicMaths;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int n = sc.nextInt();
        int reverse = 0;

        while (n > 0) {
            int lastDigit = n % 10;          // get last digit
            reverse = reverse * 10 + lastDigit; // build reverse
            n = n / 10;                     // remove last digit
        }

        System.out.println("Reversed number: " + reverse);
    }
}
