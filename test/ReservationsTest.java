import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ReservationsTest {

    Reservations reservation;
    Accommondations currentAccommondation;
    ArrayList<Reservations> reservations;
    Dates date;
    User user, provider;

    @Before
    public void setUp() throws Exception{
        String[] bd3 = {"16","03","2001"};
        provider = new Provider("Samouil","Pratzioti",bd3,"samouilp@csd.auth.gr","samouil","1234");
        user = new Costumer("Nela","Kalthi",bd3,"nelak@csd.auth.gr","nela","1234");
        date = new Dates(16,3,2022,20,3,2022);
        String facilities = "pool,spa,view,brunch,pet friendly";
        currentAccommondation = new HotelRoom((Provider) provider,"SKG","Thessaloniki","Plateia Ippodromiou 8",22,2,22,facilities);
        reservation = new Reservations(currentAccommondation.get_Name(),date,currentAccommondation,user);
        reservations = new ArrayList<>();
        reservations.add(reservation);

    }

    @Test
    public void reservation() {
        String[] bd3 = {"16", "03", "2001"};
        provider = new Provider("Samouil","Pratzioti",bd3,"samouilp@csd.auth.gr","samouil","1234");
        user = new Costumer("Nela","Kalthi",bd3,"nelak@csd.auth.gr","nela","1234");
        date = new Dates(16,3,2022,20,3,2022);
        String facilities = "pool,spa,view,brunch,pet friendly";
        currentAccommondation = new HotelRoom((Provider) provider,"SKG","Thessaloniki","Plateia Ippodromiou 8",22,2,22,facilities);
        reservation = new Reservations(currentAccommondation.get_Name(),date,currentAccommondation,user);

        assertEquals(false,reservation.Reservation(currentAccommondation,reservations,user));
    }
}