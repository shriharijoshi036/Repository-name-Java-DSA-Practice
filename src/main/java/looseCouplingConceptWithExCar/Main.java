package looseCouplingConceptWithExCar;

public class Main {
    public static void main(String[] args) {
        Engine traditionalEngine = new GasEngine();
        Car myRegularCar = new Car(traditionalEngine);
        System.out.println("Today is Monday and i have to go nearby so i will go with my regularCar!!");
        myRegularCar.drive();

        Engine ecoFreindlyEngine = new ElectricEngine();
        Car ecoCar = new Car(ecoFreindlyEngine);
        System.out.println("Today is Sunday and i have to go for party, so i will go with my ecoCar!!");
        ecoCar.drive();
    }
}
/*
============================================================================
 PROGRAM OUTPUT DEMONSTRATION:
============================================================================
 Today is Monday and i have to go nearby so i will go with my regularCar!!
 Gas engine: Vroom vroom! (Burning gasoline)
 The car is now moving smoothly.

 Today is Sunday and i have to go for party, so i will go with my ecoCar!!
 Electric engine: Hummmmm... (Using battery power)
 The car is now moving smoothly.
============================================================================
*/