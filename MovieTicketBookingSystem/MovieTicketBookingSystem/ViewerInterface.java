package MovieTicketBookingSystem;

public interface ViewerInterface {
    public int getNumberOfSeats();
    public void setNumberOfSeats(int numberOfSeats);
    public String getScreenType();
    public void setScreenType(String screenType);
    public String getWantsSnacks();
    public void setWantsSnacks(String wantsSnacks);
    public int getSanckQuantity();
    public void setSanckQuantity(int sanckQuantity);
    public ScreenInterface[] getScreen();
    public void setScreen(ScreenInterface[] screen);
}
