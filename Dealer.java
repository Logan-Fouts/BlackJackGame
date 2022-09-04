package BlackJackGame;

import java.util.ArrayList;

public class Dealer {
    Cards dealerCards = new Cards();
    ArrayList<Integer> dCards = new ArrayList<Integer>();
    
    public void main(String[] args) {
        dealerCards.genCards();
    }
}
