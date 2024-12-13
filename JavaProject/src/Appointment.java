public class Appointment {
    private String DoctorName;
    private String DoctorId;
    private String PatientName;
    private String appointmentDateTime;

    public Appointment( String patientName,String doctorName,String DoctorId, String appointmentDateTime) {

        this.PatientName = patientName;
        this.DoctorName = doctorName;
        this.DoctorId=DoctorId;
        this.appointmentDateTime = appointmentDateTime;
    }
    public String getPatientName() {
        return PatientName;
    }

    public String getDoctorName() {
        return DoctorName;
    }
    public String getDoctorId() {
        return DoctorId;
    }


    public String getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public String toString() {

        return "Appointment Details:\nDoctor: " + DoctorName + "\nPatient: " + PatientName + "\nDate & Time: " + appointmentDateTime;
    }
}

