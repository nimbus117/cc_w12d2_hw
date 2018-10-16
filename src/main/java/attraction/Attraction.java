package attraction;

import ThemePark.IReviewed;
import ThemePark.ISecurity;
import ThemePark.ITicketed;
import visitor.Visitor;

import java.util.ArrayList;

public abstract class Attraction implements IReviewed, ISecurity, ITicketed {
    private String name;
    private ArrayList<Visitor> visitors;
    private int rating;

    public Attraction(String name) {
        this.name = name;
        visitors = new ArrayList<>();
        rating = 5;
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

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public void setRating(int rating) {
       this.rating = rating;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return true;
    }

    @Override
    public double defaultPrice() {
        return 5;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }
}
