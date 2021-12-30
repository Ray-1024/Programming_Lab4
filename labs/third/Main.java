package labs.third;

public class Main {

    public static void main(String[] args) {
        Migl migl = new Migl(null);
        migl.pressTheElectricBellButton();

        Drigl drigl = new Drigl(null);
        drigl.printCharacteristics();


        Neznayka neznayka = new Neznayka(null);
        drigl.frownAt(neznayka);
        drigl.openDoor(neznayka);
        drigl.swingABaton();
        drigl.caw();
        System.out.print("Сообразив, что ");
        neznayka.think();
        neznayka.waveYourHand();

        try {
            neznayka.getOutTheDoor();
        } catch (GetOutFromVoidException ex) {
            System.out.println("обожаю выходить из пустоты");
        }


        PoliceDepartment policeDepartment = new PoliceDepartment();
        RiggingCompartment riggingCompartment = new RiggingCompartment(Size.LARGE, policeDepartment);

        Arrested arrested = new Arrested(riggingCompartment);
        riggingCompartment.setInformalName("Каталажка", arrested);


        System.out.println(" в полицейском управлении называлась огромная комната, напоминавшая по своему виду корабельную " +
                "кладовую, где на многочисленных полках хранились различные корабельные снасти, обычно именуемые " +
                "такелажем. Разница была лишь в том, что на полках здесь лежали не корабельные снасти, а обыкновенные коротышки.");
        CastIronFurnace castIronFurnace = new CastIronFurnace("usual cast iron furnace", riggingCompartment);
        System.out.println("посреди каталажки стояла большая чугунная печь от которой во все стороны помещения тянулись жестяные трубы");
        Shorty BobBaker = new Shorty("Bob", castIronFurnace) {
            @Override
            public void doSomething() {
                Potato potato = new Potato("RandomPotato", container);
                container.contain(potato);
                container.extract(potato);
            }
        };
        BobBaker.doSomething();

        Shorty AnnStoryteller = new Shorty("Ann", riggingCompartment) {
            @Override
            public void doSomething() {
                System.out.println("telling an interesting story...");
            }
        };
        AnnStoryteller.doSomething();

        Shorty DanDressmaker = new Shorty("Dan", riggingCompartment) {
            @Override
            public void doSomething() {
                System.out.println("creating a large number of holes");
            }
        };
        DanDressmaker.doSomething();
        Lamp lamp = new Lamp("ThisLamp", riggingCompartment);
        lamp.use();


    }


}
