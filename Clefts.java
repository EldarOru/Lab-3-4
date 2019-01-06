public class Clefts extends Thing {
    public Clefts(String name, ThingActions ... thingActions) {
        super(name);
        addThingAction(thingActions);
    }
    @Override
    public void addThingAction(ThingActions... thingActions) {
        super.addThingAction(thingActions);
    }

    @Override
    public void action() {

    }

    @Override
    public void getDescribe() {
        System.out.print(" таинсвенные темные");
    }
}
