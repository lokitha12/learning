package CourseEnrollmentSystem;

public abstract class Course implements CourseInterface{
    private String courseId;
    private int fee;
    private StudentInterface student;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }


    public void enroll(){

        this.fee = this.getFee() * this.student.getDuration();
        System.out.println("fee");
        System.out.println(fee);
    }

    public StudentInterface getStudent() {
        return student;
    }

    public void setStudent(StudentInterface student) {
        this.student = student;
    }
}
