package labs.third;


import java.util.Objects;

public class Neznayka extends Entity {

    public Neznayka(Container container) {
        super("Neznayka", container);
    }

    @Override
    public void think() {
        if (Math.random() > 0.01) System.out.println("Разговоры действительно не принесут пользы");
        else System.out.println("...");
    }

    public void waveYourHand() {
        System.out.println("Незнайка махнул рукой");
    }

    public void getOutTheDoor() throws GetOutFromVoidException{
        if(container == null)throw new GetOutFromVoidException("За какую блин дверь можно выйти из пустоты?");
        leave();
        System.out.println("Незнайка вышел за дверь");
    }

    @Override
    public String toString() {
        return "Neznayka";
    }

    public void tryCleaningFace() {
        if (Math.random() > 0.999) System.out.println("Незнайка успешно очистил свое лицо");
        else System.out.println("Незнайка успешно размазал еще больше черной краски по своему лицу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), "Незнайка");
    }
}
