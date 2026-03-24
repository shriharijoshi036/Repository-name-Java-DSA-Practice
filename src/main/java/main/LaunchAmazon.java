package main;

import services.Fedex;

public class LaunchAmazon {
    public static void main(String[] args) {
        Amazon amz = new Amazon(new Fedex());
       // amz.setService(new Fedex());
      Boolean status = amz.deliverTheProduct(4544.4);
      if(status)
          System.out.println("Product is delivered Succesfully");
      else
          System.out.println("Product is not delivered");

    }

}
