package BasicRecursion;

class Demo2{
     void  LinearBackTrack(int i ,int  n){
         if(i<1){
             return;
         }
         System.out.println(i);
         LinearBackTrack(i-1,n);

    }
}

public class BasicRecursion3 {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.LinearBackTrack(3,3);

    }
}
