package objectlevellocking;

public class HSBCBank {
    int accountBal;
    public HSBCBank(int accountBal){
        this.accountBal=accountBal;
    }
   synchronized public void withdrawal(int withdrawal){
        accountBal = accountBal - withdrawal;
    }
    synchronized void deposit(int deposit){
        accountBal = accountBal+deposit;
    }
    synchronized void checkBalance(){
        System.out.println("The account balance is" + accountBal);

    }
}
