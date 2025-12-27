package PaymentSystem;

public abstract class Payment extends BaseFunctionalities implements PaymentInterface {
    public void makePayment(int items){
        int amt = this.getAmount() * items;
        System.out.println("Payment Successful");
        System.out.println("Amount");
        System.out.println(amt);
    }

    public void makePayment(int items, int perItem) {
        int amt = (this.getAmount()*perItem) * items;
        System.out.println("Payment Successful");
        System.out.println("Amount");
        System.out.println(amt);
    }

    public void refund(){
        int amt = this.getAmount()-this.getAmount();
        this.setAmount(amt);
        System.out.println("Your amount has been refund");

    }
}
