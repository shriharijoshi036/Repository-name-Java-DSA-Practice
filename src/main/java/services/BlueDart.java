package services;

public class BlueDart implements IDeliveryService {
    @Override
    public Boolean deliverTheProduct(Double amount) {
        System.out.println("product delivered through BlueDart and amount is paid : " +amount);
        return true;
    }
}
