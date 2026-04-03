package BasicRecursion;

class Demo1{

    public void LinearPrint(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        LinearPrint(i+1,n);
    }
}

public class BasicRecursion1 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.LinearPrint(1,4);

    }
}
