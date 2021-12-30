package labs.third;

import java.util.Objects;

public class Arrested extends Entity {
    public Arrested(Container container) {
        super("Arrested", container);
    }

    @Override
    public String toString() {
        return "Arrested{" + getName() + "}";
    }



    @Override
    public void think() {
        if (Math.random() > 0.01)
            System.out.println("...");
        else System.out.println("?");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), "Arrested");
    }
}
