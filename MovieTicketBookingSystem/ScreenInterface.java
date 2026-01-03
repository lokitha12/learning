package MovieTicketBookingSystem;

public interface ScreenInterface {
    public String getBookingId();
    public void setBookingId(String bookingId);
    public int getTicketPrice();
    public void setTicketPrice(int ticketPrice);
    public int getSanckPrice();
    public void setSanckPrice(int sanckPrice);
    public int getTotalBill();
    public void setTotalBill(int totalBill);
    public void calculateTicketPrice();
    public void calculateSnackPrice();
    public void generateBill();
    public void applyDiscount();
    public  ViewerInterface getViewer();
    public void setViewer( ViewerInterface viewer);
}
