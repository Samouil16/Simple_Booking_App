import javax.swing.*;
import java.awt.*;

public class DeleteAccommondationPage extends JPanel {

    JLabel title;
    JButton back;

    JButton next,delete;
    JLabel name, address, city, price, capacity, squareMeters, facilities;


    DeleteAccommondationPage(){

        setBounds(30,90,900,600);
        setLayout(null);

        title = new JLabel("Delete Accommondation");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(400,30);
        title.setLocation(300,30);
        add(title);

        back = new JButton("Back");
        back.setFont(new Font("Arial", Font.PLAIN, 15));
        back.setSize(100,20);
        back.setLocation(30,30);
        add(back);

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


        next = new JButton("Next");
        next.setFont(new Font("Arial",Font.PLAIN,20));
        next.setSize(100,20);
        next.setLocation(700,500);

        delete = new JButton("Delete");
        delete.setFont(new Font("Arial",Font.PLAIN,20));
        delete.setSize(100,20);
        delete.setLocation(150,500);

        add(name);
        add(address);
        add(city);
        add(price);
        add(capacity);
        add(squareMeters);
        add(facilities);
        add(next);
        add(delete);
    }

}
