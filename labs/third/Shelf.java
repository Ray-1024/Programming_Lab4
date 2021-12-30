package labs.third;

import java.util.Objects;

public class Shelf extends Container implements Locatable {
    public Shelf(String name) {
        super(name);
    }

    public Shelf(String name, Containable containable) {
        super(name);
        this.parentContainer = containable;
    }

    @Override
    public String toString() {
        return "{ Shelf: " + getName() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), "Shelf", getName());
    }
}
