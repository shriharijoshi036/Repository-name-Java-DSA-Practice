package BasicRecursion;

public class BasicRecursion6 {

    public void factorialNum(int i, int fact) {
        if (i < 1) {
            System.out.println(fact);   // print final result
            return;
        }

        factorialNum(i - 1, fact * i);
    }

    public static void main(String[] args) {
        BasicRecursion6 b = new BasicRecursion6();
        b.factorialNum(5, 1);
    }
}
