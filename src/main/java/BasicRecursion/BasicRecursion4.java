package BasicRecursion;

class BasicRecursion4 {

    static void reverseBacktrack(int i, int n) {
        if (i > n) return;

        // go deep first
        reverseBacktrack(i + 1, n);

        // print while coming back
        System.out.println(i);
    }

    public static void main(String[] args) {
        reverseBacktrack(1, 4);
    }
}