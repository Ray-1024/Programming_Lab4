package labs.third;

public class Potato extends Item{
    public Potato(String name, Containable container) {
        super(name, container);

    }

    public enum PotatoType{
        DELICIOUS,STRANGE
    }

    public static class PotatoController{
        private static int countDelicious = 0;
        private static int countStrange = 0;

        public static PotatoType getCookingResult(Potato potato){
            if(Math.random() >= 0.5){
                PotatoController.countDelicious++;
                return PotatoType.DELICIOUS;
            }
            else{
                PotatoController.countStrange++;
                return PotatoType.STRANGE;
            }
        }
    }

    @Override
    public String toString() {
        return "Potato{}";
    }

    @Override
    public void use() {

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
