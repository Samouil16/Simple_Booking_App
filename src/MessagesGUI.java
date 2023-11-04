import javax.swing.*;
import java.awt.*;

public class MessagesGUI extends JPanel {

    JLabel title;
    JButton backButton;

    JButton send, receive;

    MessagesGUI(){

        setBounds(300,90,900,600);
        setLayout(null);

        title = new JLabel("Messages");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(300,30);
        title.setLocation(400,30);

        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial",Font.PLAIN,15));
        backButton.setSize(100,20);
        backButton.setLocation(30,30);

        send = new JButton("Send");
        send.setFont(new Font("Arial",Font.PLAIN,25));
        send.setSize(150,30);
        send.setLocation(400,200);

        receive = new JButton("Receive");
        receive.setFont(new Font("Arial",Font.PLAIN,25));
        receive.setSize(150,30);
        receive.setLocation(400,400);

        add(title);
        add(backButton);

        add(send);
        add(receive);

    }

}
