package Oopsfundamental.Abstraction;
abstract class Aeroplane{
    public abstract void fly();
    public abstract void takeOff();
    public abstract void land();
}
class cargoPlane extends Aeroplane{
    public  void fly(){
        System.out.println("cargroplane is flying");
    }
    public  void takeOff(){
        System.out.println("CargoPlane is ready to takeOff at short runway");
    }
    public  void land(){
        System.out.println(" CargoPlane is landing ");
    }

}
class fighterPlane extends Aeroplane{
    public  void fly(){
        System.out.println("Fighterlane is flying");
    }
    public  void takeOff(){
        System.out.println("Fighterlane is ready to takeOff at short runway");
    }
    public  void land(){
        System.out.println(" Fighterlane is landing ");
    }

}
class Airport{
    public void permit(Aeroplane aeroplane){
        aeroplane.fly();
        aeroplane.takeOff();
        aeroplane.land();
    }
}


public class launchAbstract {
    public static void main(String[] args) {
        cargoPlane cp = new cargoPlane();
        fighterPlane fp = new fighterPlane();
        Airport a = new Airport();
        a.permit(cp);
        a.permit(fp);
        
    }
    
}
