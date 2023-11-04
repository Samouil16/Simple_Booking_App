import java.io.Serializable;
import java.util.ArrayList;


public class Provider extends User implements Serializable {

    public Provider(){
        super();
    }


    /**
     * Ο κατασκευαστής αυτός μας επιτρέπει να κάνουμε manual εισαγωγες παρόχων
     * @param name Ονομα χρηστη
     * @param surname Επιθετο χρηστη
     * @param age Ηλικια χρηστη
     * @param email Email χρηστη
     * @param username Username χρηστη
     * @param password Password χρηστη
     */
    public Provider(String name,String surname,String[] age,String email,String username,String password){
        super(name,surname,age,email,username,password);
        accommondations = new ArrayList<>();
    }

}
