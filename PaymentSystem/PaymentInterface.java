package PaymentSystem;

public interface PaymentInterface extends BaseFunctionalitiesInterface {
    public void makePayment(int items);
    public void makePayment(int items, int perItem);
}
