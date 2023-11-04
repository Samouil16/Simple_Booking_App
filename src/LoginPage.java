import javax.swing.*;
import java.awt.*;


public class LoginPage extends JPanel{
    JButton loginButton;
    JButton registerButton;
    JLabel userLabel, passLabel;
    JTextField userField;
    JPasswordField passField;

    LoginPage(){
        setBounds(300,90,900,600);

        setLayout(null);

        userLabel = new JLabel();
        userLabel.setText("Username");
        userLabel.setFont(new Font("Arial", Font.PLAIN, 27));
        userLabel.setSize(300,30);
        userLabel.setLocation(300,230);

        userField = new JTextField(15);
        userField.setFont(new Font("Arial", Font.PLAIN, 15));
        userField.setSize(150,25);
        userField.setLocation(450,235);

        passLabel = new JLabel();
        passLabel.setText("Password");
        passLabel.setFont(new Font("Arial", Font.PLAIN,27));
        passLabel.setSize(300,30);
        passLabel.setLocation(300,280);

        passField = new JPasswordField(15);
        passField.setFont(new Font("Arial",Font.PLAIN,15));
        passField.setSize(150,25);
        passField.setLocation(450,285);

        registerButton = new JButton("Register");
        registerButton.setFont(new Font("Arial",Font.PLAIN,25));
        registerButton.setSize(145,30);
        registerButton.setLocation(300,335);

        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial",Font.PLAIN,25));
        loginButton.setSize(145,30);
        loginButton.setLocation(450,335);


        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(registerButton);
        add(loginButton);

    }


}
