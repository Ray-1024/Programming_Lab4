package labs.third;

import java.util.Objects;

public class Migl extends Entity{
    public Migl(Containable whereAmI){
        super("Migl",whereAmI);
    }

    @Override
    public void think() {
        System.out.println("Loading...");
    }

    public void pressTheElectricBellButton(){
        class ElectricBellButton{
            public void Click(){
                if(Math.random() > 0.75) System.out.println("Клац!Тык!");
                else System.out.println("Клик!");
            }
        }
        ElectricBellButton electricBellButton = new ElectricBellButton();
        electricBellButton.Click();
        electricBellButton = null;
        System.out.println("Кнопка сломалась, не повезло");
    }


    @Override
    public String toString() {
        return "Migl{}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash("Migl",super.hashCode());
    }
}
