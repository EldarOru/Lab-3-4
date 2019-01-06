public class IslandManager {
    Island island = new Island("Мадагаскар");
    Island island_north = new Island("Северная часть острова");
    Island island_south = new Island("Южная часть острова");
    Island island_east = new Island("Восточная часть острова");
    Island island_west = new Island("Западная часть острова");
    Mother_Mumi mother_mumi = new Mother_Mumi("Муми Мама", new Boil("кофе"), new Search("банку с маслом"));
    Sniff sniff = new Sniff("Снифф", new Dig ("песок"));
    Snusmumrik snusmumrik = new Snusmumrik("Снусмурик", new Swim("море"), new See("золотое небо"));
    public void displayGreetings(){
        System.out.println("Приветствую");
    }
    public void Creation() {
        island.AddInnerLocation(island_north, island_south, island_east, island_west);
        island_east.AddInnerThing(new Rocks("Скалы", new Raise("море")));
        island_south.AddInnerThing(new Area("Площадка", new Were("здесь")));//А программа то, расшираемая
        island_north.AddInnerThing(new Clefts("Расщелины" , new Were("тут")));
        island_south.AddInnerTrolls(sniff);//добавляй предметов на остров, сколько хочешь, и действия к ним тоже
        island_east.AddInnerTrolls(mother_mumi,snusmumrik);
        island_west.AddInnerThing(new Surf("Прибой", new Hit(DegreeOfHit.NORMAL.title)));

    }
    public void TellStory(){//а потом мы просто расскажем обо всём, что ты наделал на острова
        island_east.DescribeTrolls();//повествует о нелегком быте муми троллей
        island.DescribeLocations();// Проходит по ArrayList InnerLocation и рассказывает о каждой локации
        mother_mumi.take(new Axe("топор"));//убери
    }//блин хочу сдать лабу :(
//сделай потом дескрайб у предметов нормальный, плез
    public void Event(){
        class Ship extends Thing{ //локальный класс, потому что надо по заданию
            @Override
            public void getDescribe() { }
            @Override
            public void action() { }
            public Ship(String name, ThingActions ... thingActions){
                super(name);
                addThingAction(thingActions);
            }
        }//не хочу долг по программированию =(
        Ship ship = new Ship("Корабль");
        island_north.AddInnerThing(ship);
        System.out.println(ship.name + " потерпел крушение в " + island_north.getName());
        island_east.GoTo(island_north,mother_mumi, snusmumrik);
        island_south.GoTo(island_north,sniff);
        int luck = (int)(Math.random()*10);
        if (luck>5){
            Treasure treasure = new Treasure("сокровища");
            island_north.AddInnerThing(treasure);
            for (Trolls trr : island_north.InnerTrolls){
                System.out.print(trr.TrollName + ", ");
            }
            System.out.println("нашли " + treasure.name + "!");
            System.out.print("Теперь там было ");
            for (Thing thing : island_north.InnerThing){
                System.out.print(thing.getName() + ",");
            }
            System.out.println();
            mother_mumi.take(treasure);
            try{
                mother_mumi.openChest(treasure);
            }
            catch (CheckException e){
                System.out.println(e.getMessage());
            }
        }
        if (luck<=5){
            System.out.println(ship.name + " оказался пуст");
        }

    }

}