package ThemePark;

import attraction.Attraction;
import stall.Stall;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.HashMap;

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

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> reviewed = new ArrayList<>();
        reviewed.addAll(attractions);
        reviewed.addAll(stalls);
        return reviewed;
    }

    public ArrayList<ITicketed> getAllAllowedFor(Visitor visitor) {
        ArrayList<ISecurity> all = new ArrayList<>();
        ArrayList<ITicketed> allowed = new ArrayList<>();
        all.addAll(attractions);
        all.addAll(stalls);
        for (ISecurity i:all) {
            if (i.isAllowedTo(visitor)) {
                allowed.add((ITicketed) i);
            }
        }
        return allowed;
    }

    public HashMap<String, Integer> getReviews() {
        ArrayList<IReviewed> reviewed = new ArrayList<>();
        reviewed.addAll(attractions);
        reviewed.addAll(stalls);
        HashMap<String, Integer> reviews = new HashMap<>();
        for (IReviewed i:reviewed) {
            reviews.put(i.getName(), i.getRating());
        }
        return reviews;
    }
}
