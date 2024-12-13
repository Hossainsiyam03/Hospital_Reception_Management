import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginScreen() {
        setTitle("ParaDox Hospital");
        setSize(700, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(140, 100, 80, 25);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(220, 100, 160, 25);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(140, 140, 80, 25);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(220, 140, 160, 25);
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(380, 180, 80, 25);
        add(loginButton);


        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("siam1223") && password.equals("siam1223")) {
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    dispose();
                    new HospitalManagementSystem();//main function suru korsi
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginScreen().setVisible(true));
    }
}
