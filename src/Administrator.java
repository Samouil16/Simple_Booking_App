import java.io.Serializable;


public class Administrator extends User implements Serializable {

    /**
     * Ο κατασκευαστής αυτός μας επιτρέπει να κάνουμε manual εισαγωγες
     * @param name Ονομα χρηστη
     * @param surname Επιθετο χρηστη
     * @param age Ηλικια χρηστη
     * @param email Email χρηστη
     * @param username Username χρηστη
     * @param password Password χρηστη
     */
    public Administrator(String name,String surname,String[] age,String email,String username,String password){
        super(name,surname,age,email,username,password);
    }
}
