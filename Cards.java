package BlackJackGame;

import java.util.ArrayList;
import java.util.Random;

public class Cards {
    static ArrayList<Integer> Cards = new ArrayList<Integer>();
    static int max = 20;
    static int min = 20; 

        public void main() {
             genCards();
        }
        
        public void genCards() {
            for(int i = 0; i < 20; i++) {   //Got This Random Num Generator From https://www.baeldung.com/java-generating-random-numbers-in-range
             /*     Random random = new Random();
                Cards.add(random.nextInt(max - min) + min);           
                System.out.println(Cards.get(i)); */
            }
        }
}


