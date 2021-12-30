package labs.third;

import java.util.Objects;

public class ShipRigging extends Item {
    public ShipRigging(String name, Containable container) {
        super(name, container);
    }

    @Override
    public void use() {
        System.out.println("ShipRigging used");
    }

    @Override
    public String toString() {
        return "ShipRigging{ Name: " + getName() + "}";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), "ShipRigging");
    }
}
