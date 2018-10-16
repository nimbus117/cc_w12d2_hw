import ThemePark.ThemePark;
import attraction.Playground;
import attraction.Rollercoaster;
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

    @Test
    public void returnsAllReviewd() {
        themePark.addAttraction(playground);
        themePark.addStall(tobaccoStall);
        assertEquals(2, themePark.getAllReviewed().size());
    }

    @Test
    public void returnsAllAllowedOld() {
        themePark.addAttraction(playground);
        themePark.addStall(tobaccoStall);
        assertEquals(1, themePark.getAllAllowedFor(visitor).size());
    }

    @Test
    public void returnsAllAllowedYoung() {
        themePark.addAttraction(playground);
        themePark.addStall(tobaccoStall);
        Rollercoaster rollercoaster = new Rollercoaster("blah");
        themePark.addAttraction(rollercoaster);
        Visitor youngVisitor = new Visitor(12, 180, 50);
        assertEquals(2, themePark.getAllAllowedFor(visitor).size());
    }

    @Test
    public void returnsReviews() {
        themePark.addAttraction(playground);
        themePark.addStall(tobaccoStall);
        playground.setRating(4);
        int tReview = themePark.getReviews().get("tobacco");
        int pgReview = themePark.getReviews().get("playground");
        assertEquals(5, tReview);
        assertEquals(4, pgReview);
    }
}
