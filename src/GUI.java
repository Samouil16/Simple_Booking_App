import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class GUI implements ActionListener{

    LoginPage loginPage;
    RegisterPage registerPage;
    MenuPage menuPage;
    SearchAccommondationGUI searchAccommondationGUI;
    ReservationsGUI reservationsGUI;
    ProfileDetailsGUI profileDetailsGUI;
    MessagesGUI messagesGUI;
    AccommondationsGUI accommondationsGUI;
    ViewReservationsGUI viewReservationsGUI;
    ViewUsersGUI viewUsersGUI;
    ApproveNewUsersGUI approveNewUsersGUI;
    AddModDelMenuGUI addModDelMenuGUI;
    ModifyAccommondationGUI modifyAccommondationGUI;
    DeleteAccommondationPage deleteAccommondationPage;
    SendMessageGUI sendMessageGUI;
    ReceiveMessageGUI receiveMessageGUI;
    ReservationsCostumerGUI reservationsCostumerGUI;
    ReservationCostumerMenuGUI reservationCostumerMenuGUI;
    JPanel mainPanel;
    JPanel CostumerPage,ProviderPage,AdministratorPage;

    User currentUser;

    JFrame frame;
    CardLayout card;

    Iterator<Accommondations> it,it2;
    Iterator<Reservations> it3;
    Iterator<User> it4;
    Iterator<Messages> it5;
    Messages tempE;
    User tempD;
    Accommondations tempA,tempB;
    Reservations tempC;
    Accommondations temp;
    int j;

    ArrayList<Accommondations> accommondations;

    GUI(ArrayList<User> waitingList,ArrayList<User> users, ArrayList<Accommondations> accommondations, ArrayList<Reservations> reservations){

        this.accommondations = accommondations;

        frame = new JFrame("Booking");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(900,600);

        card = new CardLayout();
        mainPanel = new JPanel();
        mainPanel.setLayout(card);

        loginPage = new LoginPage();
        registerPage = new RegisterPage();
        menuPage = new MenuPage();
        CostumerPage = menuPage.costumerPanel;
        ProviderPage = menuPage.providerPanel;
        AdministratorPage = menuPage.administratorPanel;
        searchAccommondationGUI = new SearchAccommondationGUI();
        reservationsGUI = new ReservationsGUI();
        profileDetailsGUI = new ProfileDetailsGUI();
        messagesGUI = new MessagesGUI();
        accommondationsGUI = new AccommondationsGUI();
        viewReservationsGUI = new ViewReservationsGUI();
        viewUsersGUI= new ViewUsersGUI();
        approveNewUsersGUI = new ApproveNewUsersGUI();
        addModDelMenuGUI = new AddModDelMenuGUI();
        modifyAccommondationGUI = new ModifyAccommondationGUI();
        deleteAccommondationPage = new DeleteAccommondationPage();
        receiveMessageGUI = new ReceiveMessageGUI();
        sendMessageGUI = new SendMessageGUI(users);
        reservationsCostumerGUI = new ReservationsCostumerGUI();
        reservationCostumerMenuGUI = new ReservationCostumerMenuGUI();

        mainPanel.add(loginPage, "LoginPage");
        mainPanel.add(registerPage, "RegisterPage");
        mainPanel.add(searchAccommondationGUI,"searchAccommondationPage");
        mainPanel.add(CostumerPage, "CostumerMenu");
        mainPanel.add(ProviderPage, "ProviderMenu");
        mainPanel.add(AdministratorPage, "AdministratorMenu");
        mainPanel.add(reservationsGUI,"ReservationPage");
        mainPanel.add(profileDetailsGUI,"ProfilePage");
        mainPanel.add(messagesGUI,"MessagesPage");
        mainPanel.add(sendMessageGUI,"SendMessagePage");
        mainPanel.add(receiveMessageGUI,"ReceiveMessagePage");
        mainPanel.add(accommondationsGUI,"AddAccommondationPage");
        mainPanel.add(viewReservationsGUI,"ViewReservationsPage");
        mainPanel.add(viewUsersGUI,"ViewUsersPage");
        mainPanel.add(approveNewUsersGUI,"ApproveUsersGUI");
        mainPanel.add(addModDelMenuGUI, "AccommondationPage");
        mainPanel.add(modifyAccommondationGUI,"ModifyAccommondationPage");
        mainPanel.add(deleteAccommondationPage,"DeleteAccommondationPage");
        mainPanel.add(reservationsCostumerGUI,"ViewReservationsCostumerPage");
        mainPanel.add(reservationCostumerMenuGUI,"ReservationCostumerMenuPage");

        frame.add(mainPanel);
        frame.setVisible(true);
        frame.setResizable(false);

        loginPage.registerButton.addActionListener(actionEvent -> card.show(mainPanel,"RegisterPage"));

        loginPage.loginButton.addActionListener(actionEvent -> loginButton(users));

        registerPage.backButton.addActionListener(actionEvent -> card.show(mainPanel,"LoginPage"));

        registerPage.sub.addActionListener(actionEvent -> {
            User tempUser;
            if(registerPage.costumer.isSelected()) {
                tempUser = new Costumer();
                tempUser.set_Name(registerPage.tname.getText());
                tempUser.set_Surname(registerPage.tsurname.getText());
                tempUser.set_Username(registerPage.tusername.getText());
                tempUser.set_Password(registerPage.tpassword.getText());
                String[] temp = {registerPage.date.toString(), registerPage.month.toString(), registerPage.year.toString()};
                tempUser.set_Age(temp);
            }
            else{
                tempUser = new Provider();
                tempUser.set_Name(registerPage.tname.getText());
                tempUser.set_Surname(registerPage.tsurname.getText());
                tempUser.set_Username(registerPage.tusername.getText());
                tempUser.set_Password(registerPage.tpassword.getText());
                String[] temp = {registerPage.date.toString(), registerPage.month.toString(), registerPage.year.toString()};
                tempUser.set_Age(temp);
            }
            tempUser.set_Email(registerPage.tadd.getText());
            tempUser.messages = new ArrayList<>();
            waitingList.add(tempUser);
        });

        messagesGUI.send.addActionListener(actionEvent -> {
            sendMessageGUI.to.removeAllItems();
            int i = 0;
            for(User temp: users){
                if(temp != currentUser) {
                    sendMessageGUI.to.insertItemAt(temp.get_Username(), i);
                    i++;
                }
            }
            card.show(mainPanel,"SendMessagePage");
        });

        messagesGUI.receive.addActionListener(actionEvent -> {
            it5 = currentUser.messages.iterator();
            if(!it5.hasNext()) {
                JOptionPane.showMessageDialog(null,"No messages");
            }
            else {
                tempE = it5.next();
                receiveMessageGUI.message.setText(tempE.message);
                receiveMessageGUI.from.setText("From: "+tempE.fromUser.get_Username());
                card.show(mainPanel,"ReceiveMessagePage");
            }
        });

        receiveMessageGUI.next.addActionListener(actionEvent -> {
            if (!it5.hasNext()) {
                it5 = currentUser.messages.iterator();
            }
            tempE = it5.next();
            receiveMessageGUI.message.setText(tempE.message);
            receiveMessageGUI.from.setText("From"+tempE.fromUser.get_Username());
        });

        receiveMessageGUI.read.addActionListener(actionEvent -> currentUser.messages.remove(tempE));

        sendMessageGUI.send.addActionListener(actionEvent -> {
            Messages tempMessage = new Messages();
            tempMessage.fromUser = currentUser;
            tempMessage.message = sendMessageGUI.message.getText();
            int i = 0;
            for(User temp: users){
                String tempS = Objects.requireNonNull(sendMessageGUI.to.getSelectedItem()).toString();
                if(tempS.equals(temp.get_Username())){
                    break;
                }
                i++;
            }
            users.get(i).messages.add(tempMessage);
            sendMessageGUI.message.setText("");
        });

        sendMessageGUI.backButton.addActionListener(actionEvent -> card.show(mainPanel,"MessagesPage"));

        receiveMessageGUI.backButton.addActionListener(actionEvent -> card.show(mainPanel,"MessagesPage"));



        menuPage.accommondationSearch.addActionListener(actionEvent -> {
            it = accommondations.iterator();
            if(!it.hasNext()){
                JOptionPane.showMessageDialog(null,"No accommondations");
            }
            else {
                tempB = it.next();
                searchAccommondationGUI.name.setText("Name: " + tempB.get_Name());
                searchAccommondationGUI.address.setText("Address: " + tempB.getAddress());
                searchAccommondationGUI.city.setText("City: " + tempB.getCity());
                searchAccommondationGUI.price.setText("Price: $" + (tempB.get_Price()) + "/per night");
                searchAccommondationGUI.capacity.setText("Capacity: " + (tempB.get_Capacity()) + " persons");
                searchAccommondationGUI.squareMeters.setText((tempB.get_SquareMeters()) + " Square meters");
                searchAccommondationGUI.facilities.setText("Facilities: "+tempB.get_Facilities());
                if(tempB.getClass() == HotelRoom.class){
                    searchAccommondationGUI.kind.setText("Hotel Room");
                }
                else{
                    searchAccommondationGUI.kind.setText("Apartment");
                }
                card.show(mainPanel, "searchAccommondationPage");
            }
        });

        menuPage.backButton1.addActionListener(actionEvent -> {
            loginPage.userField.setText("");
            loginPage.passField.setText("");
            card.show(mainPanel,"LoginPage");
        });

        menuPage.backButton2.addActionListener(actionEvent -> {
            loginPage.userField.setText("");
            loginPage.passField.setText("");
            card.show(mainPanel,"LoginPage");
        });

        menuPage.backButton3.addActionListener(actionEvent -> {
            loginPage.userField.setText("");
            loginPage.passField.setText("");
            card.show(mainPanel,"LoginPage");
        });
        reservationCostumerMenuGUI.reservation.addActionListener(actionEvent -> {
            it = accommondations.iterator();
            if(!it.hasNext()){
                JOptionPane.showMessageDialog(null,"No accommondations");
            }
            else {
                tempA = it.next();
                reservationsGUI.name.setText(tempA.get_Name());
                card.show(mainPanel, "ReservationPage");
            }
        });

        reservationCostumerMenuGUI.cancellation.addActionListener(actionEvent -> {
            it3 = currentUser.reservations.iterator();
            if(!it3.hasNext()){
                JOptionPane.showMessageDialog(null,"No reservations");
            }
            else{
                tempC = it3.next();
                reservationsCostumerGUI.provider.setText("Provider: "+tempC.currentAccommondation.provider.get_Username());
                reservationsCostumerGUI.name.setText("Accommondation: "+tempC.name);
                reservationsCostumerGUI.fromDate.setText("From: "+tempC.date.fromDay+"/"+tempC.date.fromMonth+"/"+tempC.date.fromYear);
                reservationsCostumerGUI.toDate.setText("Until: "+tempC.date.untilDay+"/"+tempC.date.untilMonth+"/"+tempC.date.untilYear);
                reservationsCostumerGUI.price.setText("Price: $"+tempC.totalPrice);
                card.show(mainPanel, "ViewReservationsCostumerPage");
            }
        });

        reservationsCostumerGUI.cancel.addActionListener(actionEvent -> {
            currentUser.reservations.remove(tempC);
            reservations.remove(tempC);
        });

        reservationsCostumerGUI.next.addActionListener(actionEvent -> {
            if (!it3.hasNext()) {
                it3 = currentUser.reservations.iterator();
            }
            tempC = it3.next();
            reservationsCostumerGUI.provider.setText("Provider: "+tempC.currentAccommondation.provider.get_Username());
            reservationsCostumerGUI.name.setText("Accommondation: "+tempC.name);
            reservationsCostumerGUI.fromDate.setText("From: "+tempC.date.fromDay+"/"+tempC.date.fromMonth+"/"+tempC.date.fromYear);
            reservationsCostumerGUI.toDate.setText("Until: "+tempC.date.untilDay+"/"+tempC.date.untilMonth+"/"+tempC.date.untilYear);
            reservationsCostumerGUI.price.setText("Price: $"+tempC.totalPrice);
        });

        menuPage.reservationCancellation.addActionListener(actionEvent -> card.show(mainPanel,"ReservationCostumerMenuPage"));

        reservationsCostumerGUI.backButton.addActionListener(actionEvent -> card.show(mainPanel,"ReservationCostumerMenuPage"));

        reservationsGUI.backButton.addActionListener(actionEvent -> card.show(mainPanel,"ReservationCostumerMenuPage"));

        reservationCostumerMenuGUI.backButton.addActionListener(actionEvent -> card.show(mainPanel,"CostumerMenu"));


        menuPage.profileDetailsC.addActionListener(actionEvent -> {
            profileDetailsGUI.type.setText("Costumer");
            profileDetailsGUI.name.setText("Name: "+currentUser.get_Name());
            profileDetailsGUI.surname.setText("Surname: "+currentUser.get_Surname());
            profileDetailsGUI.email.setText("E-mail: "+currentUser.get_Email());
            profileDetailsGUI.username.setText("Username: "+currentUser.get_Username());
            card.show(mainPanel,"ProfilePage");
        });

        profileDetailsGUI.backButton.addActionListener(actionEvent -> {
            if(currentUser.getClass() == Costumer.class) {
                card.show(mainPanel, "CostumerMenu");
            }
            else{
                card.show(mainPanel,"ProviderMenu");
            }
        });

        profileDetailsGUI.editButton.addActionListener(actionEvent -> {
            if(!profileDetailsGUI.tname.getText().equals("")){
                currentUser.set_Name(profileDetailsGUI.tname.getText());
                profileDetailsGUI.tname.setText("");
                profileDetailsGUI.name.setText("Name: "+currentUser.get_Name());
            }
            if(!profileDetailsGUI.tsurname.getText().equals("")){
                currentUser.set_Surname(profileDetailsGUI.tsurname.getText());
                profileDetailsGUI.tsurname.setText("");
                profileDetailsGUI.surname.setText("Surname: "+currentUser.get_Surname());
            }
            if(!profileDetailsGUI.temail.getText().equals("")){
                currentUser.set_Email(profileDetailsGUI.temail.getText());
                profileDetailsGUI.temail.setText("");
                profileDetailsGUI.email.setText("E-mail: "+currentUser.get_Email());
            }
            if(!profileDetailsGUI.tusername.getText().equals("")){
                currentUser.set_Username(profileDetailsGUI.tusername.getText());
                profileDetailsGUI.tusername.setText("");
                profileDetailsGUI.username.setText("Username: "+currentUser.get_Username());
            }
        });

        profileDetailsGUI.cPassword.addActionListener(actionEvent -> {
            if(String.valueOf(profileDetailsGUI.oldPassword.getPassword()).equals(currentUser.get_Password())){
                currentUser.set_Password(String.valueOf(profileDetailsGUI.newPassword.getPassword()));
            }
            else{
                JOptionPane.showMessageDialog(null,"Wrong password");
            }
            profileDetailsGUI.oldPassword.setText("");
            profileDetailsGUI.newPassword.setText("");
        });

        menuPage.profileDetailsP.addActionListener(actionEvent -> {
            profileDetailsGUI.type.setText("Provider");
            profileDetailsGUI.name.setText("Name: "+currentUser.get_Name());
            profileDetailsGUI.surname.setText("Surname: "+currentUser.get_Surname());
            profileDetailsGUI.email.setText("E-mail: "+currentUser.get_Email());
            profileDetailsGUI.username.setText("Username: "+currentUser.get_Username());
            card.show(mainPanel,"ProfilePage");
        });

        menuPage.MessagesC.addActionListener(actionEvent -> card.show(mainPanel,"MessagesPage"));

        messagesGUI.backButton.addActionListener(actionEvent -> {
            if(currentUser.getClass() == Costumer.class) {
                card.show(mainPanel, "CostumerMenu");
            }
            else if(currentUser.getClass() == Provider.class){
                card.show(mainPanel,"ProviderMenu");
            }
            else{
                card.show(mainPanel,"AdministratorMenu");
            }
        });

        menuPage.AMD.addActionListener(actionEvent -> card.show(mainPanel,"AccommondationPage"));

        accommondationsGUI.backButton.addActionListener(actionEvent -> card.show(mainPanel,"AccommondationPage"));

        menuPage.MessagesP.addActionListener(actionEvent -> card.show(mainPanel,"MessagesPage"));

        menuPage.viewReservations.addActionListener(actionEvent -> {
            it3 = reservations.iterator();
            if(!it3.hasNext()){
                JOptionPane.showMessageDialog(null,"No reservations");
            }
            else{
                tempC = it3.next();
                viewReservationsGUI.name.setText(tempC.name);
                viewReservationsGUI.provider.setText("Provider: "+tempC.currentAccommondation.provider.get_Name());
                viewReservationsGUI.costumer.setText("Costumer: "+tempC.currentUser.get_Name());
                viewReservationsGUI.price.setText("Price: $"+(tempC.totalPrice));
                viewReservationsGUI.fromDate.setText("From: "+tempC.date.fromDay+"/"+tempC.date.fromMonth+"/"+tempC.date.fromYear);
                viewReservationsGUI.toDate.setText("From: "+tempC.date.untilDay+"/"+tempC.date.untilMonth+"/"+tempC.date.untilYear);
                card.show(mainPanel, "ViewReservationsPage");
            }
        });

        viewReservationsGUI.backButton.addActionListener(actionEvent -> card.show(mainPanel,"AdministratorMenu"));

        viewReservationsGUI.next.addActionListener(actionEvent -> {
            if (!it3.hasNext()) {
                it3 = reservations.iterator();
            }
            tempC = it3.next();
            viewReservationsGUI.name.setText(tempC.name);
            viewReservationsGUI.provider.setText("Provider: "+tempC.currentAccommondation.provider.get_Name());
            viewReservationsGUI.costumer.setText("Costumer: "+tempC.currentUser.get_Name());
            viewReservationsGUI.price.setText("Price: $"+(tempC.totalPrice));
            viewReservationsGUI.fromDate.setText("From: "+tempC.date.fromDay+"/"+tempC.date.fromMonth+"/"+tempC.date.fromYear);
            viewReservationsGUI.toDate.setText("From: "+tempC.date.untilDay+"/"+tempC.date.untilMonth+"/"+tempC.date.untilYear);
        });

        menuPage.viewUsers.addActionListener(actionEvent -> {
            it4 = users.iterator();
            tempD = it4.next();
            viewUsersGUI.name.setText("Name: "+tempD.get_Name());
            viewUsersGUI.surname.setText("Surname: "+tempD.get_Surname());
            viewUsersGUI.email.setText("E-mail: "+tempD.get_Email());
            viewUsersGUI.username.setText("Username: "+tempD.get_Username());
            if(tempD.getClass() == Costumer.class){

                viewUsersGUI.kind.setText("Costumer");
            }
            else if (tempD.getClass() == Provider.class){

                viewUsersGUI.kind.setText("Provider");
            }else{
                viewUsersGUI.kind.setText("Administrator");
            }
            card.show(mainPanel,"ViewUsersPage");
        });

        viewUsersGUI.next.addActionListener(actionEvent -> {
            if (!it4.hasNext()) {
                it4 = users.iterator();
            }
            tempD = it4.next();
            viewUsersGUI.name.setText("Name: "+tempD.get_Name());
            viewUsersGUI.surname.setText("Surname: "+tempD.get_Surname());
            viewUsersGUI.email.setText("E-mail: "+tempD.get_Email());
            viewUsersGUI.username.setText("Username: "+tempD.get_Username());
            if(tempD.getClass() == Costumer.class){

                viewUsersGUI.kind.setText("Costumer");
            }
            else if (tempD.getClass() == Provider.class){

                viewUsersGUI.kind.setText("Provider");
            }else{
                viewUsersGUI.kind.setText("Administrator");
            }
        });

        viewUsersGUI.backButton.addActionListener(actionEvent -> card.show(mainPanel,"AdministratorMenu"));

        menuPage.approveNewUsers.addActionListener(actionEvent -> {
            it4 = waitingList.iterator();
            if(!it4.hasNext()){
                JOptionPane.showMessageDialog(null,"No users to be approved");
            }
            else {
                tempD = it4.next();
                approveNewUsersGUI.name.setText("Name: " + tempD.get_Name());
                approveNewUsersGUI.surname.setText("Surname: " + tempD.get_Surname());
                approveNewUsersGUI.email.setText("E-mail: " + tempD.get_Email());
                approveNewUsersGUI.username.setText("Username: " + tempD.get_Username());
                card.show(mainPanel, "ApproveUsersGUI");
            }
        });

        approveNewUsersGUI.backButton.addActionListener(actionEvent -> card.show(mainPanel,"AdministratorMenu"));

        approveNewUsersGUI.approve.addActionListener(actionEvent -> {
            users.add(tempD);
            waitingList.remove(tempD);
        });

        approveNewUsersGUI.next.addActionListener(actionEvent -> {
            if (!it4.hasNext()) {
                it4 = waitingList.iterator();
                tempD = it4.next();
            }
            approveNewUsersGUI.name.setText("Name: " + tempD.get_Name());
            approveNewUsersGUI.surname.setText("Surname: " + tempD.get_Surname());
            approveNewUsersGUI.email.setText("E-mail: " + tempD.get_Email());
            approveNewUsersGUI.username.setText("Username: " + tempD.get_Username());
        });

        menuPage.MessagesA.addActionListener(actionEvent -> card.show(mainPanel,"MessagesPage"));

        searchAccommondationGUI.next.addActionListener(actionEvent -> {
            if(it.hasNext()){
                tempB = it.next();
                searchAccommondationGUI.name.setText("Name: "+tempB.get_Name());
                searchAccommondationGUI.address.setText("Address: "+tempB.getAddress());
                searchAccommondationGUI.city.setText("City: "+tempB.getCity());
                searchAccommondationGUI.price.setText("Price: $"+(tempB.get_Price())+"/per night");
                searchAccommondationGUI.capacity.setText("Capacity: "+(tempB.get_Capacity())+" persons");
                searchAccommondationGUI.squareMeters.setText((tempB.get_SquareMeters())+" Square meters");
                searchAccommondationGUI.facilities.setText("Facilities: "+tempB.get_Facilities());
                if(tempB.getClass() == HotelRoom.class){
                    searchAccommondationGUI.kind.setText("Hotel Room");
                }
                else{
                    searchAccommondationGUI.kind.setText("Apartment");
                }
            }
            else{
                it = accommondations.iterator();
                Accommondations tempB = it.next();
                searchAccommondationGUI.name.setText("Name: "+tempB.get_Name());
                searchAccommondationGUI.address.setText("Address: "+tempB.getAddress());
                searchAccommondationGUI.city.setText("City: "+tempB.getCity());
                searchAccommondationGUI.price.setText("Price: $"+(tempB.get_Price())+"/per night");
                searchAccommondationGUI.capacity.setText("Capacity: "+(tempB.get_Capacity())+" persons");
                searchAccommondationGUI.squareMeters.setText((tempB.get_SquareMeters())+" Square meters");
                searchAccommondationGUI.facilities.setText("Facilities: "+tempB.get_Facilities());
                if(tempB.getClass() == HotelRoom.class){
                    searchAccommondationGUI.kind.setText("Hotel Room");
                }
                else{
                    searchAccommondationGUI.kind.setText("Apartment");
                }
            }
        });

        searchAccommondationGUI.backButton.addActionListener(actionEvent -> card.show(mainPanel,"CostumerMenu"));

        //Add accommondation
        accommondationsGUI.add.addActionListener(actionEvent -> {
            if(!accommondationsGUI.tname.getText().equals("") && !accommondationsGUI.tprice.getText().equals("")
                    && !accommondationsGUI.tcity.getText().equals("") && !accommondationsGUI.tcapacity.getText().equals("") && !accommondationsGUI.taddress.getText().equals("")) {
                Accommondations newAccomm = new Accommondations();
                if(accommondationsGUI.hotel.isSelected()){
                    newAccomm = new HotelRoom();
                }else if(accommondationsGUI.apartment.isSelected()){
                    newAccomm = new Apartment();
                }
                newAccomm.set_Name(accommondationsGUI.tname.getText());
                accommondationsGUI.tname.setText("");
                newAccomm.setCity(accommondationsGUI.tcity.getText());
                accommondationsGUI.tcity.setText("");
                newAccomm.setAddress(accommondationsGUI.taddress.getText());
                accommondationsGUI.taddress.setText("");
                newAccomm.set_Capacity(Integer.parseInt(accommondationsGUI.tcapacity.getText()));
                accommondationsGUI.tcapacity.setText("");
                newAccomm.set_Price(Integer.parseInt(accommondationsGUI.tprice.getText()));
                accommondationsGUI.tprice.setText("");
                currentUser.accommondations.add(newAccomm);
                accommondations.add(newAccomm);
                it = accommondations.iterator();
            }
            else{
                JOptionPane.showMessageDialog(null,"Please fill out all the fields");
            }
        });

        reservationsGUI.next.addActionListener(e -> {
            if (!it.hasNext()) {
                it = accommondations.iterator();
            }
            tempA = it.next();
            reservationsGUI.name.setText(tempA.get_Name());
        });

        reservationsGUI.book.addActionListener(e -> {
            if(!reservationsGUI.tfromDay.getText().equals("") && !reservationsGUI.tfromMonth.getText().equals("") && !reservationsGUI.tfromYear.getText().equals("")
            && !reservationsGUI.ttoYear.getText().equals("") && !reservationsGUI.ttoMonth.getText().equals("") && !reservationsGUI.ttoDay.getText().equals("")){
                Reservations currentReservation = new Reservations();
                currentReservation.date.fromDay = Integer.parseInt(reservationsGUI.tfromDay.getText());
                currentReservation.date.fromMonth = Integer.parseInt(reservationsGUI.tfromMonth.getText());
                currentReservation.date.fromYear = Integer.parseInt(reservationsGUI.tfromYear.getText());
                currentReservation.date.untilDay = Integer.parseInt(reservationsGUI.ttoDay.getText());
                currentReservation.date.untilMonth = Integer.parseInt(reservationsGUI.ttoMonth.getText());
                currentReservation.date.untilYear = Integer.parseInt(reservationsGUI.ttoYear.getText());


                if(!currentReservation.Reservation(tempA,reservations,currentUser)){
                    JOptionPane.showMessageDialog(null,"Room not available");
                }
                else {
                    if(currentReservation.date.fromNum>=currentReservation.date.untilNum || currentReservation.date.checkDate()){
                        JOptionPane.showMessageDialog(null,"Wrong dates");
                    }
                    else {
                        currentUser.reservations.add(currentReservation);
                        reservations.add(currentReservation);
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Please fill all fields");
            }
        });

        addModDelMenuGUI.add.addActionListener(actionEvent -> card.show(mainPanel,"AddAccommondationPage"));

        addModDelMenuGUI.back.addActionListener(actionEvent -> card.show(mainPanel,"ProviderMenu"));

        addModDelMenuGUI.modify.addActionListener(actionEvent -> {
            it2 = currentUser.accommondations.iterator();
            j = 0;
            if(!it2.hasNext()){
                JOptionPane.showMessageDialog(null,"No accomondations");
            }
            else {
                temp = it2.next();
                modifyAccommondationGUI.name.setText("Name: " + temp.get_Name());
                modifyAccommondationGUI.address.setText("Address: " + temp.getAddress());
                modifyAccommondationGUI.city.setText("City: " + temp.getCity());
                modifyAccommondationGUI.price.setText("Price: $" + (temp.get_Price()) + "/per night");
                modifyAccommondationGUI.capacity.setText("Capacity: " + (temp.get_Capacity()) + " people");
                modifyAccommondationGUI.squareMeters.setText((temp.get_SquareMeters()) + " Square meters");
                modifyAccommondationGUI.facilities.setText("Facilities: "+temp.get_Facilities());
                card.show(mainPanel, "ModifyAccommondationPage");
            }
        });

        addModDelMenuGUI.delete.addActionListener(actionEvent -> {
            it2 = currentUser.accommondations.iterator();
            j = 0;
            if(!it2.hasNext()){
                JOptionPane.showMessageDialog(null,"No accommondations");
            }
            else {
                temp = it2.next();
                deleteAccommondationPage.name.setText("Name: " + temp.get_Name());
                deleteAccommondationPage.address.setText("Address: " + temp.getAddress());
                deleteAccommondationPage.city.setText("City: " + temp.getCity());
                deleteAccommondationPage.price.setText("Price: $" + (temp.get_Price()) + "/per night");
                deleteAccommondationPage.capacity.setText("Capacity: " + (temp.get_Capacity()) + " people");
                deleteAccommondationPage.squareMeters.setText((temp.get_SquareMeters()) + " Square meters");
                card.show(mainPanel, "DeleteAccommondationPage");
            }
        });

        //Modify Accommondation Page

        modifyAccommondationGUI.back.addActionListener(actionEvent -> card.show(mainPanel,"AccommondationPage"));

        deleteAccommondationPage.back.addActionListener(actionEvent -> card.show(mainPanel,"AccommondationPage"));

        modifyAccommondationGUI.next.addActionListener(actionEvent -> {

            if (it2.hasNext()) {
                temp = it2.next();
                j++;
                    modifyAccommondationGUI.name.setText("Name: " + temp.get_Name());
                    modifyAccommondationGUI.address.setText("Address: " + temp.getAddress());
                    modifyAccommondationGUI.city.setText("City: " + temp.getCity());
                    modifyAccommondationGUI.price.setText("Price: $" + (temp.get_Price()) + "/per night");
                    modifyAccommondationGUI.capacity.setText("Capacity: " + (temp.get_Capacity()) + " people");
                    modifyAccommondationGUI.squareMeters.setText((temp.get_SquareMeters()) + " Square meters");
                    modifyAccommondationGUI.facilities.setText("Facilities: "+temp.get_Facilities());
            } else {
                    it2 = currentUser.accommondations.iterator();
                    j = 0;
                    Accommondations temp = it2.next();
                    modifyAccommondationGUI.name.setText("Name: " + temp.get_Name());
                    modifyAccommondationGUI.address.setText("Address: " + temp.getAddress());
                    modifyAccommondationGUI.city.setText("City: " + temp.getCity());
                    modifyAccommondationGUI.price.setText("Price: $" + (temp.get_Price()) + "/per night");
                    modifyAccommondationGUI.capacity.setText("Capacity: " + (temp.get_Capacity()) + " people");
                    modifyAccommondationGUI.squareMeters.setText((temp.get_SquareMeters()) + " Square meters");
                    modifyAccommondationGUI.facilities.setText("Facilities: "+temp.get_Facilities());
            }

        });

        modifyAccommondationGUI.edit.addActionListener(actionEvent -> {
            if(!modifyAccommondationGUI.tname.getText().equals("")){
                currentUser.accommondations.get(j).set_Name(modifyAccommondationGUI.tname.getText());
                modifyAccommondationGUI.tname.setText("");
                modifyAccommondationGUI.name.setText("Name: "+ currentUser.accommondations.get(j).get_Name());
            }
            if(!modifyAccommondationGUI.taddress.getText().equals("")){
                currentUser.accommondations.get(j).setAddress(modifyAccommondationGUI.taddress.getText());
                modifyAccommondationGUI.taddress.setText("");
                modifyAccommondationGUI.address.setText("Address: "+ currentUser.accommondations.get(j).getAddress());
            }
            if(!modifyAccommondationGUI.tprice.getText().equals("")){
                currentUser.accommondations.get(j).set_Price(Integer.parseInt(modifyAccommondationGUI.tprice.getText()));
                modifyAccommondationGUI.tprice.setText("");
                modifyAccommondationGUI.price.setText("Price: $"+(currentUser.accommondations.get(j).get_Price())+"/per night");
            }
            if(!modifyAccommondationGUI.tcapacity.getText().equals("")){
                currentUser.accommondations.get(j).set_Capacity(Integer.parseInt(modifyAccommondationGUI.tcapacity.getText()));
                modifyAccommondationGUI.tcapacity.setText("");
                modifyAccommondationGUI.capacity.setText("Capacity: "+(currentUser.accommondations.get(j).get_Capacity())+" people");
            }
            if(!modifyAccommondationGUI.tcity.getText().equals("")){
                currentUser.accommondations.get(j).setCity(modifyAccommondationGUI.tcity.getText());
                modifyAccommondationGUI.tcity.setText("");
                modifyAccommondationGUI.city.setText("City: "+currentUser.accommondations.get(j).getCity());
            }
            if(!modifyAccommondationGUI.tsquareMeters.getText().equals("")){
                currentUser.accommondations.get(j).set_SquareMeters(Integer.parseInt(modifyAccommondationGUI.tsquareMeters.getText()));
                modifyAccommondationGUI.tsquareMeters.setText("");
                modifyAccommondationGUI.squareMeters.setText((currentUser.accommondations.get(j).get_SquareMeters())+" Square Meters");
            }
            if(!modifyAccommondationGUI.tFacilities.getText().equals("")){
                currentUser.accommondations.get(j).set_Facilities((modifyAccommondationGUI.tFacilities.getText()));
                modifyAccommondationGUI.tFacilities.setText("");
                modifyAccommondationGUI.facilities.setText("Facilities: "+(currentUser.accommondations.get(j).get_Facilities()));
            }
        });

        deleteAccommondationPage.next.addActionListener(actionEvent -> {


                if (it2.hasNext()) {
                    temp = it2.next();
                    j++;
                    deleteAccommondationPage.name.setText("Name: " + temp.get_Name());
                    deleteAccommondationPage.address.setText("Address: " + temp.getAddress());
                    deleteAccommondationPage.city.setText("City: " + temp.getCity());
                    deleteAccommondationPage.price.setText("Price: $" + (temp.get_Price()) + "/per night");
                    deleteAccommondationPage.capacity.setText("Capacity: " + (temp.get_Capacity()) + " people");
                    deleteAccommondationPage.squareMeters.setText((temp.get_SquareMeters()) + " Square meters");
                    deleteAccommondationPage.facilities.setText("Facilities: "+temp.get_Facilities());
                } else {
                    it2 = accommondations.iterator();
                    j = 0;
                    Accommondations temp = it2.next();

                        deleteAccommondationPage.name.setText("Name: " + temp.get_Name());
                        deleteAccommondationPage.address.setText("Address: " + temp.getAddress());
                        deleteAccommondationPage.city.setText("City: " + temp.getCity());
                        deleteAccommondationPage.price.setText("Price: $" + (temp.get_Price()) + "/per night");
                        deleteAccommondationPage.capacity.setText("Capacity: " + (temp.get_Capacity()) + " people");
                        deleteAccommondationPage.squareMeters.setText((temp.get_SquareMeters()) + " Square meters");
                        deleteAccommondationPage.facilities.setText("Facilities: "+temp.get_Facilities());
                }

        });

        deleteAccommondationPage.delete.addActionListener(actionEvent -> {
            accommondations.remove(currentUser.accommondations.get(j));
            currentUser.accommondations.remove(j);
            it2 = currentUser.accommondations.iterator();
            it = accommondations.iterator();
        });


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try{
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("userList.dat"));
                    out.writeObject(users);
                    out.close();
                }
                catch (FileNotFoundException exception){
                    System.out.println("File not found");
                }
                catch(IOException exception){
                    exception.printStackTrace();
                }

                try{
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("WaitingUsers.dat"));
                    out.writeObject(waitingList);
                    out.close();
                }
                catch (FileNotFoundException exception){
                    System.out.println("File not found");
                }
                catch(IOException exception){
                    exception.printStackTrace();
                }

                try{
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Accommondations.dat"));
                    out.writeObject(accommondations);
                    out.close();
                }
                catch (FileNotFoundException exception){
                    System.out.println("File not found");
                }
                catch(IOException exception){
                    exception.printStackTrace();
                }

                try{
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Messages.dat"));
                    for(User temp: users) {
                        out.writeObject(temp.messages);
                    }
                    out.close();
                }
                catch (FileNotFoundException exception){
                    System.out.println("File not found");
                }
                catch(IOException exception){
                    exception.printStackTrace();
                }

                try{
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Reservations.dat"));
                    out.writeObject(reservations);
                    out.close();
                }
                catch (FileNotFoundException exception){
                    System.out.println("File not found");
                }
                catch(IOException exception){
                    exception.printStackTrace();
                }
            }
        });


    }

    public void actionPerformed(ActionEvent actionEvent){

    }


    public void loginButton(ArrayList<User> users){
        boolean correctPass= false, noUser=false;
        for(User tempUser: users){
            if(tempUser.get_Username().equals(loginPage.userField.getText())){
                if(tempUser.get_Password().equals(String.valueOf(loginPage.passField.getPassword()))){

                    currentUser = tempUser;
                    if(tempUser.getClass() == Costumer.class){
                        card.show(mainPanel,"CostumerMenu");
                    }
                    else if(tempUser.getClass() == Provider.class){
                        card.show(mainPanel,"ProviderMenu");
                    }
                    else{
                        card.show(mainPanel,"AdministratorMenu");
                    }
                    correctPass = true;
                }
                noUser = true;
            }
        }
        if(!noUser){
            JOptionPane.showMessageDialog(null,"Wrong Password or Username");
        }
        else if(!correctPass){
            JOptionPane.showMessageDialog(null,"Wrong Password");
        }
    }


}
