package BankAccount;

public class SavingsAccount extends Account implements SavingsAccountInterface{
     private String createFixedDeposit;
    public void  setcreateFixedDeposit(String createFixedDeposit ){
       this.createFixedDeposit=createFixedDeposit;
    }
  public String getCreateFixedDeposit(){
        return "createFixedDeposit";
  }


}