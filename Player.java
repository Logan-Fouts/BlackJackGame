package BlackJackGame;
import java.util.ArrayList;
import java.util.Scanner;


public class Player {
    Scanner scanner = new Scanner(System.in);
    String name;
    //ArrayList<Integer> cards = new ArrayList<Integer>();
    Cards playerCards = new Cards();
    int j;
    //int currentCard = getCards(j);
    public void main(String[] args) {
        setName();
        playerCards.genCards();
    }
    
    public void setName() {
        System.out.print("Enter Your Name: ");
        name = scanner.nextLine();
    }

   /*  public int getCards(int j) {
        int currentCard = playerCards.getCards(j);
        return currentCard;
    } */
}
