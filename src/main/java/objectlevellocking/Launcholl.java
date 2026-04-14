package objectlevellocking;

public class Launcholl {
    public static void main(String[] args) {
        HSBCBank bank1 = new HSBCBank(4000);

        Atm atm = new Atm(bank1);
        atm.setName("ATM Thread");

        GooglePay gpay = new GooglePay(bank1);
        gpay.setName("GPay Thread");

        PhonePe ppay = new PhonePe(bank1);
        ppay.setName("PHONEPE Thread");

        atm.start();
        gpay.start();
        ppay.start();

    }
}
