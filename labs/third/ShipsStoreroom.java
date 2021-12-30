package labs.third;

import java.util.Objects;

public class ShipsStoreroom extends Room {
    public ShipsStoreroom(Size size) {
        super("ShipsStoreroom", size);
        for (int i = 0; i < 10; ++i) {
            Shelf tmp = new Shelf("Shelf_" + i, this);
            contain(tmp);
            for (int j = 0; j < 10; ++j) tmp.contain(new ShipRigging("ShipRigging_" + j, tmp));
        }
    }

    public ShipsStoreroom(Size size, Room similar) {
        super("ShipsStoreroom", size, similar);
        for (int i = 0; i < 10; ++i) {
            Shelf tmp = new Shelf("Shelf_" + i, this);
            contain(tmp);
            for (int j = 0; j < 10; ++j) tmp.contain(new ShipRigging("ShipRigging_" + j, tmp));
        }
    }

    @Override
    public String toString() {
        return "ShipsStoreroom{ Name:" + getName() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), getSize(), "ShipsStoreroom");
    }
}
