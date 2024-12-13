import java.util.ArrayList;

public class Receptionist1 {
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }
    public static void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public static ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public static ArrayList<Patient> getPatients() {
        return patients;
    }
    public static ArrayList<Appointment> getAppointments() {
        return appointments;
    }
}
