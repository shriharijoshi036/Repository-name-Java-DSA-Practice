package looseCouplingConceptWithExCar;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("ElectricEngine started: hummmm!!! ");
    }
}
