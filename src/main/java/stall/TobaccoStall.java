package stall;

import ThemePark.ISecurity;
import ThemePark.ITicketed;
import visitor.Visitor;

public class TobaccoStall extends Stall implements ISecurity, ITicketed {
    public TobaccoStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        boolean allowed = false;
        if (visitor.getAge() >= 18) {
            allowed = true;
        }
        return allowed;
    }
}
