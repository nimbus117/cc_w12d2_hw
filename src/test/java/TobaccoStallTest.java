import org.junit.Before;
import org.junit.Test;
import stall.TobaccoStall;

import static junit.framework.TestCase.assertEquals;

public class TobaccoStallTest {
    TobaccoStall tobaccoStall;
    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Tobacco", "Bob", 53);
    }

    @Test
    public void hasName() {
        assertEquals("Tobacco", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Bob", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(53, tobaccoStall.getParkingSpot());
    }
}
