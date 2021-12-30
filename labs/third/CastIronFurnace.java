package labs.third;

import java.util.Objects;

public class CastIronFurnace extends Container{
    public CastIronFurnace(String name, Containable container) {
        super(name, container);
    }

    @Override
    public String toString() {
        return "CastIronFurnace{" +
                "parentContainer=" + parentContainer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public void extract(Locatable locatable){
        try {
            super.extract(locatable);
        }
        catch(ExtractionException ex){
            System.out.println(ex.getMessage());
            //ex.printStackTrace();
        }

        if(locatable instanceof Potato && super.contains(locatable)) {
            Potato potato = (Potato) locatable;
            Potato.PotatoType result = Potato.PotatoController.getCookingResult(potato);
            if (result == Potato.PotatoType.DELICIOUS) System.out.println("была приготовлена вкусная картошка");
            else if (result == Potato.PotatoType.STRANGE)
                System.out.println("съев приготовленную картошку вам останется только уповать на удачу:D Good luck!");
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),"CastIronFurnace");
    }
}
