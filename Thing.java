import java.util.ArrayList;

public abstract class Thing implements Action, ThingDescribe {
    protected ArrayList<Thing> ThingInThing = new ArrayList<Thing>();

    public ArrayList<ThingActions> ThingActionList= new ArrayList<ThingActions>();
    public String name;
    public Thing(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void AddThingInThing(Thing ... things) {
        for (Thing th : things) {
            ThingInThing.add(th);
        }
    }



    public void addThingAction(ThingActions ... thingActions){
        for(ThingActions thAc : thingActions){
            ThingActionList.add(thAc);
        }
    }



    public void doActions(){
        int index = 0;
        int count = ThingActionList.size();
        for (ThingAction thAction : ThingActionList){
            thAction.run();
            index += 1;
            if (index != count){
                System.out.print("и");
            }
        }
    }
}
