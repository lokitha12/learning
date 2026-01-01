package CourseEnrollmentSystem;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String agrs[]){

        StudentInterface s1 = new Student(8, "online");
        StudentInterface s2 = new Student();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the duration");
        BigInteger duration=  new BigInteger(sc.nextLine());
        System.out.println("Enter the Course Type");
        String courseType = sc.nextLine();

        s2.setDuration(duration .intValue());
        s2.setCourseType(courseType);

        if(s1.getCourseType()=="online"){
            CourseInterface oc = new OnlineCourse("oc43",500);
            oc.setStudent(s1);
            oc.enroll();
            s1.setOnline(oc);
            System.out.println(s1.getOnline().getCourseId());

        }
        else{
            CourseInterface of = new OfflineCourse("of436",1000);
            of.setStudent(s1);
            of.enroll();
            s1.setOffline(of);
            System.out.println(s1.getOnline().getCourseId());

        }

        if(s2.getCourseType()=="online"){
            CourseInterface oc = new OnlineCourse("oc73",500);
            oc.setStudent(s2);
            oc.enroll();
            s2.setOnline(oc);
            System.out.println(s2.getOnline().getCourseId());

        }
        else{
            CourseInterface of = new OfflineCourse("of678",1000);
            of.setStudent(s2);
            of.enroll();
            s2.setOffline(of);
            System.out.println(s2.getOffline().getCourseId());

        }


    }
}
