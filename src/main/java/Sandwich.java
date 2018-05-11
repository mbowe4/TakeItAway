import Interfaces.SandwichBase;
import Interfaces.Sandwichable;

import java.util.Collection;

public class Sandwich extends MenuItem {
    private Bread bread;
    private SandwichBase sandwichBase;
    private Collection<Sandwichable> sandwichable;

    public Sandwich(Bread bread, SandwichBase sandwichBase, Collection<Sandwichable> sandwichables) {
        setBread(bread);
        setSandwichBase(sandwichBase);
        setSandwichables(sandwichables);
    }

    public Bread getBread() {
        return bread;
    }

    private void setBread(Bread bread) {
        this.bread = bread;
    }

    public SandwichBase getSandwichBase() {
        return sandwichBase;
    }

    private void setSandwichBase(SandwichBase sandwichBase) {
        this.sandwichBase = sandwichBase;
    }

    public Collection<Sandwichable> getSandwichables() {
        return sandwichable;
    }

    private void setSandwichables(Collection<Sandwichable> sandwichables) {
        this.sandwichable = sandwichables;
    }

    public double getPrice() {
        return 0;
    }
}
