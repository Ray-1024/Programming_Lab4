package labs.third;

import java.util.Objects;

public abstract class Item implements Locatable {
    private String name = "Untitled item";
    private Containable container = null;

    public Item(String name, Containable container) {
        this.name = name;
        if (container != null)
            this.container = container;
    }

    public abstract void use();

    @Override
    public void locate(Containable containable) {
        if (containable != null) {
            if (container != null) container.extract(this);
            container = containable;
            container.contain(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, container, 4);
    }
}
