package labs.third;

import java.util.Objects;

public class Drigl extends Entity {
    public Drigl(Containable whereAmI) {
        super("Drigl", whereAmI);

    }

    @Override
    public String toString() {
        return "Drigl{}";
    }

    @Override
    public void think() {
        System.out.println("IQ:0");
    }

    public void openDoor(Entity entity) {
        System.out.println("Дригль распахнул дверь перед " + entity.getName());
    }

    public void swingABaton(){
        System.out.println("Дригль угрожающе взмахнул резиновой дубиной");
        // Продолжение истории после 12 баллов на лабе
    }
    public void caw(){
        System.out.println("Дригль прокаркал, словно ворона");
    }

    public void frownAt(Entity entity) {
        System.out.println("Дригль хмуро взглянул на " + entity.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash("Drigl", super.hashCode());
    }
}
