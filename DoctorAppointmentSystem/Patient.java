package DoctorAppointmentSystem;

public class Patient implements PatientInterface{
    private  String symptoms;
    private String doctorType;
    private DoctorInterface special;
    private DoctorInterface general;

    Patient(){

    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(String doctorType) {
        this.doctorType = doctorType;
    }


    public DoctorInterface getSpecial() {
        return special;
    }
    public void setSpecial(DoctorInterface special)
     {
        this.special = special;
    }

    public DoctorInterface getGeneral() {
        return general;
    }

    public void setGeneral(DoctorInterface general) {
        this.general = general;
    }
}
