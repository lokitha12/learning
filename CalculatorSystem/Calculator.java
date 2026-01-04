package CalculatorSystem;

public abstract class Calculator implements CalculatorInterface {
    private String calculatorId;
    private int result;
    private UserInterface user;
    public String getCalculatorId() {
        return calculatorId;
    }

    public void setCalculatorId(String calculatorId) {
        this.calculatorId = calculatorId;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    public UserInterface getUser() {
        return user;
    }

    public void setUser(UserInterface user) {
        this.user = user;
    }
}
