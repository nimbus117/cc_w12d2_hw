package ThemePark;

import visitor.Visitor;

public interface ISecurity {
    boolean isAllowedTo(Visitor visitor);
}
