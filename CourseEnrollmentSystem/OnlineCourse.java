package CourseEnrollmentSystem;

public class OnlineCourse extends Course implements OnlineCourseInterface {
    OnlineCourse(String courseId, int fee){
        this.setCourseId(courseId);
        this.setFee(fee);
    }
    OnlineCourse(){

    }


}
