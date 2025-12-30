package RideBookingSystem;

public class AutoRide {
    private String rideId;
    private int fare;


    AutoRide(String rideId, int fare){
        this.rideId=rideId;
        this.fare=fare;
    }
    AutoRide(){
        this.rideId=null;
        this.fare=0;
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
}
