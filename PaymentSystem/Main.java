package PaymentSystem;

/**
 * This is my payment system
 * created  3 entity user,cardpayment,upipayment
 * user has 4 variable (paymentType,transactionid ,amount,items)
 after created variable we have to create  getters/setters
 *cardpayment and upipayment has 2 variable (transactionid,amount) ,
 cardpayment also have 3 method( makePayment(),refund(),addRewardPoints()) and for upipayment the methods are
 ( makePayment(),refund(),enabledCashback())
 * the redency was removed in cardpayment.java and upipayment.java by using payment.java.And for payment.java and
 user.java the redency was removed using basefuctionalitites.java.
 * then we give the interface for user,cardpayment,upipayment,payment and basefuctionalitites.
 * overloading is given makePayment(). The extra parameter which perItem.
 * override is given in refund() which is in card the amount will refund but in upi the amount will not refund.
 **/

public class Main {

    public static void main(String args[]){

        UserInterface user1 = new User();
        CardPaymentInterface cp = new CardPayment();
        UPIPaymentInterface up = new UPIPayment();

        user1.setTransactionId(23456891);
        user1.setAmount(300);
        user1.setPaymentType("Card");
        user1.setItems(3);
        user1.setPerItem(2);

        cp.setTransactionId(user1.getTransactionId());
        cp.setAmount(user1.getAmount());
        cp.makePayment(user1.getItems());
        cp.makePayment(user1.getItems(),user1.getPerItem());
        cp.addRewardPoints("Reward Points Added");

        System.out.println("*******************************************");

        UserInterface user2 = new User();

        user2.setTransactionId(25467549);
        user2.setAmount(100);
        user2.setPaymentType("Card");
        user2.setItems(3);

        up.setTransactionId(user2.getTransactionId());
        up.setAmount(user2.getAmount());
        up.makePayment(user2.getItems());
        up.enableCashback("Cashback enabled");
    }
}
