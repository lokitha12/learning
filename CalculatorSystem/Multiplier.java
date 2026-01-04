package CalculatorSystem;

public class Multiplier extends Calculator implements MultiplierInterface  {

    Multiplier(String calculatorId, UserInterface user){
        this.setCalculatorId(calculatorId);
        this.setUser(user);
    }
    public void compute(){
        int result=getUser().getNum1()*getUser().getNum2()*getUser().getNum3();
        System.out.println("Mutiplier result");
        System.out.println(result);
    }

}

