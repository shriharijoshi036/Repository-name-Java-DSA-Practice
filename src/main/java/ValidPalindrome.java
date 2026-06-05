public class ValidPalindrome {
    public boolean isPalindrome(String text) {
        // If the string is empty or has 1 character, it is automatically a palindrome
        if (text == null || text.length() <= 1) {
            return true;
        }

        // Convert the string to lowercase so 'M' and 'm' are treated as the exact same character
        text = text.toLowerCase();

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            char leftChar = text.charAt(start);
            char rightChar = text.charAt(end);

            if (leftChar != rightChar) {
                return false; // Mismatch found, stop immediately
            }
            start++; // Move left pointer rightward
            end--;   // Move right pointer leftward
        }
        return true; // No mismatches found, it is a palindrome
    }

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        String text = "Mam";

        // This will call our method, which handles the conversion and checks the logic
        boolean ans = vp.isPalindrome(text);

        System.out.println("Is '" + text + "' a palindrome? " + ans);
    }
}

/* ============================================================================
   REVISION MATERIAL: ITERATION-BY-ITERATION DRY RUN
   ============================================================================
   Input String given in main method: text = "Mam"

   PREPARATION STEP:
   text = text.toLowerCase(); -> "Mam" becomes "mam"
   text.length() = 3

   INITIAL VARIABLE STATES:
   start = 0  (points to character 'm')
   end = 2    (points to character 'm')

   ----------------------------------------------------------------------------
   ITERATION 1:
   ----------------------------------------------------------------------------
   1. Check while condition: Is (start < end)? -> Is (0 < 2)? -> YES (True).
   2. Read characters:
      - leftChar = text.charAt(0) -> 'm'
      - rightChar = text.charAt(2) -> 'm'
   3. Check if condition: Does (leftChar != rightChar)? -> Does ('m' != 'm')? -> NO (False).
   4. Update pointers:
      - start++ -> start becomes 1
      - end--   -> end becomes 1

   Current State: start = 1, end = 1

   ----------------------------------------------------------------------------
   ITERATION 2 (Loop Condition Check):
   ----------------------------------------------------------------------------
   1. Check while condition: Is (start < end)? -> Is (1 < 1)? -> NO (False).
   2. The while loop immediately terminates because the pointers met/crossed.

   ----------------------------------------------------------------------------
   FINAL OUTPUT AND RETURN VALUE:
   ----------------------------------------------------------------------------
   1. The method skips the while loop and runs: return true;
   2. In the main method: boolean ans = true;
   3. Terminal prints: Is 'Mam' a palindrome? true
   ============================================================================ */