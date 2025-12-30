package RideBookingSystem;

public class CabRide {
    private String rideId;
    private int fare;

    private Passenger passenger;

    CabRide(String rideId, int fare){
        this.rideId=rideId;
        this.fare=fare;
    }
    CabRide(){

    }
    public String getRideId() {
        return rideId;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public void startRide(String destination ){
        System.out.println("ride started to");
        System.out.println(destination );
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
