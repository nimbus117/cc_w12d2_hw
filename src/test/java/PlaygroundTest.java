import attraction.Playground;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaygroundTest {
    @Test
    public void hasName() {
        Playground playground = new Playground("Playground");
        assertEquals("Playground", playground.getName());
    }
}
