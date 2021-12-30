package labs.third;

import java.util.ArrayList;
import java.util.Objects;

public class Container implements Containable, Locatable {
    protected Containable parentContainer;
    private ArrayList<Locatable> items = new ArrayList<Locatable>();
    private String name = "Untitled container";

    public Container(String name) {
        this.name = name;
    }

    public Container(String name, Containable container) {
        this.name = name;
        this.parentContainer = container;
    }

    @Override
    public void extract(Locatable locatable) {
        if (items.contains(locatable))
            items.remove(locatable);
        else throw new ExtractionException("нехорошое это дело, брать то что уже брал", this);
    }


    public void extractFromPosition(int position) {
        if (items.size() <= position)
            throw new ExtractionException("как нехорошо обкрадывать и так пустой контейнер",this);
        if (position >= 0 && position < items.size()) {
            items.remove(position);
        }
    }


    public boolean contains(Locatable locatable) {
        return items.contains(locatable);
    }


    @Override
    public void contain(Locatable locatable) {
        items.add(locatable);
    }

    @Override
    public void locate(Containable containable) {
        if (containable != null) {
            if (parentContainer != null) parentContainer.extract(this);
            parentContainer = containable;
            parentContainer.contain(this);
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
        return "Container{" +
                "items=" + items +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Container container = (Container) o;
        return Objects.equals(items, container.items) && Objects.equals(name, container.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(items, name, 9);
    }


}
