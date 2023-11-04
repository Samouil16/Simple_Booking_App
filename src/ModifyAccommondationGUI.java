import javax.swing.*;
import java.awt.*;

public class ModifyAccommondationGUI extends JPanel {

    JLabel title;
    JButton back, next, edit;

    JLabel name, address, city, price, capacity, squareMeters, facilities;
    JTextField tname, taddress, tcity, tprice, tcapacity, tsquareMeters, tFacilities;

    ModifyAccommondationGUI(){
        setBounds(300,90,900,600);
        setLayout(null);

        title = new JLabel("Modify Accommondation");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(400,30);
        title.setLocation(300, 30);

        back = new JButton("Back");
        back.setFont(new Font("Arial", Font.PLAIN, 15));
        back.setSize(100,20);
        back.setLocation(30,30);

        next = new JButton("Next");
        next.setFont(new Font("Arial", Font.PLAIN, 15));
        next.setSize(100,20);
        next.setLocation(750,500);

        name = new JLabel("");
        name.setFont(new Font("Arial",Font.PLAIN,25));
        name.setSize(500,25);
        name.setLocation(150,100);

        address = new JLabel("");
        address.setFont(new Font("Arial",Font.PLAIN,20));
        address.setSize(500,25);
        address.setLocation(150,150);

        city = new JLabel("");
        city.setFont(new Font("Arial",Font.PLAIN,20));
        city.setSize(500,25);
        city.setLocation(150,200);

        price = new JLabel("");
        price.setFont(new Font("Arial",Font.PLAIN,20));
        price.setSize(500,25);
        price.setLocation(150,250);

        capacity = new JLabel("");
        capacity.setFont(new Font("Arial",Font.PLAIN,20));
        capacity.setSize(500,25);
        capacity.setLocation(150,300);

        squareMeters = new JLabel("");
        squareMeters.setFont(new Font("Arial",Font.PLAIN,20));
        squareMeters.setSize(500,25);
        squareMeters.setLocation(150,350);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 20));
        tname.setSize(200,25);
        tname.setLocation(600,100);

        taddress = new JTextField();
        taddress.setFont(new Font("Arial", Font.PLAIN, 20));
        taddress.setSize(200,25);
        taddress.setLocation(600,150);

        tcity = new JTextField();
        tcity.setFont(new Font("Arial", Font.PLAIN, 20));
        tcity.setSize(200,25);
        tcity.setLocation(600,200);

        tcapacity = new JTextField();
        tcapacity.setFont(new Font("Arial", Font.PLAIN, 20));
        tcapacity.setSize(200,25);
        tcapacity.setLocation(600,300);

        tprice = new JTextField();
        tprice.setFont(new Font("Arial", Font.PLAIN, 20));
        tprice.setSize(200,25);
        tprice.setLocation(600,250);

        tsquareMeters = new JTextField();
        tsquareMeters.setFont(new Font("Arial", Font.PLAIN, 20));
        tsquareMeters.setSize(200,25);
        tsquareMeters.setLocation(600,350);

        tFacilities = new JTextField();
        tFacilities.setFont(new Font("Arial", Font.PLAIN, 20));
        tFacilities.setSize(200,25);
        tFacilities.setLocation(600,400);

        facilities = new JLabel();
        facilities.setFont(new Font("Arial", Font.PLAIN, 20));
        facilities.setSize(400,25);
        facilities.setLocation(150,400);

        edit = new JButton("Edit");
        edit.setFont(new Font("Arial", Font.PLAIN, 15));
        edit.setSize(100,20);
        edit.setLocation(150,500);

        add(title);
        add(back);
        add(next);
        add(edit);

        add(name);
        add(address);
        add(capacity);
        add(city);
        add(price);
        add(squareMeters);
        add(tname);
        add(taddress);
        add(tprice);
        add(tcapacity);
        add(tcity);
        add(tsquareMeters);
        add(facilities);
        add(tFacilities);
    }
}
