package DoctorAppointmentSystem;

public interface DoctorInterface {
    public String getAppointment();
    public void setAppointment(String appointment);
    public int getConsultationFee();
    public void setConsultationFee(int consultationFee);
    public void bookAppointment();
    public PatientInterface getPatient();
    public void setPatient(PatientInterface patient);
}
