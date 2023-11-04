import javax.swing.*;
import java.awt.*;

public class ReservationsGUI extends JPanel {
    JLabel title;
    JButton backButton;

    JLabel name;

    JLabel label1;
    JLabel label2;
    JLabel fromYear,fromMonth,fromDay;

    JTextField tfromYear,tfromMonth,tfromDay;
    JTextField ttoYear , ttoMonth, ttoDay;


    JButton next, book;

    ReservationsGUI(){

        setBounds(300,90,900,600);
        setLayout(null);

        title = new JLabel("Reservations");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(300,30);
        title.setLocation(380,30);
        add(title);

        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial",Font.PLAIN,15));
        backButton.setSize(100,20);
        backButton.setLocation(30,30);
        add(backButton);

        name = new JLabel("");
        name.setFont(new Font("Arial",Font.PLAIN,25));
        name.setSize(300,30);
        name.setLocation(430,140);
        add(name);

        label1 = new JLabel("From Date");
        label1.setFont(new Font("Arial",Font.PLAIN,25));
        label1.setSize(300,30);
        label1.setLocation(200,200);
        add(label1);

        label2 = new JLabel("To Date");
        label2.setFont(new Font("Arial",Font.PLAIN,25));
        label2.setSize(300,30);
        label2.setLocation(600,200);
        add(label2);


        fromYear = new JLabel("Year");
        fromYear.setFont(new Font("Arial",Font.PLAIN,20));
        fromYear.setSize(300,30);
        fromYear.setLocation(200,250);
        add(fromYear);

        fromMonth = new JLabel("Month");
        fromMonth.setFont(new Font("Arial",Font.PLAIN,20));
        fromMonth.setSize(300,30);
        fromMonth.setLocation(200,300);
        add(fromMonth);


        fromDay = new JLabel("Day");
        fromDay.setFont(new Font("Arial",Font.PLAIN,20));
        fromDay.setSize(300,30);
        fromDay.setLocation(200,350);
        add(fromDay);

        next = new JButton("Next");
        next.setFont(new Font("Arial", Font.PLAIN, 15));
        next.setSize(100,20);
        next.setLocation(700,500);
        add(next);

        tfromYear = new JTextField();
        tfromYear.setFont(new Font("Arial", Font.PLAIN,20));
        tfromYear.setSize(200,25);
        tfromYear.setLocation(270,250);
        add(tfromYear);

        tfromMonth = new JTextField();
        tfromMonth.setFont(new Font("Arial", Font.PLAIN,20));
        tfromMonth.setSize(200,25);
        tfromMonth.setLocation(270,300);
        add(tfromMonth);

        tfromDay = new JTextField();
        tfromDay.setFont(new Font("Arial", Font.PLAIN,20));
        tfromDay.setSize(200,25);
        tfromDay.setLocation(270,350);
        add(tfromDay);

        ttoYear = new JTextField();
        ttoYear.setFont(new Font("Arial" , Font.PLAIN , 20));
        ttoYear.setSize(200, 25);
        ttoYear.setLocation(600,250);
        add(ttoYear);

        ttoMonth = new JTextField();
        ttoMonth.setFont(new Font("Arial" , Font.PLAIN , 20));
        ttoMonth.setSize(200, 25);
        ttoMonth.setLocation(600,300);
        add(ttoMonth);

        ttoDay = new JTextField();
        ttoDay.setFont(new Font("Arial" , Font.PLAIN , 20));
        ttoDay.setSize(200, 25);
        ttoDay.setLocation(600,350);
        add(ttoDay);
        
        book = new JButton("Book");
        book.setFont(new Font("Arial",Font.PLAIN,20));
        book.setSize(100,25);
        book.setLocation(200,500);
        add(book);
    }

}
