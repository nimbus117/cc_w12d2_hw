package attraction;

import ThemePark.ITicketed;
import visitor.Visitor;

public class Dodgems extends Attraction implements ITicketed {
    public Dodgems(String name) {
        super(name);
    }

    @Override
    public double defaultPrice() {
        return 3.0;
    }

    @Override
    public double priceFor(Visitor visitor) {
        double price = defaultPrice();
        if (visitor.getAge() < 12) {
            price = price / 2;
        }
        return price;
    }
}

