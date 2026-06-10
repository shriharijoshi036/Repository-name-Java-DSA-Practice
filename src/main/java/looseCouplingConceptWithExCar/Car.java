package looseCouplingConceptWithExCar;

public class Car {
   private Engine engine;
    Car(Engine engine){
        this.engine = engine;
    }
   public void drive(){
        engine.start();
       System.out.println("The car is moving Smmothly");
   }

}
