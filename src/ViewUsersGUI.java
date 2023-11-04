import javax.swing.*;
import java.awt.*;

public class ViewUsersGUI extends JPanel {

    JLabel title;
    JButton backButton;

    JButton next;

    JLabel name, surname, email, username, kind;

    ViewUsersGUI(){

        setBounds(300,90,900,600);
        setLayout(null);

        title = new JLabel("View Users");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(500,35);
        title.setLocation(350,30);

        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial",Font.PLAIN,15));
        backButton.setSize(100,20);
        backButton.setLocation(30,30);


        name = new JLabel("");
        name.setFont(new Font("Arial",Font.PLAIN,30));
        name.setSize(500,35);
        name.setLocation(250,150);

        surname = new JLabel("");
        surname.setFont(new Font("Arial",Font.PLAIN,30));
        surname.setSize(500,35);
        surname.setLocation(250,200);

        email = new JLabel("");
        email.setFont(new Font("Arial",Font.PLAIN,30));
        email.setSize(500,35);
        email.setLocation(250,250);

        username = new JLabel("");
        username.setFont(new Font("Arial",Font.PLAIN,30));
        username.setSize(500,35);
        username.setLocation(250,300);

        kind = new JLabel("");
        kind.setFont(new Font("Arial",Font.PLAIN,30));
        kind.setSize(500,35);
        kind.setLocation(250,350);


        next = new JButton("Next");
        next.setFont(new Font("Arial",Font.PLAIN,15));
        next.setSize(100,20);
        next.setLocation(750,500);


        add(title);
        add(backButton);
        add(next);
        add(name);
        add(surname);
        add(email);
        add(kind);
        add(username);
    }

}
