package BasicMaths;

import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int n = sc.nextInt();
        int reverse = 0;
        int dup = n;

        while (n > 0) {
            int lastDigit = n % 10;          // get last digit
            reverse = reverse * 10 + lastDigit; // build reverse
            n = n / 10;                     // remove last digit
        }
        if(reverse == dup){
            System.out.println("it is palindrome = true");
        }else{
            System.out.println("it is palindrome = false");
        }
    }
}

