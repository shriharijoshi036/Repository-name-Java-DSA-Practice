package BasicRecursion;

public class CheckPalindrome {

    public int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }

        int lastDigit = n % 10;
        rev = rev * 10 + lastDigit;
        n = n / 10;

        return reverse(n, rev);
    }

    public static void main(String[] args) {
        CheckPalindrome cp = new CheckPalindrome();

        int n = 121;
        int result = cp.reverse(n, 0);

        if (n == result) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}