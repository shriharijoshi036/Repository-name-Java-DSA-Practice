package foundationjava;

class AddCalc {

    int add(int a, int b) {
        return a + b;
    }

    void add(double x, double y) {
        double res = x + y;
        System.out.println("Double Addition: " + res);
    }

    void add(long x, long y) {
        long res = x + y;
        System.out.println("Long Addition: " + res);
    }
}

public class methodoverloading {

    public static void main(String[] args) {

        AddCalc obj = new AddCalc();

        int result = obj.add(10, 20);
        System.out.println("Integer Addition: " + result);

        obj.add(10.5, 20.5);

        obj.add(100000L, 200000L);
    }
}