package CourseEnrollmentSystem;

public class Student implements StudentInterface{
    private int duration;
    private String courseType;
    private CourseInterface online;
    private CourseInterface offline;

Student(int duration , String courseType){
    this.duration=duration;
    this.courseType=courseType;
}
Student(){

}
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }


    public CourseInterface getOnline() {
        return online;
    }

    public void setOnline(CourseInterface online) {
        this.online = online;
    }

    public CourseInterface getOffline() {
        return offline;
    }

    public void setOffline(CourseInterface offline) {
        this.offline = offline;
    }
}
