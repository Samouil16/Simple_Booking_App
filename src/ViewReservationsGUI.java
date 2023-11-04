import javax.swing.*;
import java.awt.*;

public class ViewReservationsGUI extends JPanel {

    JLabel title;
    JButton backButton;
    JButton next;
    JLabel costumer, provider, name, fromDate, toDate, price;

    ViewReservationsGUI(){

        setBounds(300,90,900,600);

        setLayout(null);

        title = new JLabel("View Reservations");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300,30);
        title.setLocation(300,30);
        add(title);

        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial",Font.PLAIN,15));
        backButton.setSize(100,20);
        backButton.setLocation(30,30);
        add(backButton);


        costumer = new JLabel("View Reservations");
        costumer.setFont(new Font("Arial", Font.PLAIN, 30));
        costumer.setSize(300,30);
        costumer.setLocation(200,250);

        provider = new JLabel("View Reservations");
        provider.setFont(new Font("Arial", Font.PLAIN, 30));
        provider.setSize(300,30);
        provider.setLocation(600,250);

        name = new JLabel("View Reservations");
        name.setFont(new Font("Arial", Font.PLAIN, 30));
        name.setSize(300,30);
        name.setLocation(400,150);

        fromDate = new JLabel("View Reservations");
        fromDate.setFont(new Font("Arial", Font.PLAIN, 30));
        fromDate.setSize(300,30);
        fromDate.setLocation(200,350);

        toDate = new JLabel("View Reservations");
        toDate.setFont(new Font("Arial", Font.PLAIN, 30));
        toDate.setSize(300,30);
        toDate.setLocation(600,350);

        price = new JLabel("View Reservations");
        price.setFont(new Font("Arial", Font.PLAIN, 30));
        price.setSize(300,30);
        price.setLocation(400,450);

        next = new JButton("Next");
        next.setFont(new Font("Arial",Font.PLAIN,15));
        next.setSize(100,20);
        next.setLocation(750,500);
        add(next);


        add(provider);
        add(costumer);
        add(fromDate);
        add(toDate);
        add(price);
        add(name);

    }

}
