package stall;

import ThemePark.IReviewed;
import ThemePark.ISecurity;
import ThemePark.ITicketed;
import visitor.Visitor;

public abstract class Stall implements ITicketed, IReviewed, ISecurity {
    private String name;
    private String ownerName;
    private int parkingSpot;
    private int rating;

    public Stall(String name, String ownerName, int parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        rating = 5;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getName() {
        return name;
    }

    @Override
    public double defaultPrice() {
        return 5;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return defaultPrice();
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
}
