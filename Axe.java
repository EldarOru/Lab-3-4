public class Axe extends Thing {
    public Axe(String name, ThingActions... thingActions) {
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
