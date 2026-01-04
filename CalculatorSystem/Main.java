package CalculatorSystem;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre your number1 : ");
        BigInteger number1= new BigInteger(sc.nextLine());
        System.out.println("Entre your number2 : ");
        BigInteger number2= new BigInteger(sc.nextLine());
        System.out.println("Entre your number3 : ");
        BigInteger number3= new BigInteger(sc.nextLine());
        System.out.println("Enter your type:");
        String type =sc.nextLine();
        UserInterface user1 = new User(number1.intValue(),number2.intValue(),number3.intValue(),type);

        if(user1.getCalculatorType().equals("adder")){
            AdderInterface add = new Adder("ca23",user1);
            CalculatorInterface []arr=user1.getCalculator();
            arr[0]=add;
            add.compute();
        }
        else{
            MultiplierInterface  multi = new  Multiplier("ms23",user1);
            CalculatorInterface []arr=user1.getCalculator();
            arr[1]= multi;
            multi.compute();
        }

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Entre your number1 : ");
        BigInteger num1= new BigInteger(sc1.nextLine());
        System.out.println("Entre your number2 : ");
        BigInteger num2= new BigInteger(sc1.nextLine());
        System.out.println("Entre your number3 : ");
        BigInteger num3= new BigInteger(sc.nextLine());
        System.out.println("Enter your type");
        String type1 =sc.nextLine();
        UserInterface user2 = new User(num1.intValue(),num2.intValue(),num3.intValue(),type1);

        if(user1.getCalculatorType().equals("adder")){
            AdderInterface add = new Adder("ca24",user2);
            CalculatorInterface []arr=user2.getCalculator();
            arr[0]=add;
            add.compute();
        }
        else{
            MultiplierInterface  multi = new  Multiplier("ms23",user2);
            CalculatorInterface []arr=user2.getCalculator();
            arr[1]=multi;
            multi.compute();
        }
    }
}
