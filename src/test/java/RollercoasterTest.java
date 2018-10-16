import attraction.Playground;
import attraction.Rollercoaster;
import org.junit.Before;
import org.junit.Test;
import visitor.Visitor;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    @Before
    public void before() {
       rollercoaster = new Rollercoaster("rollercoaster");
    }

    @Test
    public void isAllowed() {
        Visitor visitor = new Visitor(14,150, 10);
        assertTrue(rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void isNotAllowedHeight() {
        Visitor visitor = new Visitor(16,120, 10);
        assertFalse(rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void isNotAllowedAge() {
        Visitor visitor = new Visitor(11,160, 10);
        assertFalse(rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void doublesPriceforTallVisitors() {
        Visitor visitor = new Visitor(20,205, 10);
        assertEquals(10.0, rollercoaster.priceFor(visitor));
    }

    @Test
    public void givesDefaultPrice() {
        Visitor visitor = new Visitor(20,185, 10);
        assertEquals(5.0, rollercoaster.priceFor(visitor));
    }
}
