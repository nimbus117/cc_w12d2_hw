package attraction;

import ThemePark.ISecurity;
import ThemePark.ITicketed;
import visitor.Visitor;

public class Rollercoaster extends Attraction implements ISecurity, ITicketed {
    public Rollercoaster(String name) {
        super(name);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        boolean allowed = false;
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145) {
            allowed = true;
        }
        return allowed;
    }

    @Override
    public double defaultPrice() {
        return 5.0;
    }

    @Override
    public double priceFor(Visitor visitor) {
       double price = defaultPrice();
       if (visitor.getHeight() > 200) {
           price = price * 2;
       }
       return price;
    }
}
