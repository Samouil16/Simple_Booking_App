import javax.swing.*;
import java.awt.*;

public class AddModDelMenuGUI extends JPanel {

    JLabel title;

    JButton add,modify,delete;

    JButton back;

    AddModDelMenuGUI(){

        setBounds(300,90,900,600);

        setLayout(null);

        title = new JLabel("Add/Modify/Delete Accommondations");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(500,35);
        title.setLocation(200,30);

        add = new JButton("Add");
        add.setFont(new Font("Arial",Font.PLAIN,30));
        add.setSize(300,35);
        add.setLocation(300,200);

        modify = new JButton("Modify");
        modify.setFont(new Font("Arial",Font.PLAIN,30));
        modify.setSize(300,35);
        modify.setLocation(300,300);

        delete = new JButton("Delete");
        delete.setFont(new Font("Arial",Font.PLAIN,30));
        delete.setSize(300,35);
        delete.setLocation(300,400);

        back = new JButton("Back");
        back.setFont(new Font("Arial", Font.PLAIN, 15));
        back.setSize(100,20);
        back.setLocation(30,30);

        add(back);
        add(title);
        add(add);
        add(modify);
        add(delete);

    }
}
