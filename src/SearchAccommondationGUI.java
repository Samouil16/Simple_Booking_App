import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchAccommondationGUI extends JPanel implements ActionListener{

    JLabel title;
    JButton backButton;

    JButton next;
    JLabel name, address, city, price, capacity, squareMeters, facilities, kind;

    SearchAccommondationGUI(){

        setBounds(300,90,900,600);

        setLayout(null);

        title = new JLabel("Accommondations");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300,30);
        title.setLocation(300,30);
        add(title);

        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial",Font.PLAIN,15));
        backButton.setSize(100,20);
        backButton.setLocation(30,30);
        add(backButton);

        name = new JLabel("");
        name.setFont(new Font("Arial",Font.PLAIN,25));
        name.setSize(500,25);
        name.setLocation(250,100);

        address = new JLabel("");
        address.setFont(new Font("Arial",Font.PLAIN,20));
        address.setSize(500,25);
        address.setLocation(250,150);

        city = new JLabel("");
        city.setFont(new Font("Arial",Font.PLAIN,20));
        city.setSize(500,25);
        city.setLocation(250,200);

        price = new JLabel("");
        price.setFont(new Font("Arial",Font.PLAIN,20));
        price.setSize(500,25);
        price.setLocation(250,250);

        capacity = new JLabel("");
        capacity.setFont(new Font("Arial",Font.PLAIN,20));
        capacity.setSize(500,25);
        capacity.setLocation(250,300);

        squareMeters = new JLabel("");
        squareMeters.setFont(new Font("Arial",Font.PLAIN,20));
        squareMeters.setSize(500,25);
        squareMeters.setLocation(250,350);

        facilities = new JLabel("");
        facilities.setFont(new Font("Arial",Font.PLAIN,20));
        facilities.setSize(500,25);
        facilities.setLocation(250,400);

        kind = new JLabel("");
        kind.setFont(new Font("Arial",Font.PLAIN,20));
        kind.setSize(500,25);
        kind.setLocation(250,450);

        next = new JButton("Next");
        next.setFont(new Font("Arial",Font.PLAIN,20));
        next.setSize(100,20);
        next.setLocation(700,500);

        add(name);
        add(address);
        add(city);
        add(price);
        add(capacity);
        add(squareMeters);
        add(kind);
        add(facilities);
        add(next);
    }

    public void actionPerformed(ActionEvent actionEvent){

    }
}
