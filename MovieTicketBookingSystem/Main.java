package MovieTicketBookingSystem;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        ViewerInterface v1 = new Viewer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your seats ");
        BigInteger seats = new BigInteger(sc.nextLine());
        System.out.println("Enter your Screen Type");
        String type = sc.nextLine();
        System.out.println("Enter your Snacks");
        String snacks = sc.nextLine();
        System.out.println("Enter your Snacks quantity ");
        BigInteger quantity = new BigInteger(sc.nextLine());
        v1.setNumberOfSeats(seats .intValue());
        v1.setScreenType(type);
        v1.setWantsSnacks(snacks);
        v1.setSanckQuantity(quantity.intValue());

        if(v1.getScreenType().equals("Gold")){
            System.out.println("======VIEWER 1======");
            ScreenInterface gold = new  GoldScreen("g234",500,150,v1);
            ScreenInterface [] arr = v1.getScreen();
            arr[0]=(gold);
            gold.calculateTicketPrice();
            gold.calculateSnackPrice();
            gold.generateBill();
            gold.applyDiscount();
            System.out.println(arr[0].getBookingId());
        }
        else{
            System.out.println("======VIEWER 2======");
            ScreenInterface silver = new  SilverScreen("s34",200,150,v1);
            ScreenInterface [] arr = v1.getScreen();
            arr[1]=(silver);
            silver .calculateTicketPrice();
            silver .calculateSnackPrice();
            silver .generateBill();
            silver .applyDiscount();
            System.out.println(arr[1].getBookingId());
        }


        ViewerInterface v2 = new Viewer();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your seats ");
        BigInteger seat1 = new BigInteger(sc.nextLine());
        System.out.println("Enter your Screen Type");
        String type1 = sc.nextLine();
        System.out.println("Enter your Snacks");
        String snacks1 = sc.nextLine();
        System.out.println("Enter your Snacks quantity ");
        BigInteger quantity1 = new BigInteger(sc.nextLine());
        v2.setNumberOfSeats(seat1 .intValue());
        v2.setScreenType(type1);
        v2.setWantsSnacks(snacks1);
        v2.setSanckQuantity(quantity1.intValue());

        if(v2.getScreenType().equals("Gold")){
            System.out.println("======VIEWER 1======");
            ScreenInterface gold = new  GoldScreen("g2564",500,150,v2);
            ScreenInterface [] arr = v1.getScreen();
            arr[0]=(gold);
            gold.calculateTicketPrice();
            gold.calculateSnackPrice();
            gold.generateBill();
            gold.applyDiscount();
            System.out.println(arr[0].getBookingId());
        }
        else{
            System.out.println("======VIEWER 2======");
            ScreenInterface silver = new  SilverScreen("s874",200,150,v2);
            ScreenInterface [] arr = v1.getScreen();
            arr[1]=(silver);
            silver .calculateTicketPrice();
            silver .calculateSnackPrice();
            silver .generateBill();
            silver .applyDiscount();
            System.out.println(arr[1].getBookingId());
        }
}
}
