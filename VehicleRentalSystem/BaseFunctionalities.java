package VehicleRentalSystem;

public abstract class BaseFunctionalities implements  BaseFunctionalitiesInterface {
    private int vehicleNo;
    private int rent;

    public int getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }


}
