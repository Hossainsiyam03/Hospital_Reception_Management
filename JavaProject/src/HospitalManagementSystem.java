import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class HospitalManagementSystem extends JFrame {

    public HospitalManagementSystem() {
        Receptionist1 receptionist1 = new Receptionist1();
        setTitle("Hospital Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton addPatientButton = new JButton("Add Patient");
        addPatientButton.setBounds(90, 70, 150, 25);
        add(addPatientButton);

        JButton addDoctorButton = new JButton("Add Doctor");
        addDoctorButton.setBounds(90, 120, 150, 25);
        add(addDoctorButton);

        JButton viewPatientsButton = new JButton("View Patients");
        viewPatientsButton.setBounds(310, 70, 150, 25);
        add(viewPatientsButton);

        JButton viewDoctorsButton = new JButton("View Doctors");
        viewDoctorsButton.setBounds(310, 120, 150, 25);
        add(viewDoctorsButton);

        JButton appointmentButton = new JButton("Appointment Schedule");
        appointmentButton.setBounds(90, 170, 200, 25);
        add(appointmentButton);

        JButton viewAppointmentsButton = new JButton("View Appointments");
        viewAppointmentsButton.setBounds(310, 170, 150, 25);
        add(viewAppointmentsButton);

        JButton ExitButton = new JButton("Exit");
        ExitButton.setBounds(170, 300, 200, 25);
        add(ExitButton);

        ExitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                    dispose();
                    new LoginScreen().setVisible(true);
            }
        }
        );

        addPatientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Enter Patient Name:");
                int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Patient Age:"));
                String problem = JOptionPane.showInputDialog("Enter Patient Problem:");
                String Address = JOptionPane.showInputDialog("Present Address:");
                String Phone = JOptionPane.showInputDialog("Phone Number:");

                receptionist1.addPatient(new Patient(name, age, problem, Address,Phone));
                JOptionPane.showMessageDialog(null, "Patient Added Successfully");
            }
        }
        );

        addDoctorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Enter Doctor Name:");
                String specialization = JOptionPane.showInputDialog("Enter Doctor Specialization:");
                String Phone = JOptionPane.showInputDialog("Phone Number:");
                int Fees = Integer.parseInt(JOptionPane.showInputDialog("Doctor Fees:"));
                String DoctorId = JOptionPane.showInputDialog("DoctorID:");

                receptionist1.addDoctor(new Doctor(name, specialization,Phone,Fees,DoctorId));
                JOptionPane.showMessageDialog(null, "Doctor Added Successfully");
            }
        });

        viewPatientsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                List<Patient> patients = Receptionist1.getPatients();
                if (patients == null || patients.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Patient Records are not available.");
                } else {
                    StringBuilder patientsList = new StringBuilder("Patients List:\n");
                    for (Patient patient : Receptionist1.getPatients()) {
                        patientsList.append(patient).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, patientsList.toString());
                }
            }
        }
        );

        viewDoctorsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                List<Doctor> doctors = Receptionist1.getDoctors();
                if (doctors == null || doctors.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No doctors are available.");
                }
                else {
                    StringBuilder doctorsList = new StringBuilder("Doctors List:\n");
                    for (Doctor doctor : Receptionist1.getDoctors()) {
                        doctorsList.append(doctor).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, doctorsList.toString());
                }
            }
        }
        );

        appointmentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Receptionist1.getDoctors().isEmpty() || Receptionist1.getPatients().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please add both doctors and patients first.");
                } else {

                    String patientName = JOptionPane.showInputDialog("Enter Patient's Name:");
                    String doctorName = JOptionPane.showInputDialog("Enter Doctor's Name:");
                    String DoctorId = JOptionPane.showInputDialog("Enter Doctor's Name:");
                    String dateTime = JOptionPane.showInputDialog("Enter Appointment Date & Time (yyyy-MM-dd):");

                    Appointment appointment = new Appointment(patientName, doctorName,DoctorId, dateTime);
                    Receptionist1.scheduleAppointment(appointment);
                    JOptionPane.showMessageDialog(null, "Appointment Scheduled Successfully");
                }
            }
        }
        );
        viewAppointmentsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Receptionist1.getAppointments().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "There are no Appointments Schedule Inserted.");

                } else {
                    StringBuilder appointmentsList = new StringBuilder("Appointments List:\n");
                    for (Appointment appointment : Receptionist1.getAppointments()) {
                        appointmentsList.append(appointment).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, appointmentsList.toString());
                }
            }
        }
        );

        setVisible(true);
    }
}
