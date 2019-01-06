public class Area extends Thing {
    public Area(String name, ThingActions ... thingActions) {
        super(name);
        addThingAction(thingActions);
        }
private Seashells seashells = new Seashells();//Вложенные внутренние классы, просто потому что надо
    @Override
    public void action() {

    }

    @Override
    public void getDescribe() {
        System.out.print(" песчаная");
    }
    public class Seashells{

    }
}

