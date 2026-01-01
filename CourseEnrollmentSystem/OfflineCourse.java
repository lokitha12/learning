package CourseEnrollmentSystem;

public class OfflineCourse extends Course implements OfflineCourseInterface {

    OfflineCourse(String courseId, int fee) {
        this.setCourseId( courseId);
        this.setFee( fee);
    }

    OfflineCourse() {

    }

}
