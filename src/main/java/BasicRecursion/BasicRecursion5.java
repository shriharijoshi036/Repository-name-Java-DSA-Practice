package BasicRecursion;

public class BasicRecursion5 {
    public void Addition(int i,int sum){

        if(i<1){
            System.out.println(sum);
            return;
        }

        Addition(i-1,sum+i);

    }
    public static void main(String[] args) {
        BasicRecursion5 b = new BasicRecursion5();
        b.Addition(5,0);

    }
}
