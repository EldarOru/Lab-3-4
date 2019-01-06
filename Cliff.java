public class Cliff extends Thing {
    public Cliff(String name, ThingActions... thingActions) {
        super(name);
        addThingAction(thingActions);
    }

    @Override
    public void action() {

    }

    @Override
    public void getDescribe() {

    }
}
