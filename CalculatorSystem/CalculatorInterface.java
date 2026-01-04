package CalculatorSystem;

public interface CalculatorInterface {
    public void setCalculatorId(String calculatorId);
    public int getResult();
    public void setResult(int result);
    public UserInterface getUser();
    public void setUser(UserInterface user);
}
