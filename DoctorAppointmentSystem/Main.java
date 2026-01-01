package DoctorAppointmentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        PatientInterface p1 = new Patient();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Symptoms");
        String symptoms=sc.nextLine();
        System.out.println("Enter your doctorType");
        String doctorType=sc.nextLine();
        p1.setSymptoms(symptoms);
        p1.setDoctorType(doctorType);

        if(p1.getDoctorType()=="General"){
            DoctorInterface general = new GeneralDoctor("g23",200);
            general.setPatient(p1);
            general.bookAppointment();
            p1.setGeneral(general);
            System.out.println(p1.getGeneral().getAppointment());

        }
        else{
            DoctorInterface special = new SpecialistDoctor("s29",500);
            special.setPatient(p1);
            special.bookAppointment();
            p1.setSpecial(special);
            System.out.println(p1.getSpecial().getAppointment());

        }

        PatientInterface p2 = new Patient();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your Symptoms");
        String inputSymptoms=sc1.nextLine();
        System.out.println("Enter your doctorType");
        String doctorType1=sc.nextLine();
        p2.setSymptoms(inputSymptoms);
        p2.setDoctorType(doctorType1);

        if(p2.getDoctorType()=="General"){
            DoctorInterface general = new GeneralDoctor("g23",200);
            general.setPatient(p2);
            general.bookAppointment();
            p2.setGeneral(general);
            System.out.println(p2.getGeneral().getAppointment());

        }
        else{
            DoctorInterface special = new SpecialistDoctor("s29",500);
            special.setPatient(p2);
            special.bookAppointment();
            p2.setSpecial(special);
            System.out.println(p2.getSpecial().getAppointment());

        }
    }
}
