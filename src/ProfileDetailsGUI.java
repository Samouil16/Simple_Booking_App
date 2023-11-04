import javax.swing.*;
import java.awt.*;

public class ProfileDetailsGUI extends JPanel {
    JLabel title,txtPassword, txtNewPassword;
    JButton backButton,editButton,cPassword;

    JLabel name, surname, email, type, username;
    JTextField tname, tsurname, temail, tusername;
    JPasswordField oldPassword, newPassword;

    ProfileDetailsGUI(){
        setBounds(300,90,900,600);
        setLayout(null);

        title = new JLabel("Profile");
        title.setFont(new Font("Arial", Font.PLAIN,30));
        title.setSize(300,30);
        title.setLocation(380,30);

        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial",Font.PLAIN,15));
        backButton.setSize(100,20);
        backButton.setLocation(30,30);

        editButton = new JButton("Edit");
        editButton.setFont(new Font("Arial",Font.PLAIN,15));
        editButton.setSize(100,20);
        editButton.setLocation(750,500);

        cPassword = new JButton("Change Password");
        cPassword.setFont(new Font("Arial",Font.PLAIN,15));
        cPassword.setSize(250,20);
        cPassword.setLocation(350,370);

        type = new JLabel("");
        type.setFont(new Font("Arial",Font.PLAIN,20));
        type.setSize(150,20);
        type.setLocation(300,150);

        name = new JLabel("");
        name.setFont(new Font("Arial",Font.PLAIN,20));
        name.setSize(150,20);
        name.setLocation(300,180);

        tname= new JTextField("");
        tname.setFont(new Font("Arial",Font.PLAIN,20));
        tname.setSize(150,20);
        tname.setLocation(550,180);

        surname = new JLabel("");
        surname.setFont(new Font("Arial",Font.PLAIN,20));
        surname.setSize(150,20);
        surname.setLocation(300,210);

        tsurname= new JTextField("");
        tsurname.setFont(new Font("Arial",Font.PLAIN,20));
        tsurname.setSize(150,20);
        tsurname.setLocation(550,210);

        email = new JLabel("");
        email.setFont(new Font("Arial",Font.PLAIN,20));
        email.setSize(300,20);
        email.setLocation(300,240);

        temail= new JTextField("");
        temail.setFont(new Font("Arial",Font.PLAIN,20));
        temail.setSize(150,20);
        temail.setLocation(550,240);

        username = new JLabel("");
        username.setFont(new Font("Arial",Font.PLAIN,20));
        username.setSize(150,20);
        username.setLocation(300,270);

        tusername= new JTextField("");
        tusername.setFont(new Font("Arial",Font.PLAIN,20));
        tusername.setSize(150,20);
        tusername.setLocation(550,270);

        oldPassword = new JPasswordField("");
        oldPassword.setFont(new Font("Arial",Font.PLAIN,20));
        oldPassword.setSize(150,20);
        oldPassword.setLocation(300,340);

        newPassword= new JPasswordField("");
        newPassword.setFont(new Font("Arial",Font.PLAIN,20));
        newPassword.setSize(150,20);
        newPassword.setLocation(550,340);

        txtPassword = new JLabel("Enter your last password!");
        txtPassword.setFont(new Font("Arial",Font.PLAIN,20));
        txtPassword.setSize(300,25);
        txtPassword.setLocation(300,310);

        txtNewPassword = new JLabel("Enter your new password!");
        txtNewPassword.setFont(new Font("Arial",Font.PLAIN,20));
        txtNewPassword.setSize(300,20);
        txtNewPassword.setLocation(550,310);


        add(title);
        add(backButton);
        add(editButton);
        add(name);
        add(tname);
        add(surname);
        add(tsurname);
        add(email);
        add(temail);
        add(type);
        add(oldPassword);
        add(newPassword);
        add(cPassword);
        add(username);
        add(tusername);
        add(txtPassword);
        add(txtNewPassword);
    }
}
