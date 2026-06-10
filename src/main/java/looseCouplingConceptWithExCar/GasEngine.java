package looseCouplingConceptWithExCar;

public class GasEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Gasengine strted : vroom!");
    }
}
