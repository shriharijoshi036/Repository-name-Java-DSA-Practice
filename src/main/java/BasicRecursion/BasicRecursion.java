package BasicRecursion;

class Demo {
    int count = 0;

     void PrintName(){
        if(count == 5)
            return;
        System.out.println("shrihari");
        count++;
     PrintName();
    }

}
public class BasicRecursion {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.PrintName();

    }
}
