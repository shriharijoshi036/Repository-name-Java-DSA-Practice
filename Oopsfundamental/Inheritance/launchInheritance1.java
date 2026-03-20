package Oopsfundamental.Inheritance;
class Aeroplane{
    void fly(){
        System.out.println(" Aeroplane is flying");
    }
    void land(){
        System.out.println("Aeroplane is landing");
    }
}
class cargoPlane extends Aeroplane{
    //overridden method

    void fly(){
        System.out.println("Aeroplane is flying with medium speed");
    }
   
}
class PassengerPlane extends Aeroplane{
    //Specialized metthod of inheritance
    void takeOff(){
        System.out.println("Aeroplane is to be takeOff at terminal 9");

    }

}
public class launchInheritance1 {
    public static void main(String[] args) {
        Aeroplane cp = new cargoPlane();
        PassengerPlane pp = new PassengerPlane();
        cp.fly();
        cp.land();
        pp.takeOff();
        
        
    }
    
}
