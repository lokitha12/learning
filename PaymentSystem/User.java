package PaymentSystem;

public class User extends BaseFunctionalities implements UserInterface{

     private String paymentType;
     private int items;
     private int perItem;

     public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public int getPerItem() {
        return perItem;
    }

    public void setPerItem(int perItem) {
        this.perItem = perItem;
    }
}
