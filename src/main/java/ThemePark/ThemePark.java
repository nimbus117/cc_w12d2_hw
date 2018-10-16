package ThemePark;

import attraction.Attraction;
import stall.Stall;
import visitor.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark() {
        attractions = new ArrayList<>();
        stalls = new ArrayList<>();
    }

    public int getAttractionCount() {
        return attractions.size();
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    public int getStallCount() {
        return stalls.size();
    }

    public void addStall(Stall stall) {
        stalls.add(stall);
    }

    public void visit(Visitor visitor, Attraction attraction) {
       attraction.addVisitor(visitor);
    }
}
