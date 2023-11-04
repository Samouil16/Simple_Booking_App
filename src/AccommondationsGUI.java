import javax.swing.*;
import java.awt.*;

public class AccommondationsGUI extends JPanel {

    //Add accommondation

    JLabel title;
    JButton backButton;

    JButton add;

    JRadioButton hotel, apartment;
    ButtonGroup kind;

    int leftAlign1 = 200, leftAlign2 = 400;

    JLabel name, address, city, price, capacity, squareMeters, facilities;
    JTextField tname, taddress, tcity, tprice, tcapacity, tSquareMeters, tfacilities;

    AccommondationsGUI(){

        setBounds(300,90,900,600);
        setLayout(null);

        title = new JLabel("Add/Modify Accommondations");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(500,35);
        title.setLocation(300,30);

        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial",Font.PLAIN,15));
        backButton.setSize(100,20);
        backButton.setLocation(30,30);


        name = new JLabel("Name");
        name.setFont(new Font("Arial",Font.PLAIN,30));
        name.setSize(150,35);
        name.setLocation(leftAlign1,100);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 25));
        tname.setSize(300,35);
        tname.setLocation(leftAlign2,100);

        city = new JLabel("City");
        city.setFont(new Font("Arial",Font.PLAIN,30));
        city.setSize(150,35);
        city.setLocation(leftAlign1,150);

        tcity = new JTextField();
        tcity.setFont(new Font("Arial", Font.PLAIN, 25));
        tcity.setSize(300,35);
        tcity.setLocation(leftAlign2,150);

        address = new JLabel("Address");
        address.setFont(new Font("Arial",Font.PLAIN,30));
        address.setSize(150,30);
        address.setLocation(leftAlign1,200);

        taddress = new JTextField();
        taddress.setFont(new Font("Arial", Font.PLAIN, 25));
        taddress.setSize(300,35);
        taddress.setLocation(leftAlign2,200);

        price = new JLabel("Price");
        price.setFont(new Font("Arial",Font.PLAIN,30));
        price.setSize(150,35);
        price.setLocation(leftAlign1,250);

        tprice = new JTextField();
        tprice.setFont(new Font("Arial", Font.PLAIN, 25));
        tprice.setSize(300,35);
        tprice.setLocation(leftAlign2,250);

        capacity = new JLabel("Capacity");
        capacity.setFont(new Font("Arial",Font.PLAIN,30));
        capacity.setSize(150,35);
        capacity.setLocation(leftAlign1,300);

        tcapacity = new JTextField();
        tcapacity.setFont(new Font("Arial", Font.PLAIN, 25));
        tcapacity.setSize(300,35);
        tcapacity.setLocation(leftAlign2,300);

        squareMeters = new JLabel("SquareMeters");
        squareMeters.setFont(new Font("Arial",Font.PLAIN,30));
        squareMeters.setSize(200,35);
        squareMeters.setLocation(leftAlign1,350);

        tSquareMeters = new JTextField();
        tSquareMeters.setFont(new Font("Arial", Font.PLAIN, 25));
        tSquareMeters.setSize(300,35);
        tSquareMeters.setLocation(leftAlign2,350);

        facilities = new JLabel("Facilities");
        facilities.setFont(new Font("Arial",Font.PLAIN,30));
        facilities.setSize(150,35);
        facilities.setLocation(leftAlign1,400);

        tfacilities = new JTextField();
        tfacilities.setFont(new Font("Arial", Font.PLAIN, 25));
        tfacilities.setSize(300,35);
        tfacilities.setLocation(leftAlign2,400);

        add = new JButton("Add");
        add.setFont(new Font("Arial", Font.PLAIN, 25));
        add.setSize(100,30);
        add.setLocation(700,500);

        hotel = new JRadioButton("Hotel Room");
        hotel.setFont(new Font("Arial",Font.PLAIN,30));
        hotel.setSelected(true);
        hotel.setSize(200,35);
        hotel.setLocation(leftAlign1+50,500);

        apartment = new JRadioButton("Apartment");
        apartment.setFont(new Font("Arial",Font.PLAIN,30));
        apartment.setSelected(true);
        apartment.setSize(200,35);
        apartment.setLocation(leftAlign2+50,500);

        kind = new ButtonGroup();
        kind.add(hotel);
        kind.add(apartment);

        add(hotel);
        add(apartment);

        add(title);
        add(backButton);
        add(name);
        add(tname);
        add(address);
        add(taddress);
        add(city);
        add(tcity);
        add(capacity);
        add(tcapacity);
        add(price);
        add(tprice);
        add(squareMeters);
        add(tSquareMeters);
        add(facilities);
        add(tfacilities);

        add(add);

    }

}
