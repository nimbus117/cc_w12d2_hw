package stall;

import ThemePark.ITicketed;
import visitor.Visitor;

public abstract class Stall implements ITicketed {
    private String name;
    private String ownerName;
    private int parkingSpot;

    public Stall(String name, String ownerName, int parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
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
}
