package Oopsfundamental.Inheritance;
class Alpha{
    int a,b;
    public Alpha(){
        a = 10;
        b= 20;
        System.out.println("Alpha Zero param Concstructor");
    }
    public Alpha(int a , int b){
        this.a = a;
        this.b = b;
        System.out.println("Parameterise constructor");

    }
}
class Beta extends Alpha{
    int x,y;
    public Beta(){
        x = 1;
        y = 2;
        System.out.println("Beta zero param constructor");
    }
    public Beta (int x , int y){
        this.x=x;
        this.y=y;
    }
    public void disp(){
        System.out.println(" a  is : " + a);
        System.out.println(" b  is : " + b);
        System.out.println(" x  is : " + x);
        System.out.println(" y  is : " + y);
    }

}


public class launchInheritance2 {
    public static void main(String[] args) {
        Beta b = new Beta();
        b.disp();
        
    }
    
}
