package BlackJackGame;
import java.util.ArrayList;
import java.util.Scanner;


public class Player {
    Scanner scanner = new Scanner(System.in);
    String name;
    Cards playerCards = new Cards();
    ArrayList<Integer> cards = new ArrayList<Integer>();
    int j;
    
    public void main(String[] args) {
        setName();
        cards = generatePlayerCards();
        getCards(j);
    }
    
    public void setName() {
        System.out.print("\n\nEnter Your Name: ");
        name = scanner.nextLine();
    }

    public String getName() {
        return name;
    }

     public int getCards(int j) {
        return playerCards.getCurrCard(j);
    } 

    public ArrayList<Integer> generatePlayerCards(){
        return playerCards.genCards();
    }
}
