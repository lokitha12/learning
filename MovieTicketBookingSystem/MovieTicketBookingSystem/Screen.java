package MovieTicketBookingSystem;

public abstract class Screen implements ScreenInterface {
    private String bookingId;
    private int ticketPrice;
    private  int sanckPrice;
    private int totalBill;
    private ViewerInterface viewer;


    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getSanckPrice() {
        return sanckPrice;
    }

    public void setSanckPrice(int sanckPrice) {
        this.sanckPrice = sanckPrice;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }


    public void calculateTicketPrice(){
        this.ticketPrice=viewer.getNumberOfSeats()*this.ticketPrice;
        System.out.println("Ticket Price");
        System.out.println(ticketPrice);
    }
    public void calculateSnackPrice(){
        if(viewer.getWantsSnacks().equals("yes")){
            this.sanckPrice= viewer.getSanckQuantity() * this.sanckPrice;
            System.out.println("Sanck Price ");
            System.out.println(sanckPrice);
        }
        else{
            System.out.println("Sanck price = 0");
        }
    }
    public void generateBill() {
        if (viewer.getScreenType() == "Gold") {
            this.totalBill = this.ticketPrice + this.sanckPrice + 100;
            System.out.println("Total bill");
            System.out.println(totalBill);
        }
        else{
            this.totalBill = this.ticketPrice + this.sanckPrice + 50;
            System.out.println("Total bill");
            System.out.println(totalBill);
        }
    }
    public void applyDiscount(){
        if(viewer.getNumberOfSeats()>=4){
            int discount = this.totalBill*10/100;
            int discountAmount =this.totalBill-discount;
            System.out.println("Discount Applied");
            System.out.println(discountAmount);
        }
        else{
            System.out.println("No discount amount");
        }
    }
    public  ViewerInterface getViewer() {
        return viewer;
    }

    public void setViewer( ViewerInterface viewer) {
        this.viewer = viewer;
    }
}
