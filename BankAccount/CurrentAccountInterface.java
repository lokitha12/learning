package BankAccount;

public interface CurrentAccountInterface extends AccountInterface {

    public void setEnabledOverdraft(String enabledOverdraft);
    public String getEnabledOverdraft();
}
