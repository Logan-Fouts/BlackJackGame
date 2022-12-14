package BlackJackGame;
import java.util.ArrayList;
import java.util.Scanner;


public class Player {
    Scanner scanner = new Scanner(System.in);                     //Creates Card Object and an ArrayList<Integer>
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

    public void setDealerName() {
        System.out.print("Enter A Name For The Dealer: ");
        name = scanner.nextLine();  
    }

    public String getName() {
        return name;
    }


     public int getCards(int j) {
        return playerCards.getCurrCard(j);
    } 

    public ArrayList<Integer> generatePlayerCards(){           //Generates Players Deck of Cards
        return playerCards.genCards();
    }
}
