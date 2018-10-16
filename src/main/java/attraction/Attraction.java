package attraction;

import visitor.Visitor;

import java.util.ArrayList;

public abstract class Attraction {
    private String name;
    private ArrayList<Visitor> visitors;

    public Attraction(String name) {
        this.name = name;
        visitors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getVisitorCount() {
        return visitors.size();
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }
}
