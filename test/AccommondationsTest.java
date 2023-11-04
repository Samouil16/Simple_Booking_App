import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccommondationsTest {

    Accommondations accommondation;
    User provider;

    @Before
    public void setUp() throws Exception {
        String[] bd4 = {"16","03","2001"};
        provider = new Provider("Samouil","Pratzioti",bd4,"samouilp@csd.auth.gr","samouil","1234");
        String facilities = "pool,spa,view,brunch,pet friendly";
        accommondation = new Apartment((Provider) provider,"NELA","LARNACA","ARCHANGELOU MICHAEL",22,2,22,facilities);
    }

    @Test
    public void get_Name() {
        assertEquals("NELA",accommondation.get_Name());
    }

    @Test
    public void get_Price() {
        assertEquals(22,accommondation.get_Price());
    }

    @Test
    public void get_Capacity() {
        assertEquals(2,accommondation.get_Capacity());
    }

    @Test
    public void get_SquareMeters() {
        assertEquals(22,accommondation.get_SquareMeters());
    }

    @Test
    public void get_Facilities() {
        assertEquals("pool,spa,view,brunch,pet friendly",accommondation.get_Facilities());
    }

    @Test
    public void getAddress() {
        assertEquals("ARCHANGELOU MICHAEL",accommondation.getAddress());
    }

    @Test
    public void getCity() {
        assertEquals("LARNACA",accommondation.getCity());
    }
}