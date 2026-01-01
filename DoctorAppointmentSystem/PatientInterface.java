package DoctorAppointmentSystem;

public interface PatientInterface {
    public String getSymptoms();
    public void setSymptoms(String symptoms);
    public String getDoctorType();
    public void setDoctorType(String doctorType);
    public DoctorInterface getSpecial();
    public void setSpecial(DoctorInterface special);
    public DoctorInterface getGeneral();
    public void setGeneral(DoctorInterface general);
}
