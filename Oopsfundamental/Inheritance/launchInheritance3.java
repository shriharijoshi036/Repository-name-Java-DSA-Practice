package Oopsfundamental.Inheritance;
class Alpha2{
    int a,b;
    public Alpha2(){
        a = 10;
        b= 20;
        System.out.println("Alpha Zero param Concstructor");
    }
    public Alpha2(int a , int b){
        this.a = a;
        this.b = b;
        System.out.println(" Alpha2 Parameterise constructor");

    }
}
class Beta2 extends Alpha2{
    int x,y;
    public Beta2(){
        this(2,2);
        x = 1;
        y = 2;
        System.out.println("Beta zero param constructor");
    }
    public Beta2 (int x , int y){
        super(4,44);
        this.x=x;
        this.y=y;
        System.out.println("Beta2 parameterise constructor");
    }
    public void disp(){
        System.out.println(" a  is : " + a);
        System.out.println(" b  is : " + b);
        System.out.println(" x  is : " + x);
        System.out.println(" y  is : " + y);
    }

}


public class launchInheritance3 {
    public static void main(String[] args) {
        Beta2 b = new Beta2(1,2);
        b.disp();
        Beta2 B = new Beta2();
        B.disp();
        
    }
    
}

