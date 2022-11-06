import java.util.ArrayList;
import java.util.Date;

public class Main extends Input{

    public static void main(String[] args) {
        int gameRunning = -1;
        int totalFish = 5;
        ArrayList<Integer> fishType = new ArrayList<Integer>();
        fishType.add(1);
        fishType.add(2);
        fishType.add(3);
        fishType.add(4);
        fishType.add(5);
        Input fishingGame = new Input();
        Input2 fishingGame2 = new Input2(totalFish-1);
        fishingGame2.destroy();

        while(gameRunning < 0) {
            int fishValue = (int) (totalFish * Math.random() + 1);
            Date date = new Date();
            long startTime = date.getTime();
            while (fishingGame.getTracker() < (fishValue + 2) * 3) {
                System.out.println(fishingGame.getTracker());
            }
            System.out.println(fishingGame.getTracker());
            if(!fishType.isEmpty()) {
                fishingGame2 = new Input2(fishType.get(fishValue - 1));
            }
            else{
                fishingGame2 = new Input2(-1);
            }
            fishingGame.destroy();
            Date date3 = new Date();
            long endTime = date3.getTime();
            long elapsed = endTime - startTime;
            //System.out.println("Time elapsed in milliseconds, " + (elapsed));
            if (elapsed < 6000) {
                if(!fishType.isEmpty()){
                    if (fishType.get(fishValue - 1) == 1) {
                        fishingGame2.setText("You caught a Leon Springs Pupfish! Native to Texas, it was believed to be extinct until it was rediscovered in the 1960s. It is considered endangered due to the loss of its native spring.");

                        //System.out.println("You caught a Leon Springs Pupfish! Native to Texas, it was believed to be extinct until it was rediscovered in the 1960s. It is considered endangered due to the loss of its native spring.");
                    } else if (fishType.get(fishValue - 1) == 2) {
                        fishingGame2.setText("You caught a Woundfin! Native to the Virgin River, its population has been declining due to habitat destruction and introduction of invasive species. It is considered endangered.");

                        //System.out.println("You caught a Woundfin! Native to the Virgin River, its population has been declining due to habitat destruction and introduction of invasive species. It is considered endangered.");
                    } else if (fishType.get(fishValue - 1) == 3) {
                        fishingGame2.setText("You caught an Ozark Cavefish! Native to the Ozark Highlands, it lives only in caves and lacks true eyes and pigmentation. It feeds on small crustaceans and salamander larvae. It is considered near threatened. ");

                        //System.out.println("You caught an Ozark Cavefish! Native to the Ozark Highlands, it lives only in caves and lacks true eyes and pigmentation. It feeds on small crustaceans and salamander larvae. It is considered near threatened.");
                    } else if (fishType.get(fishValue - 1) == 4) {
                        fishingGame2.setText("You caught a Bull Trout! Native to the northwestern United States, it is technically a char, not a trout. It is considered as a vulnerable species. ");

                        //System.out.println("You caught a Bull Trout! Native to the northwestern United States, it is technically a char, not a trout. It is considered as a vulnerable species.");
                    } else if (fishType.get(fishValue - 1) == 5) {
                        fishingGame2.setText("You caught a Gulf Sturgeon! Native to the Gulf of Mexico, they communicate with each other by leaping out of the water during the summer. Overfishing and dam construction has led it to be considered as endangered.");

                        //System.out.println("You caught a Gulf Sturgeon! Native to the Gulf of Mexico, they communicate with each other by leaping out of the water during the summer. Overfishing and dam construction has led it to be considered as endangered.");
                    }
                }
                else{
                    fishingGame2.setText("Congratulations! You just contributed to the extinction of freshwater fish. Nearly 1/3 of all freshwater fish are at risk due to overfishing and habitat destruction. Now, this river will have only destructive invasive species...");
                    gameRunning = 1;
                }
            } else {
                fishingGame2.setText("You were too slow...the fish got away...");
                //System.out.println("This fish got away...");
            }
            while(fishingGame2.getTracker()<2){
                System.out.println(fishingGame2.getTracker());
            }
            System.out.println(fishingGame2.getTracker());

            if(fishingGame2.getTracker()==101){
                gameRunning=1;
            }
            if(!fishType.isEmpty()) {
                if(elapsed < 6000) {
                    fishType.remove(fishValue - 1);
                    totalFish--;
                }
            }
            if(!(gameRunning==1)){
                fishingGame = new Input();
            }
            fishingGame2.destroy();
        }
    }
}