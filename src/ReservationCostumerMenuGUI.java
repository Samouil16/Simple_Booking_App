import javax.swing.*;
import java.awt.*;

public class ReservationCostumerMenuGUI extends JPanel {

    JLabel title;
    JButton backButton;

    JButton reservation, cancellation;

    ReservationCostumerMenuGUI(){
        setBounds(300,90,900,600);
        setLayout(null);

        title = new JLabel("Reservation Menu");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(300,30);
        title.setLocation(350,30);

        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial",Font.PLAIN,15));
        backButton.setSize(100,20);
        backButton.setLocation(30,30);

        reservation = new JButton("Reservation");
        reservation.setFont(new Font("Arial",Font.PLAIN,25));
        reservation.setSize(300,40);
        reservation.setLocation(300,250);

        cancellation = new JButton("Cancellation");
        cancellation.setFont(new Font("Arial",Font.PLAIN,25));
        cancellation.setSize(300,40);
        cancellation.setLocation(300,350);


        add(title);
        add(backButton);
        add(reservation);
        add(cancellation);
    }

}
