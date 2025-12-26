package VehicleRentalSystem;

public class Main {
    public static void main(String args[]){
        Customer customer = new Customer();
        BikeInterface bike = new Bike();
        CarInterface car = new Car();

        customer.setVehicleType("Bike");
        customer.setRentalDays(3);

        bike.setVehicleNo(3456);
        bike.setRent(200);
        bike.book(customer.getRentalDays());
        bike.helment("Helment Included");

        System.out.println("************************************************");

        Customer customer2 = new Customer();

        customer2.setVehicleType("Car");
        customer2.setRentalDays(5);

        car.setVehicleNo(3456);
        car.setRent(300);
        car.book(customer2.getRentalDays());
        car.Driver("Driver Included");
    }
}
