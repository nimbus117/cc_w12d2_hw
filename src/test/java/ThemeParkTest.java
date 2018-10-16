import ThemePark.ThemePark;
import attraction.Playground;
import org.junit.Before;
import org.junit.Test;
import stall.TobaccoStall;
import visitor.Visitor;

import static junit.framework.TestCase.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    TobaccoStall tobaccoStall;
    Playground playground;
    Visitor visitor;

    @Before
    public void before() {
        themePark = new ThemePark();
        tobaccoStall = new TobaccoStall("tobacco", "Bob", 50);
        playground = new Playground("playground");
        visitor = new Visitor(22, 180, 50);
    }

    @Test
    public void canAddAttraction() {
        themePark.addAttraction(playground);
        assertEquals(1, themePark.getAttractionCount());
    }

    @Test
    public void canAddStall() {
        themePark.addStall(tobaccoStall);
        assertEquals(1, themePark.getStallCount());
    }

    @Test
    public void canVisitAttraction() {
        themePark.visit(visitor, playground);
        assertEquals(1, playground.getVisitorCount());
    }
}
