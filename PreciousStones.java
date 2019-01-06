public abstract class PreciousStones extends Thing {
    public enum Rarety{
        RARE,
        COMMON,
        EXTREMELYRARE;
    }

    @Override
    public void action() {

    }

    @Override
    public void getDescribe() {

    }

    public PreciousStones(String name, ThingActions... thingActions) {
        super(name);
        addThingAction(thingActions);

    }

    public static class Diamond extends PreciousStones {
        public Diamond(String name, ThingActions... thingActions) {
            super(name);
            addThingAction(thingActions);
        }
    }
//ОПАЧКИ, А ЧТО ЭТО ТУТ У НАС ? АХ ДА, ТОЧНО, Вложенные статические классы
    public static class Emerald extends PreciousStones {
        public Emerald(String name, ThingActions... thingActions) {
            super(name);
            addThingAction(thingActions);
        }
    }
    public static class Ruby extends PreciousStones{
        public Ruby(String name, ThingActions ... thingActions) {
            super(name);
            addThingAction(thingActions);
        }
    }
}
