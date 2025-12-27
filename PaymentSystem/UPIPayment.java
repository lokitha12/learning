package PaymentSystem;

public class UPIPayment extends Payment implements UPIPaymentInterface {

    public void enableCashback(String cashback){
        System.out.println("Cashback enabled");
    }

    @Override
    public void refund(){
        int amt = this.getAmount();
        this.setAmount(amt);
        System.out.println("Your amount will not  refund");

    }
}
