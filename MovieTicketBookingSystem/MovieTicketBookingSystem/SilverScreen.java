package MovieTicketBookingSystem;

public class SilverScreen extends Screen implements SilverScreenInteface  {


    SilverScreen(String bookingId, int ticketPrice,int sanckPrice,ViewerInterface viewer){
        this.setBookingId (bookingId);
        this.setTicketPrice(ticketPrice);
        this.setSanckPrice (sanckPrice);
        this.setViewer(viewer);
    }
    SilverScreen(){}


}
