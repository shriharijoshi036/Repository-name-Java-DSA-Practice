package ProjectAmazon.main.services;

public class firstFlight  implements IDeliveryService {


    @Override
    public Boolean deliverTheProduct(Double amount) {
        System.out.println("product delivered through firstFlight and amount is paid : " +amount);
        return true;
    }
}
