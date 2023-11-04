import java.io.Serializable;


public class HotelRoom extends Accommondations implements Serializable {

    /**
     * Ο κατασκευαστής αυτός μας επιτρέπει να εισάγουμε χειροκίνητα ένα δωμάτιο ξενοδοχείου
     * @param provider ο πάροχος του δωματίου
     * @param name το όνομα του δωματίου
     * @param city η πόλη που βρίσκεται το δωμάτιο
     * @param address η διεύθυνση που βρίσκεται το δωμάτιο
     * @param price η τιμή του δωματίου
     * @param capacity η χωρητικότητα του δωματίου
     * @param squareMeters τα τετραγωνικά μέτρα του δωματίου
     * @param facilities οι παροχές του δωματίου
     */
    public HotelRoom(Provider provider,String name, String city, String address, int price, int capacity, int squareMeters, String facilities){
        super(provider,name, city, address,price,capacity,squareMeters,facilities);
    }

    public HotelRoom(){}
}
