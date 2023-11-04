import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DatesTest {

    private Dates date;

    @Before
    public void setUp() throws Exception{
        date = new Dates(16, 1, 2022, 20, 1, 2022);
    }
    @Test
    public void dayToNum() {
        assertEquals(16,date.dayToNum(date.fromDay,date.fromMonth,date.fromYear));
    }

    @Test
    public void checkDate() {
        assertEquals(true,date.checkDate());
    }
}