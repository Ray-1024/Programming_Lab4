package labs.third;

public class Lamp extends Item{
    public Lamp(String name, Containable container) {
        super(name, container);
    }

    @Override
    public String toString() {
        return "Lamp{}";
    }

    @Override
    public void use() {
        System.out.println("лампочка ОЧЕНЬ сильно пытается светиться сильнее, но у нее не выходит");
        // Я тоже ОЧЕНЬ сильно хочу 12 баллов за лабу
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
