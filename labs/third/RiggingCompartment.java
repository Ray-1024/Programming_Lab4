package labs.third;

import java.util.ArrayList;
import java.util.Objects;

public class RiggingCompartment extends Room {
    String informalName = "Каталажка";
    Entity whoNamed = null;
    Container castIronFurnace;

    public RiggingCompartment(Size size) {
        super("RiggingCompartment", size);
        for (int i = 0; i < 10; ++i) {
            Shelf tmp = new Shelf("Shelf_" + i, this);
            contain(tmp);
            for (int j = 0; j < 10; ++j) tmp.contain(new Shorty("Shorty_" + j, tmp));
        }
        castIronFurnace = new CastIronFurnace("", this);
    }

    public void setInformalName(String informalName, Entity Who) {

        this.informalName = informalName;
        this.whoNamed = Who;
        System.out.println(informalName + ", как ее окрестили сами арестованные");
    }

    public RiggingCompartment(Size size, Room similar) {
        super("RiggingCompartment", size, similar);
        for (int i = 0; i < 10; ++i) {
            Shelf tmp = new Shelf("Shelf_" + i, this);
            contain(tmp);
            for (int j = 0; j < 10; ++j) tmp.contain(new Shorty("Shorty_" + j, tmp));
        }
        castIronFurnace = new CastIronFurnace("", this);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), getSize(), "RiggingCompartment");
    }

}
