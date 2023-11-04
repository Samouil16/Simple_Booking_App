import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPage implements ActionListener{
    JButton viewReservations;
    JLabel title;
    JButton viewUsers;
    JButton approveNewUsers;
    JButton MessagesC,MessagesP,MessagesA;
    JButton AMD;
    JButton profileDetailsC,profileDetailsP;
    JButton accommondationSearch;
    JButton reservationCancellation;
    JButton backButton1,backButton2,backButton3;

    JPanel costumerPanel;
    JPanel providerPanel;
    JPanel administratorPanel;

    MenuPage(){

        costumerPanel= new JPanel();
        costumerPanel.setLayout(null);
        providerPanel= new JPanel();
        providerPanel.setLayout(null);
        administratorPanel= new JPanel();
        administratorPanel.setLayout(null);

        costumerPanel.setBounds(300,90,900,600);
        providerPanel.setBounds(300,90,900,600);
        administratorPanel.setBounds(300,90,900,600);

        //COSTUMER PANEL

        title = new JLabel("Menu");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(300,30);
        title.setLocation(400,30);
        costumerPanel.add(title);

        backButton1 = new JButton("Exit");
        backButton1.setFont(new Font("Arial", Font.PLAIN, 15));
        backButton1.setSize(100,20);
        backButton1.setLocation(30,30);
        costumerPanel.add(backButton1);

        accommondationSearch = new JButton("Accommondation search");
        accommondationSearch.setFont(new Font("Arial", Font.PLAIN, 20));
        accommondationSearch.setSize(250, 40);
        accommondationSearch.setLocation(320, 100);
        costumerPanel.add(accommondationSearch);

        reservationCancellation = new JButton("Reservation/Cancellation");
        reservationCancellation.setFont(new Font("Arial", Font.PLAIN, 20));
        reservationCancellation.setSize(250, 40);
        reservationCancellation.setLocation(320, 170);
        reservationCancellation.addActionListener(this);
        costumerPanel.add(reservationCancellation);

        profileDetailsC = new JButton("Profile Details");
        profileDetailsC.setFont(new Font("Arial", Font.PLAIN, 20));
        profileDetailsC.setSize(250, 40);
        profileDetailsC.setLocation(320, 240);
        profileDetailsC.addActionListener(this);
        costumerPanel.add(profileDetailsC);

        MessagesC = new JButton("Messages");
        MessagesC.setFont(new Font("Arial", Font.PLAIN, 20));
        MessagesC.setSize(250, 40);
        MessagesC.setLocation(320, 310);
        MessagesC.addActionListener(this);
        costumerPanel.add(MessagesC);

        //PROVIDER PANEL

        title = new JLabel("Menu");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(300,30);
        title.setLocation(400,30);
        providerPanel.add(title);

        backButton2 = new JButton("Exit");
        backButton2.setFont(new Font("Arial", Font.PLAIN, 15));
        backButton2.setSize(100,20);
        backButton2.setLocation(30,30);
        providerPanel.add(backButton2);

        AMD = new JButton("<html>Add/Modify/Delete <br/> Accomondations</html>");
        AMD.setFont(new Font("Arial", Font.PLAIN, 20));
        AMD.setSize(250, 60);
        AMD.setLocation(320, 100);
        AMD.addActionListener(this);
        providerPanel.add(AMD);

        profileDetailsP = new JButton("Profile Details");
        profileDetailsP.setFont(new Font("Arial", Font.PLAIN, 20));
        profileDetailsP.setSize(250, 40);
        profileDetailsP.setLocation(320, 190);
        profileDetailsP.addActionListener(this);
        providerPanel.add(profileDetailsP);

        MessagesP = new JButton("Messages");
        MessagesP.setFont(new Font("Arial", Font.PLAIN, 20));
        MessagesP.setSize(250, 40);
        MessagesP.setLocation(320, 270);
        MessagesP.addActionListener(this);
        providerPanel.add(MessagesP);

        //ADMINISTRATOR PANEL

        title = new JLabel("Menu");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(300,30);
        title.setLocation(400,30);
        administratorPanel.add(title);

        backButton3 = new JButton("Exit");
        backButton3.setFont(new Font("Arial", Font.PLAIN, 15));
        backButton3.setSize(100,20);
        backButton3.setLocation(30,30);
        administratorPanel.add(backButton3);

        viewReservations = new JButton("View Reservations");
        viewReservations.setFont(new Font("Arial", Font.PLAIN, 20));
        viewReservations.setSize(250, 40);
        viewReservations.setLocation(320, 100);
        viewReservations.addActionListener(this);
        administratorPanel.add(viewReservations);

        viewUsers = new JButton("View Users");
        viewUsers.setFont(new Font("Arial", Font.PLAIN, 20));
        viewUsers.setSize(250, 40);
        viewUsers.setLocation(320, 170);
        viewUsers.addActionListener(this);
        administratorPanel.add(viewUsers);

        approveNewUsers = new JButton("Aprove new users");
        approveNewUsers.setFont(new Font("Arial", Font.PLAIN, 20));
        approveNewUsers.setSize(250, 40);
        approveNewUsers.setLocation(320, 240);
        approveNewUsers.addActionListener(this);
        administratorPanel.add(approveNewUsers);

        MessagesA = new JButton("Messages");
        MessagesA.setFont(new Font("Arial", Font.PLAIN, 20));
        MessagesA.setSize(250, 40);
        MessagesA.setLocation(320, 310);
        MessagesA.addActionListener(this);
        administratorPanel.add(MessagesA);

    }


    public void actionPerformed(ActionEvent event){

    }


}
