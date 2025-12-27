package PaymentSystem;

public class CardPayment extends Payment implements CardPaymentInterface{

    public void addRewardPoints(String points){
        System.out.println("Reward Points Added");
    }
}
