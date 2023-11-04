import java.io.Serializable;


public class Apartment extends Accommondations implements Serializable {

    /**
     * Ο κατασκευαστής αυτός μας επιτρέπει να εισάγουμε χειροκίνητα ένα διαμέρισμα
     * @param provider ο πάροχος του διαμερίσματος
     * @param name το όνομα του διαμερίσματος
     * @param city η πόλη που βρίσκεται το διαμέρισμα
     * @param address η διεύθυνση που βρίσκεται το διαμέρισμα
     * @param price η τιμή του διαμερίσματος
     * @param capacity η χωρητικότητα διαμερίσματος
     * @param squareMeters τα τετραγωνικά μέτρα του διαμερίσματος
     * @param facilities οι παροχές του διαμερίσματος
     */
    public Apartment(Provider provider,String name, String city, String address, int price, int capacity, int squareMeters, String facilities){
        super(provider,name, city, address,price,capacity,squareMeters,facilities);
    }

    public Apartment(){}
}
