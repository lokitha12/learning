package DoctorAppointmentSystem;

public class SpecialistDoctor extends Doctor implements SpecialistDoctorInterface {


    SpecialistDoctor(String appointment,int consultationFee){
        this. setAppointment(appointment);
        this.setConsultationFee(consultationFee);
    }
    SpecialistDoctor(){

    }

}
