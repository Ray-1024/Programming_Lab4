package labs.third;

import java.util.Objects;

public class Room extends Container {
    private Size size = null;
    private Room similar = null;

    public Room(String name, Size size) {
        super(name);
        this.size = size;
    }

    public Room(String name, Size size, Room similar) {
        super(name);
        this.size = size;
        this.similar = similar;
    }


    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Room { Name:" + getName() + ", Size: " + size + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size, getName(),similar);
    }
}
