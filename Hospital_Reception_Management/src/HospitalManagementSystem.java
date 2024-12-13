import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HospitalManagementSystem extends JFrame {
    private Receptionist receptionist;

    public HospitalManagementSystem() {
        receptionist = new Receptionist();
        setTitle("Hospital Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Add Patient Button
        JButton addPatientButton = new JButton("Add Patient");
        addPatientButton.setBounds(50, 50, 150, 25);
        add(addPatientButton);

        // Add Doctor Button
        JButton addDoctorButton = new JButton("Add Doctor");
        addDoctorButton.setBounds(50, 100, 150, 25);
        add(addDoctorButton);

        // View Patients Button
        JButton viewPatientsButton = new JButton("View Patients");
        viewPatientsButton.setBounds(220, 50, 150, 25);
        add(viewPatientsButton);

        // View Doctors Button
        JButton viewDoctorsButton = new JButton("View Doctors");
        viewDoctorsButton.setBounds(220, 100, 150, 25);
        add(viewDoctorsButton);

        // Action Listeners
        addPatientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Enter Patient Name:");
                int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Patient Age:"));
                String ailment = JOptionPane.showInputDialog("Enter Patient Ailment:");

                receptionist.addPatient(new Patient(name, age, ailment));
                JOptionPane.showMessageDialog(null, "Patient Added Successfully");
            }
        });

        addDoctorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Enter Doctor Name:");
                String specialization = JOptionPane.showInputDialog("Enter Doctor Specialization:");

                receptionist.addDoctor(new Doctor(name, specialization));
                JOptionPane.showMessageDialog(null, "Doctor Added Successfully");
            }
        });

        viewPatientsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder patientsList = new StringBuilder("Patients List:\n");
                for (Patient patient : receptionist.getPatients()) {
                    patientsList.append(patient).append("\n");
                }
                JOptionPane.showMessageDialog(null, patientsList.toString());
            }
        });

        viewDoctorsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder doctorsList = new StringBuilder("Doctors List:\n");
                for (Doctor doctor : receptionist.getDoctors()) {
                    doctorsList.append(doctor).append("\n");
                }
                JOptionPane.showMessageDialog(null, doctorsList.toString());
            }
        });

        setVisible(true);
    }
}

