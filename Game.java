package BlackJackGame;
import java.util.Scanner;


public class Game{

    public static void main(String[] args) {
        Scanner hitScanner = new Scanner(System.in);

        Player player = new Player();
        player.setName();
        player.generatePlayerCards();

        Player dealer = new Player();
        dealer.setDealerName();
        dealer.generatePlayerCards();

        playGame(dealer, player, hitScanner);
    }
    
    public static void playGame(Player dealer, Player player, Scanner hitScanner) {
        int i = 3, choice = 1, dealerChoice = 1, d = 0;
        int playerTotal = player.getCards(0) + player.getCards(1) + player.getCards(2);
        int dealerTotal = dealer.getCards(0) + dealer.getCards(1) + dealer.getCards(2);


        System.out.println("\nThe Game Will Now Begin\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nEnter a 1 for Hit or enter 0 for Stay...\n\nYour First 3 Cards Are: " + player.getCards(0) + ", " + player.getCards(1) + ", " + player.getCards(2) + "\n~~~~\nYour Current Total is: " + playerTotal);

        while(choice != 0 && playerTotal < 22) {
            System.out.print("Hit or Stay?  ");
            choice = hitScanner.nextInt();
            if (choice == 1 && playerTotal < 22) {
                playerTotal = playerTotal + player.getCards(i);
                System.out.println("Your Drew A: " + player.getCards(i) + "\n \n" + player.getName() + " You Have Total Of: " + playerTotal);
            }
            i++;
        }

        if (playerTotal > 21) {
            System.out.println("You Busted, " + dealer.getName() + " Wins");
            System.exit(0);
        }

        while (dealerChoice != 0) {
            if (dealerTotal < 12) {
                dealerTotal = dealerTotal + dealer.getCards(d);
            } 
            dealerChoice = 0;
            System.out.println(dealer.getName() + " Has A Total Of: " + dealerTotal);
        }

        
        if (dealerTotal < 22 && dealerTotal > playerTotal) {
            System.out.println(dealer.getName() + " Won");
            System.exit(0);
        }
        else if (dealerTotal > 21) {
            System.out.println(dealer.getName() + " Busted, You Won!!");
            System.exit(0);
        }
        else {
            System.out.println(dealer.getName() + " Has A Total Of: " + dealerTotal + ", You Won!!");
            System.exit(0);
        }
    }
}