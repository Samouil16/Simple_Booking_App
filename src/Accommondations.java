import java.io.Serializable;


public class Accommondations implements Serializable {

    private String name, address, city;
    Provider provider;
    private int price, capacity,squareMeters;
    String facilities;

    /**
     * Αυτός ο κατασκευαστής μας επιτρέπει να εισάγουμε manual τα καταλύματα
     * @param name Όνομα καταλύματος
     * @param price Τιμη ανα βράδυ
     * @param capacity Χωρητικότητα
     * @param squareMeters Τετραγωνικά
     * @param facilities Εγκαταστάσεις
     */
    public Accommondations(Provider provider,String name, String city, String address, int price, int capacity, int squareMeters, String facilities){
        this.name = name;
        this.provider = provider;
        this.price = price;
        this.capacity = capacity;
        this.squareMeters = squareMeters;
        this.facilities = facilities;
        this.address = address;
        this.city = city;
    }

    public Accommondations(){

    }    
    
    public void set_Name(String name){
        this.name = name;
    }
    
    public void set_Price(int price){
        this.price=price;
    }
    
    public void set_Capacity(int capacity){
        this.capacity=capacity;
    }

    public void set_SquareMeters(int squareMeters){
        this.squareMeters=squareMeters;
    }

    public void set_Facilities(String facilities){
        this.facilities = facilities;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setAddress(String address){
        this.address = address;
    }
    
    public String get_Name(){
        return name;
    }

    
    public int get_Price(){
        return (price);
    }

    public int get_Capacity(){
        return capacity;
    }

    public int get_SquareMeters(){
        return squareMeters;
    }
    
    public String get_Facilities(){
        return facilities;
    }

    public String getAddress(){
        return this.address;
    }

    public String getCity(){
        return this.city;
    }

}
