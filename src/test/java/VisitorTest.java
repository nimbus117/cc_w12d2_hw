import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VisitorTest {

    Visitor visitor;
    @Before
    public void before() {
       visitor = new Visitor(22, 180, 50);
    }

    @Test
    public void hasAge() {
        assertEquals(22, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(180, visitor.getHeight());
    }

    @Test
    public void hasMoney() {
        assertEquals(50, visitor.getMoney());
    }
}
