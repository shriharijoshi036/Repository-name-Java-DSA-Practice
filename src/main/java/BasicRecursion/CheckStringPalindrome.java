package BasicRecursion;

public class CheckStringPalindrome {

    public boolean check(String str, int left, int right) {

        if (left >= right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return check(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        CheckStringPalindrome cp = new CheckStringPalindrome();

        String str = "madam";

        if (cp.check(str, 0, str.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}