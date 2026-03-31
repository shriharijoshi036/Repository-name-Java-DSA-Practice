interface Add{
    int sum (int a,int b);
}

public class lambdatest {
    public static void main(String[] args) {
        Add addition = (a,b) -> a+b;
        int result =addition.sum(10,20);
        System.out.println("Addition is  :" + result);

    }
}
