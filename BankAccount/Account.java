package BankAccount;

public abstract class Account implements AccountInterface {
    private int despoist;
    private int withDraw;
    private int accountNumber;
    private String owerName;
    private int balance;
    private String accountType;

    public int getDespoist(){
        return this.despoist;
    }
    public int getWithDraw(){
        return this.withDraw;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public String getAccountType(){
        return this.accountType;
    }
    public String getOwerName(){
        return this.owerName;
    }
    public int getBalance(){
        return this.balance;
    }

    public void setDespoist (int despoist){
        this.despoist=despoist;}
    public void  setWithDraw(int withDraw){
        this.withDraw=withDraw;
    }
    public void  setAccountNumber(int AccountNumber){
        this.accountNumber=AccountNumber;
    }
    public void  setAccountType(String AccountType){
        this.accountType=AccountType;
    }
    public void setOwerName(String owerName){
        this.owerName=owerName;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
}