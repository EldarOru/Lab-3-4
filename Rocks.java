public class Rocks extends Thing {
    public Rocks(String name, ThingActions ... thingActions){
        super(name);
        addThingAction(thingActions);
    }

    @Override
    public void addThingAction(ThingActions... thingActions) {
        super.addThingAction(thingActions);
    }

    @Override
    public void action() {
        System.out.println(" взмывали");
    }

    @Override
    public void getDescribe() {
        System.out.print(" первозднанные");
    }
}
