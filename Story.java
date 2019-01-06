public class Story extends IslandManager {
    public static void main(String[] args) {
        IslandManager islandManager = new IslandManager();
        islandManager.Creation();//IT WORKS, IT WORKS! Создаем и размещаем штучки на острове
        islandManager.TellStory();//OMG WHAT IS GOING ON HERE Рассказывает о том, что творится на острове
        islandManager.Event();//Ивент должен проходить в конце всего рассказа, до этого мы описываем местность острова
        IslandManager islandManager1 = new IslandManager(){
         public void displayGreetings(){//анонимный класс
             System.out.println("The end");
         }
        };
        islandManager1.displayGreetings();
    }
}
