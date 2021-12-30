package labs.third;

import java.util.Objects;

public class Shorty extends Entity {
    public Shorty(String name, Container container) {
        super(name, container);
    }

    @Override
    public String toString() {
        return "Shorty{}";
    }

    @Override
    public void think() {
        if (Math.random() > 0.5)
            System.out.println("Я " + getName());
        else System.out.println("Я Боб");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), "Коротышка");
    }
}
