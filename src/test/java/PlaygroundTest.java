import attraction.Playground;
import org.junit.Test;
import visitor.Visitor;

import static junit.framework.TestCase.*;

public class PlaygroundTest {
    @Test
    public void hasName() {
        Playground playground = new Playground("Playground");
        assertEquals("Playground", playground.getName());
    }

    @Test
    public void isAllowed() {
        Playground playground = new Playground("Playground");
        Visitor visitor = new Visitor(14,120, 10);
        assertTrue(playground.isAllowedTo(visitor));
    }

    @Test
    public void isNotAllowed() {
        Playground playground = new Playground("Playground");
        Visitor visitor = new Visitor(16,120, 10);
        assertFalse(playground.isAllowedTo(visitor));
    }
}
