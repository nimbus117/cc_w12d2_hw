import attraction.Dodgems;
import org.junit.Before;
import org.junit.Test;
import visitor.Visitor;

import static junit.framework.TestCase.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    @Before
    public void before() {
        dodgems = new Dodgems("Dodgems");
    }

    @Test
    public void halfsPriceForUnder12() {
        Visitor visitor = new Visitor(10,205, 10);
        assertEquals(1.5, dodgems.priceFor(visitor));
    }

    @Test
    public void givesDefaultPrice() {
        Visitor visitor = new Visitor(20,185, 10);
        assertEquals(3.0, dodgems.priceFor(visitor));
    }
}
