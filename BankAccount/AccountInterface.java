package BankAccount;

public interface AccountInterface{
    public int getDespoist();
    public int getWithDraw();
    public int getAccountNumber();
    public String getOwerName();
    public int getBalance();
    public void setDespoist (int despoist);
    public void  setWithDraw(int withDraw);
    public void  setAccountNumber(int AccountNumber);
    public void setOwerName(String owerName);
    public void setBalance(int balance);
    public void  setAccountType(String AccountType);
    public String getAccountType();
}