package MovieTicketBookingSystem;

public class Viewer implements ViewerInterface {
    private int numberOfSeats;
    private String screenType;
    private String wantsSnacks;
    private int sanckQuantity;
    private ScreenInterface [] screen = new ScreenInterface[2];


    Viewer(){

    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getWantsSnacks() {
        return wantsSnacks;
    }

    public void setWantsSnacks(String wantsSnacks) {
        this.wantsSnacks = wantsSnacks;
    }

    public int getSanckQuantity() {
        return sanckQuantity;
    }
    public void setSanckQuantity(int sanckQuantity) {
        this.sanckQuantity = sanckQuantity;
    }


    public ScreenInterface[] getScreen() {
        return screen;
    }

    public void setScreen(ScreenInterface[] screen) {
        this.screen = screen;
    }
}
