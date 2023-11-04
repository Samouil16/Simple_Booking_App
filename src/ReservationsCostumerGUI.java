import javax.swing.*;
import java.awt.*;

public class ReservationsCostumerGUI extends JPanel {

    JLabel title;
    JButton backButton;

    JButton next,cancel;
    JLabel provider, name, fromDate, toDate, price;

    ReservationsCostumerGUI(){
        setBounds(300,90,900,600);
        setLayout(null);

        title = new JLabel("Reservations");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(300,30);
        title.setLocation(400,30);

        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial",Font.PLAIN,15));
        backButton.setSize(100,20);
        backButton.setLocation(30,30);

        provider = new JLabel("");
        provider.setFont(new Font("Arial", Font.PLAIN, 30));
        provider.setSize(300,30);
        provider.setLocation(200,250);

        name = new JLabel("");
        name.setFont(new Font("Arial", Font.PLAIN, 30));
        name.setSize(500,30);
        name.setLocation(250,150);

        fromDate = new JLabel("");
        fromDate.setFont(new Font("Arial", Font.PLAIN, 30));
        fromDate.setSize(300,30);
        fromDate.setLocation(200,350);

        toDate = new JLabel("");
        toDate.setFont(new Font("Arial", Font.PLAIN, 30));
        toDate.setSize(300,30);
        toDate.setLocation(600,350);

        price = new JLabel("");
        price.setFont(new Font("Arial", Font.PLAIN, 30));
        price.setSize(300,30);
        price.setLocation(400,450);

        next = new JButton("Next");
        next.setFont(new Font("Arial",Font.PLAIN,15));
        next.setSize(100,20);
        next.setLocation(750,500);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Arial",Font.PLAIN,15));
        cancel.setSize(100,20);
        cancel.setLocation(150,500);

        add(title);
        add(backButton);
        add(provider);
        add(fromDate);
        add(toDate);
        add(price);
        add(name);
        add(next);
        add(cancel);
    }

}
