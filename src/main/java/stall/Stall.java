package stall;

public abstract class Stall {
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
}
