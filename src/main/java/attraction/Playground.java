package attraction;

import ThemePark.ISecurity;
import visitor.Visitor;

public class Playground extends Attraction implements ISecurity {
    public Playground(String name) {
        super(name);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        boolean allowed = false;
        if (visitor.getAge() <= 15) {
            allowed = true;
        }
        return allowed;
    }
}
