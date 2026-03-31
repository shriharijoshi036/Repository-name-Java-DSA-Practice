package ProjectAmazon.main.services;

public class Fedex implements IDeliveryService{
    @Override
    public Boolean deliverTheProduct(Double amount) {
        System.out.println("product delivered through Fedex and amount is paid : " +amount);
        return true;
    }
}
