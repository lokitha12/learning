package RideBookingSystem;

public class Passenger {
    private String destination;
    private String rideType;
    private AutoRide auto;
    private CabRide cab;


    Passenger(String destination,String rideType){
        this.destination=destination;
        this.rideType=rideType;
    }
    Passenger(){

    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }


    public AutoRide getAuto() {
        return auto;
    }

    public void setAuto(AutoRide auto) {
        this.auto = auto;
    }

    public CabRide getCab() {
        return cab;
    }

    public void setCab(CabRide cab) {
        this.cab = cab;
    }
}
