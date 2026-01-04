package CalculatorSystem;

public class Adder extends Calculator implements AdderInterface{

    Adder(String calculatorId,UserInterface user){
        this.setCalculatorId(calculatorId);
        this.setUser(user);
    }


    public void compute(){
      int result=getUser().getNum1()+getUser().getNum2()+getUser().getNum3();
       System.out.println("Adder result");
       System.out.println(result);
    }
}
