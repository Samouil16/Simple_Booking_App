import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SendMessageGUI extends JPanel {

    JLabel title;
    JButton backButton;

    JComboBox to;
    JTextField message;

    String[] usersArray;

    JButton send;

    SendMessageGUI(ArrayList<User> users){
        setBounds(300,90,900,600);
        setLayout(null);

        usersArray = new String[users.size()];
        int i = 0;
        for(User temp: users){
            usersArray[i] = temp.get_Username();
            i++;
        }


        title = new JLabel("Messages");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(300,30);
        title.setLocation(300,30);

        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial",Font.PLAIN,15));
        backButton.setSize(100,20);
        backButton.setLocation(30,30);

        message = new JTextField("");
        message.setFont(new Font("Arial",Font.PLAIN,30));
        message.setSize(500,200);
        message.setLocation(200,200);

        to = new JComboBox();
        to.setFont(new Font("Arial",Font.PLAIN,30));
        to.setSize(300,30);
        to.setLocation(300,150);


        send = new JButton("Send");
        send.setFont(new Font("Arial",Font.PLAIN,15));
        send.setSize(100,20);
        send.setLocation(150,500);

        add(title);
        add(backButton);
        add(send);
        add(message);
        add(to);
    }

}
