package VehicleRentalSystem;

public interface BikeInterface extends BaseFunctionalitiesInterface  {
    public void book(int days);
    public void cancel();
    public void helment(String helment);
}
