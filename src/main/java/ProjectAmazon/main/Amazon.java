package ProjectAmazon.main;

import ProjectAmazon.main.services.IDeliveryService;

public class Amazon {
    public Amazon(IDeliveryService service){
        this.service = service;
    }
    private IDeliveryService service;

    public Amazon(){
    }

    public void setService(IDeliveryService service) {
        this.service = service;
    }

    public Boolean deliverTheProduct(Double amount){

        return service.deliverTheProduct(amount);
    }

}
