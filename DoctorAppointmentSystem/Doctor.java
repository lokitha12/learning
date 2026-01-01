package DoctorAppointmentSystem;

public abstract class Doctor implements DoctorInterface {
    private String appointmentId;
    private int consultationFee;
    private PatientInterface patient;
    public String getAppointment() {
        return appointmentId;
    }

    public void setAppointment(String appointment) {
        this.appointmentId = appointment;
    }

    public int getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(int consultationFee) {
        this.consultationFee = consultationFee;
    }

    public void bookAppointment(){
        System.out.println("Appointment Booked for");
        System.out.println(patient.getSymptoms());
        System.out.println("consultationFee");
        System.out.println(consultationFee);
    }

    public PatientInterface getPatient() {
        return patient;
    }

    public void setPatient(PatientInterface patient) {
        this.patient = patient;
    }
}
