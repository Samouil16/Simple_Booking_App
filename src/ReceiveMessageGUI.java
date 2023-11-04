import javax.swing.*;
import java.awt.*;

public class ReceiveMessageGUI extends JPanel {

    JLabel title;
    JButton backButton;

    JLabel from;
    JLabel message;

    JButton read, next;

    ReceiveMessageGUI(){
        setBounds(300,90,900,600);
        setLayout(null);

        title = new JLabel("Messages");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(300,30);
        title.setLocation(300,30);

        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial",Font.PLAIN,15));
        backButton.setSize(100,20);
        backButton.setLocation(30,30);


        message = new JLabel("");
        message.setFont(new Font("Arial",Font.PLAIN,30));
        message.setSize(500,200);
        message.setLocation(200,200);

        from = new JLabel("");
        from.setFont(new Font("Arial",Font.PLAIN,30));
        from.setSize(300,30);
        from.setLocation(300,150);

        read = new JButton("Read");
        read.setFont(new Font("Arial",Font.PLAIN,15));
        read.setSize(100,20);
        read.setLocation(150,500);

        next = new JButton("Next");
        next.setFont(new Font("Arial",Font.PLAIN,15));
        next.setSize(100,20);
        next.setLocation(750,500);

        add(title);
        add(backButton);
        add(read);
        add(message);
        add(from);
        add(next);

    }

}
