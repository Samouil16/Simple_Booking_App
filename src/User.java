import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private String[] birthDay;
    private String name, surname, email, username, password;
    ArrayList<Accommondations> accommondations;
    ArrayList<Messages> messages;
    ArrayList<Reservations> reservations;

    public User(){}

    /**
     * Ο κατασκευαστής αυτός επιτρέπει να εισάγουμε χειροκίνητα έναν χρήστη
     * @param name το όνομα του χρήστη
     * @param surname το επίθετο του χρήστη
     * @param birthDay η ημερομηνία γέννησης
     * @param email το email του χρήστη
     * @param username το ψευδώνυμο του χρήστη
     * @param password ο κωδικός του χρήστη
     */
    public User(String name,String surname,String[] birthDay,String email,String username,String password) {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.email = email;
        this.username = username;
        this.password = password;
        messages = new ArrayList<>();
    }
    

    public void set_Name(String name){
        this.name=name;
    }

    public void set_Surname(String surname){
        this.surname=surname;
    }

    public void set_Age(String[] birthDay){this.birthDay = birthDay;
    }

    public void set_Email(String email){
        this.email=email;
    }

    public void set_Username(String username){
        this.username=username;
    }

    public void set_Password(String password){
        this.password=password;
    }
    
    public String get_Name(){
        return this.name;
    }

    public String get_Surname(){
        return this.surname;
    }

    public String get_Email(){
        return this.email;
    }

    public String get_Username(){
        return this.username;
    }

    public String get_Password(){
        return this.password;
    }

}
