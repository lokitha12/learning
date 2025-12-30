package RideBookingSystem;

public class Main {
    public static void main(String args[]){
        Passenger passenger = new Passenger("kprcas","cabride");
        Passenger passenger2 = new Passenger("rvs","autoride");

        if(passenger.getRideType ()=="cabride"){
            CabRide cab = new CabRide("cb2334",100);
            cab.startRide(passenger.getDestination());
            System.out.println(cab.getRideId());
            System.out.println(cab.getFare());
        }
        if(passenger2.getRideType ()=="autoride"){
            AutoRide auto = new AutoRide();
           auto.setRideId("ab546");
            auto.setFare(50);
            auto.startRide(passenger2.getDestination());
            System.out.println(passenger2.getAuto().getRideId());
            System.out.println(passenger2.getAuto().getFare());
        }

    }
}
