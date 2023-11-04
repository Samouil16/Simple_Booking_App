import java.io.Serializable;
import java.util.ArrayList;

public class Reservations implements Serializable {
    String name;
    Dates date;
    Accommondations currentAccommondation;
    int totalPrice;
    User currentUser;

    public Reservations(){
        date = new Dates();
    }

    /**
     * Ο κατασκευαστής αυτός μας επιτρέπει να κάνουμε χειροκίνητα εισαγωγές κρατήσεων, καλεί την συνάρτηση μετατροπής ημερομηνιών
     * και βρίσκει την συνολική τιμή ανάλογα με τις ημερομηνίες που κρατήθηκε
     * @param name το όνομα του καταλύματος
     * @param date η ημερομηνία κράτησης
     * @param currentAccommondation το κατάλυμα
     * @param currentUser ο χρήστης που κάνει την κράτηση
     */
    public Reservations(String name, Dates date, Accommondations currentAccommondation, User currentUser){
        this.name = name;
        this.date = date;
        this.currentAccommondation = currentAccommondation;
        this.currentUser = currentUser;
        date.setDayOfYear();
        setTotalPrice(currentAccommondation);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCurrentUser(User user){
        this.currentUser = user;
    }

    public void setTotalPrice(Accommondations accommondation){
        totalPrice = (date.untilNum - date.fromNum) * accommondation.get_Price();
    }

    /**
     * Σε αυτή την συνάρτηση ελέγχουμε εαν είναι κρατημένες οι ημερομήνιες που έχει δώσει ο χρήστης
     * @param currentAccommondation το κατάλυμα στο οποίο γίνεται η κράτηση
     * @param reservations η λίστα με όλες τις κρατήσεις
     * @param currentUser Ο χρήστης που κάνει την κράτηση
     * @return
     */
    public Boolean Reservation(Accommondations currentAccommondation, ArrayList<Reservations> reservations, User currentUser){

        Reservations currentReservation = this;

        this.currentAccommondation = currentAccommondation;

        currentReservation.setCurrentUser(currentUser);


        currentReservation.date.setDayOfYear();

        currentReservation.setTotalPrice(currentAccommondation);

        currentReservation.setName(currentAccommondation.get_Name());

        for(Reservations tempReservations: reservations){
            if(tempReservations.name.equals(currentAccommondation.get_Name())){
                if((currentReservation.date.fromNum >= tempReservations.date.fromNum && currentReservation.date.fromNum < tempReservations.date.untilNum) || (currentReservation.date.untilNum > tempReservations.date.fromNum && currentReservation.date.untilNum <= tempReservations.date.untilNum))
                    return false;
                }
            }

        return true;
    }

}
