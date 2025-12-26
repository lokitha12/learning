package VehicleRentalSystem;

public class Car extends Vehical implements CarInterface{


    public void book(int days){
        int rent = this.getRent()* days;
        System.out.println("Booked Sucessful");
        System.out.println("Rent");
        System.out.println(rent);
        System.out.println("Days");
        System.out.println(days);
    }

    public void cancel(){
        int rent = this.getRent()* this.getRent();
        this.setRent(rent);
        System.out.println("Booking cancled");
    }

    public void Driver(String driver){
        System.out.println("Driver inculed");
    }
}
