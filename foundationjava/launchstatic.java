class Demo{
    static int a,b,c;

    static{
       a=10;
       b=20;
       c=30;
    }
    void disp(){
        System.out.println("a  : " + a);
        System.out.println("b  : " + b);
        System.out.println("c  : " + c);
    }
}

public class launchstatic {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.disp();
        
    }
    
}
