package MovieTicketBookingSystem;

public class GoldScreen extends Screen implements GoldScreenInterface{


    GoldScreen(String bookingId, int ticketPrice,int sanckPrice,ViewerInterface viewer){
       this.setBookingId (bookingId);
       this.setTicketPrice(ticketPrice);
       this.setSanckPrice (sanckPrice);
       this.setViewer(viewer);
    }
    GoldScreen(){}


}
