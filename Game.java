package BlackJackGame;
import java.util.Scanner;


public class Game{

    public static void main(String[] args) {
        Scanner hitScanner = new Scanner(System.in);

        Player player = new Player();
        player.setName();
        player.generatePlayerCards();

        Dealer dealer = new Dealer();
        dealer.generateDealerCards();

        playGame(dealer, player, hitScanner);
    }
    
    public static void playGame(Dealer dealer, Player player, Scanner hitScanner) {
        int i = 0, choice = 1, playerTotal = 0, dealerTotal = 0;;
        System.out.println("\nThe Game Will Now Begin\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nEnter a 1 for Hit or enter 0 for Stay");
        while(choice != 0) {
            
            System.out.print("Hit or Stay?  ");
            choice = hitScanner.nextInt();
            if (choice == 1) {
                playerTotal = playerTotal + player.getCards(i);
                System.out.println("Your Drew A: " + player.getCards(i) + "\n \n" + player.getName() + " You Have Total Of: " + playerTotal);
            }


            i++;
        }
    }
}