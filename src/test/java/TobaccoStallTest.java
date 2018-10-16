import org.junit.Before;
import org.junit.Test;
import stall.TobaccoStall;
import visitor.Visitor;

import static junit.framework.TestCase.*;

public class TobaccoStallTest {
    TobaccoStall tobaccoStall;
    Visitor visitor;
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

    @Test
    public void isAllowed() {
        Visitor visitor = new Visitor(19,120, 10);
        assertTrue(tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void isNotAllowed() {
        Visitor visitor = new Visitor(16,120, 10);
        assertFalse(tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void getsPrice() {
        Visitor visitor = new Visitor(23,120, 10);
        assertEquals(5.0, tobaccoStall.priceFor(visitor));
    }
}
