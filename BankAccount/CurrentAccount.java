package BankAccount;

public class CurrentAccount extends Account implements CurrentAccountInterface {
    private String enabledOverdraft;

    public void setEnabledOverdraft(String enabledOverdraft) {
        this.enabledOverdraft = enabledOverdraft;
    }

    public String getEnabledOverdraft(){
        return "enabledOverdraft";
    }
}
