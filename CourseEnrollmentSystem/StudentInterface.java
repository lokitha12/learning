package CourseEnrollmentSystem;

public interface StudentInterface {
    public int getDuration();
    public void setDuration(int duration);
    public String getCourseType();
    public void setCourseType(String courseType);
    public CourseInterface getOnline();
    public void setOnline(CourseInterface online);
    public CourseInterface getOffline();
    public void setOffline(CourseInterface offline);
}
