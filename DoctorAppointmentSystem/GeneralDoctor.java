package DoctorAppointmentSystem;

public class GeneralDoctor extends Doctor implements GeneralDoctorInterface   {


    GeneralDoctor(String appointment,int consultationFee){
        this. setAppointment(appointment);
        this.setConsultationFee(consultationFee);
    }
    GeneralDoctor(){

    }

}

