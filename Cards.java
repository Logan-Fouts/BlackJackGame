package BlackJackGame;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Cards {
    ArrayList<Integer> Cards = new ArrayList<Integer>();
    static int max = 11;
    static int min = 1; 
    int j = 0, i = 0;
        public void main() {
             genCards();
             getCurrCard(i);
        }
        
        public ArrayList<Integer> genCards() {
            int randomNum;
            for(int i = 0; i < 20; i++) {   //Got This Random Num Generator From https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
                randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
                Cards.add(randomNum);            
            }
            return Cards;
        }

        public int getCurrCard(int i) {
            return Cards.get(i);
        }



       
}


