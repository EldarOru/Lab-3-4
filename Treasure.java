public class Treasure extends Thing {
    public Treasure(String name, ThingActions... thingActions) {
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
