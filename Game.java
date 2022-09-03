package BlackJackGame;

import java.util.Scanner;

public class Game{

    public static void main(String[] args) {
        Scanner hitScanner = new Scanner(System.in);
        Player player = new Player();
        player.setName();
        Dealer dealer = new Dealer();
        playGame(dealer, player, hitScanner);
    }
    
    public static void playGame(Dealer dealer, Player player, Scanner hitScanner) {
        int i = 0, choice = 0, playerTotal = 0, dealerTotal = 0;;
        System.out.println("Enter a 1 for Hit or enter 0 for Stay");
        while(choice != -1) {
            System.out.println("Hit or Stay?");
            choice = hitScanner.nextInt();
            if (choice == 1) {
                //System.out.println("Your card has a value of: " + player.getCards(j));
            }

            i++;
        }
    }
}