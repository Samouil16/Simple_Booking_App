import java.io.*;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws  IOException{
/*
        String[] bd = {"01","09","2002"};
        User admin1 = new Administrator("Nela","Kalthi",bd,"nelak@csd.auth.gr","nelak","1234");
        String[] bd2 = {"16","03","2001"};
        User admin2 = new Administrator("Samouil","Pratzioti",bd2,"samouilp@csd.auth.gr","samouilp","1234");
        String[] bd3 = {"16","03","2001"};
        User costumer = new Costumer("Nela","Kalthi",bd3,"nelak@csd.auth.gr","nela","1234");
        String[] bd4 = {"16","03","2001"};
        User provider = new Provider("Samouil","Pratzioti",bd4,"samouilp@csd.auth.gr","samouil","1234");

        String facilities = "pool,spa,view,brunch,pet friendly";
        Accommondations hotel1 = new HotelRoom((Provider) provider,"SKG","Thessaloniki","Plateia Ippodromiou 8",22,2,22,facilities);
        Accommondations apartment1 = new Apartment((Provider) provider,"NELA","LARNAKA","ARCHANGELOU MICHAEL",22,2,22,facilities);

        provider.accommondations.add(hotel1);
        provider.accommondations.add(apartment1);

        Dates date = new Dates(16,3,2022,20,3,2022);
        Reservations reservation = new Reservations(hotel1.get_Name(),date,apartment1,costumer);
*/
        ArrayList<User> users = new ArrayList<>();
        ArrayList<User> waitingUsers = new ArrayList<>();
        ArrayList<Accommondations> accommondations = new ArrayList<>();
        ArrayList<Reservations> reservations = new ArrayList<>();
/*
        users.add(admin1);
        users.add(admin2);
        users.add(costumer);
        users.add(provider);

        accommondations.add(hotel1);
        accommondations.add(apartment1);

        reservations.add(reservation);
        costumer.reservations.add(reservation);


        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("userlist.dat"));
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
            out.writeObject(waitingUsers);
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
*/
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("userList.dat"))){
            users = (ArrayList<User>) in.readObject();
        }catch (IOException | ClassNotFoundException exception){
            exception.printStackTrace();
        }

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("Accommondations.dat"))){
            accommondations = (ArrayList<Accommondations>) in.readObject();
        }catch (IOException | ClassNotFoundException exception){
            exception.printStackTrace();
        }

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("Reservations.dat"))){
            reservations = (ArrayList<Reservations>) in.readObject();
        }catch (IOException | ClassNotFoundException exception){
            exception.printStackTrace();
        }

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("WaitingUsers.dat"))){
            waitingUsers = (ArrayList<User>) in.readObject();
        }catch (IOException | ClassNotFoundException exception){
            exception.printStackTrace();
        }

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("Messages.dat"))){
            for(User temp: users) {
                temp.messages = (ArrayList<Messages>) in.readObject();
            }
        }catch (IOException | ClassNotFoundException exception){
            exception.printStackTrace();
        }

        new GUI(waitingUsers, users, accommondations, reservations);

    }
}
