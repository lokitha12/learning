package VehicleRentalSystem;

public class Bike extends Vehical implements BikeInterface {
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

    public void helment(String helment){
        System.out.println("Helment inculed");
    }

}
