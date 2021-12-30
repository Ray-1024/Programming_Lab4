package labs.third;

import java.util.Objects;

public abstract class Entity implements Locatable {
    private String name = "Untitled Entity";
    protected Containable container = null;
    private Characteristic characteristic;


    public class Characteristic {
        private HairType hairType;
        private FaceType faceType;

        public Characteristic() {
            hairType = HairType.LONG;
            faceType = FaceType.NARROW;
        }

        public Characteristic(HairType newHairType, FaceType newFaceType) {
            hairType = newHairType;
            faceType = newFaceType;
        }

        public HairType getHairType() {
            return hairType;
        }

        public void setHairType(HairType hairType) {
            this.hairType = hairType;
        }

        public FaceType getFaceType() {
            return faceType;
        }

        public void setFaceType(FaceType faceType) {
            this.faceType = faceType;
        }
    }

    public void printCharacteristics() {
        if (characteristic != null) {
            if (characteristic.getFaceType().equals(FaceType.WIDECHEEKEDANDBLUNT))
                System.out.println("широкоскулое, туповатое лицо с низким лбом");
            else if (characteristic.getFaceType().equals(FaceType.NARROW)) System.out.println("узкое лицо");

            if (characteristic.getHairType().equals(HairType.LONG)) System.out.println("с длинными волосамм");
            else if (characteristic.getHairType().equals(HairType.ASHEDGEHOG))
                System.out.println("с подстриженными как ёжик волосами");
            else if (characteristic.getHairType().equals(HairType.SHORT)) System.out.println("с короткими волосами");
        }
    }


    public Entity(String name, Containable container) {
        this.name = name;
        this.characteristic = new Characteristic();
        if (container != null) {
            this.container = container;
            this.container.contain(this);
        }
    }

    public Entity(String name, Containable container, Characteristic characteristic) {
        this.characteristic = characteristic;
        this.name = name;
        if (container != null) {
            this.container = container;
            this.container.contain(this);
        }
    }

    public void doSomething() {
        System.out.println("*хорошая иммитация работы*");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void think();

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    public void leave() throws GetOutFromVoidException{
        if (container != null) {
            container.extract(this);
            container = null;
        } else throw new GetOutFromVoidException(getName() + " старается сбежать из ничего");
    }

    @Override
    public void locate(Containable containable) {
        if (containable != null) {
            try{
                leave();
            }
            catch(GetOutFromVoidException ex){
                System.out.println("");
            }
            container = containable;
            container.contain(this);
        }
    }


    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", container=" + container +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(name, entity.name) && Objects.equals(container, entity.container);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, container, 6);
    }
}
