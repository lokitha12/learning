package VehicleRentalSystem;

public interface CarInterface extends BaseFunctionalitiesInterface  {
    public void book(int days);
    public void cancel();
    public void Driver(String driver);
}
