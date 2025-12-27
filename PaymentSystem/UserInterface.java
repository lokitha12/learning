package PaymentSystem;

public interface UserInterface extends BaseFunctionalitiesInterface  {
    public String getPaymentType();
    public void setPaymentType(String paymentType);
    public int getItems();
    public void setItems(int items);
    public int getPerItem();
    public void setPerItem(int perItem);
}
