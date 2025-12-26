package BankAccount;

public class Main {
    public static void  main(String args[]){
        SavingsAccountInterface savings = new  SavingsAccount();
        AccountInterface user1 = new User();
        AccountInterface user2 = new User();
        CurrentAccountInterface current = new CurrentAccount();

        user1.setDespoist(10000);
        user1.setWithDraw(0);
        user1.setBalance(10000);
        user1.setOwerName("loki");
        user1.setAccountNumber(1234567);
        user1.setAccountType("Savings");
        savings.setAccountType(user1.getAccountType());
        savings.setDespoist(user1.getDespoist());
        savings.setWithDraw(user1.getWithDraw());
        savings.setBalance(user1.getBalance());
        savings.setOwerName(user1.getOwerName());
        savings.setAccountNumber(user1.getAccountNumber());


        if(user1.getAccountType()=="Savings"){
            System.out.println("Name:" +user1.getAccountType());
            System.out.println("owerName:" +user1.getOwerName());
            System.out.println("AccountNo:"+user1.getAccountNumber());
            System.out.println("despoist:" +user1.getDespoist());
            System.out.println("Balance:" +user1.getBalance());
            System.out.println(savings.getCreateFixedDeposit());
        }
     System.out.println("**************************************");

        user2.setDespoist(5000);
        user2.setWithDraw(0);
        user2.setBalance(5000);
        user2.setOwerName("dhanya");
        user2.setAccountNumber(987654321);
        user2.setAccountType("Current");
        current.setDespoist(user2.getDespoist());
        current.setWithDraw(user2.getWithDraw());
        current.setBalance(user2.getBalance());
        current.setOwerName(user2.getOwerName());
        current.setAccountNumber(user2.getAccountNumber());
        current.setAccountType(user2.getAccountType());

        if(user2.getAccountType()=="Current"){
            System.out.println("Name:" +user2.getAccountType());
            System.out.println("owerName:" +user2.getOwerName());
            System.out.println("AccountNo:"+user2.getAccountNumber());
            System.out.println("despoist:" +user2.getDespoist());
            System.out.println("Balance:" +user2.getBalance());
            System.out.println(current.getEnabledOverdraft());
        }

    }
}
