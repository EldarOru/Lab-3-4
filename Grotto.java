public class Grotto extends Thing {
    public Grotto(String name, ThingActions... thingActions) {
        super(name);
        addThingAction(thingActions);
    }

    @Override
    public void action() {

    }

    @Override
    public void getDescribe() {
        System.out.print(" небольшой");
    }
}
