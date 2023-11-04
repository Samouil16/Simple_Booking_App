import java.io.Serializable;
import java.util.ArrayList;

public class Costumer extends User implements Serializable {

    public Costumer(){
        super();
        reservations = new ArrayList<>();
    }

    /**
     * Ο κατασκευαστής αυτός μας επιτρέπει να κάνουμε manual εισαγωγες
     * @param name Ονομα χρηστη
     * @param surname Επιθετο χρηστη
     * @param age Ηλικια χρηστη
     * @param email Email χρηστη
     * @param username Username χρηστη
     * @param password Password χρηστη
     */
    public Costumer(String name,String surname,String[] age,String email,String username,String password){
        super(name,surname,age,email,username,password);
        reservations = new ArrayList<>();
    }

}
