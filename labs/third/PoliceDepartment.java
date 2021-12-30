package labs.third;

import java.util.Objects;

public class PoliceDepartment extends Room {
    public PoliceDepartment() {
        super("PoliceDepartment", Size.LARGE);
    }

    public PoliceDepartment(Room Similar) {
        super("PoliceDepartment", Size.LARGE, Similar);
    }

    @Override
    public String toString() {
        return "PoliceDepartment{" +
                "name=" + getName() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), "PoliceDepartment", parentContainer);
    }
}
