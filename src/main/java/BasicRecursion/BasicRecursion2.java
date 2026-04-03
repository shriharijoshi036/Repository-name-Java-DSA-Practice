package BasicRecursion;

class Launch {

    public void ReversePrint(int n) {
        if (n == 0) return;

        System.out.println(n);
        ReversePrint(n - 1);
    }
}

public class BasicRecursion2 {
    public static void main(String[] args) {
        Launch l = new Launch();
        l.ReversePrint(4);
    }
}
