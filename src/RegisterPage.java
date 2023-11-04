import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class RegisterPage extends JPanel implements ActionListener {

    // Components of the Form
     JLabel title;
     JLabel name;
     JLabel surname;
     JLabel username;
     JLabel password;
     JTextField tpassword;
     JTextField tname;
     JTextField tsurname;
     JTextField tusername;
     JLabel gender;
     JRadioButton provider;
     JRadioButton costumer;
     ButtonGroup gengp;
     JLabel dob;
     JComboBox date;
     JComboBox month;
     JComboBox year;
     JLabel add;
     JTextArea tadd;
    protected JButton sub;
    protected JButton reset;
     JLabel res;
    JButton backButton;
    // ArrayList<User> waitingUsers;

    // constructor, to initialize the components
    // with default values.
    public RegisterPage( )
    {
        //his.waitingUsers = waitingUsers;

        setBounds(300, 90, 900, 600); //μέγεθος παραθύρου

        setLayout(null); //Αρχικά δεν έχει layout το παράθυρο


        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30)); //γραμματοσειρά
        title.setSize(300, 30);
        title.setLocation(300, 30);
        add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        add(name); //add τον τίτλο στο container

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(150, 20);
        tname.setLocation(200, 100);
        add(tname);

        surname = new JLabel("Surname");
        surname.setFont(new Font("Arial", Font.PLAIN, 20));
        surname.setSize(100, 20);
        surname.setLocation(370, 100);
        add(surname); //add τον τίτλο στο container

        tsurname = new JTextField();
        tsurname.setFont(new Font("Arial", Font.PLAIN, 15));
        tsurname.setSize(150, 20);
        tsurname.setLocation(470, 100);
        add(tsurname);

        username = new JLabel("Username");
        username.setFont(new Font("Arial", Font.PLAIN, 20));
        username.setSize(100, 20);
        username.setLocation(100, 150);
        add(username);

        tusername = new JTextField();
        tusername.setFont(new Font("Arial", Font.PLAIN, 15));
        tusername.setSize(150, 20);
        tusername.setLocation(200, 150);
        add(tusername);

        password = new JLabel("Password");
        password.setFont(new Font("Arial", Font.PLAIN, 20));
        password.setSize(100, 20);
        password.setLocation(370, 150);
        add(password);

        tpassword = new JTextField();
        tpassword.setFont(new Font("Arial", Font.PLAIN, 15));
        tpassword.setSize(150, 20);
        tpassword.setLocation(470, 150);
        add(tpassword);

        gender = new JLabel("Type");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        add(gender);

        costumer = new JRadioButton("Costumer"); //κουκίδα
        costumer.setFont(new Font("Arial", Font.PLAIN, 15));
        costumer.setSelected(true);
        costumer.setSize(100, 20);
        costumer.setLocation(200, 200);
        add(costumer);

        provider = new JRadioButton("Provider");
        provider.setFont(new Font("Arial", Font.PLAIN, 15));
        provider.setSelected(false);
        provider.setSize(80, 20);
        provider.setLocation(300, 200);
        add(provider);

        gengp = new ButtonGroup(); //δυνατότητα μόνο μιας επιλογής
        gengp.add(provider);
        gengp.add(costumer);

        dob = new JLabel("Birthday");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 250);
        add(dob);

        String[] dates = {"1", "2", "3", "4", "5",
                "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15",
                "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25",
                "26", "27", "28", "29", "30",
                "31"};
        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 250);
        add(date);

        String[] months = {"Jan", "feb", "Mar", "Apr",
                "May", "Jun", "July", "Aug",
                "Sept", "Oct", "Nov", "Dec"};
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(255, 250);
        add(month);

        String[] years = {"1995", "1996", "1997", "1998",
                "1999", "2000", "2001", "2002",
                "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010",
                "2011", "2012", "2013", "2014",
                "2015", "2016", "2017", "2018",
                "2019"};
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 250);
        add(year);

        add = new JLabel("E-mail");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 300);
        add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 20);
        tadd.setLocation(200, 300);
        add(tadd);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        add(reset);


        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        add(res);

        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial", Font.PLAIN, 15));
        backButton.setSize(100,20);
        backButton.setLocation(30,30);
        add(backButton);

    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {/*
        if (e.getSource() == sub) {


                try(ObjectOutputStream waitingUsersFile = new ObjectOutputStream(new FileOutputStream("waitingUsers.dat"))){
                    waitingUsersFile.writeObject(tempUser);
                }catch(IOException error){
                    error.printStackTrace();
                }

            }
            res.setText("Registration Successfully..");
        }

        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tusername.setText(def);
            res.setText(def);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
        }
    }*/}
}