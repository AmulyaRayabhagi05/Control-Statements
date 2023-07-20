import java.util.Random;
import java.util.Scanner;

//Name: Amulya Prasad Rayabhagi
//School: Liberty High School
//Period: 3B
public class FullBlackjack {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int aces = 11;
        int faceCards = 10;
        System.out.println();
        System.out.println("*****************************");
        System.out.println("* Welcome to Amulya's Casino *");
        System.out.println("*****************************");
        Random rng = new Random();
        int dealerCardValue1 = rng.nextInt(10) + 2;
        int dealerCardValue2 = rng.nextInt(10) + 2;
        int dealerTotal = 0;
        int userTotal = 0;
        int userCardValue1 = rng.nextInt(10) + 2;
        int userCardValue2 = rng.nextInt(10) + 2;
        System.out.println();
        System.out.println("The dealer has her cards");
        System.out.println("Your first card is: " + userCardValue1);
        System.out.println("Your second card is: " + userCardValue2);
        dealerTotal = dealerCardValue1 + dealerCardValue2;
        userTotal = userCardValue1 + userCardValue2;
        System.out.println("Your total is: " + userTotal);
        while (true) {
            System.out.print("Enter 1 to hit, 2 to stay: ");
            int choice = console.nextInt();
            if (choice == 1) {
                int nextUserCard = rng.nextInt(10) + 2;
                userTotal += nextUserCard;
                System.out.println("Your next card: "+ nextUserCard);
                System.out.println("Your current total: "+ userTotal);
            } else if (choice == 2) {
                int nextDealerCard = rng.nextInt(10) + 2;
                dealerTotal += nextDealerCard;
            } else {
                System.out.println("Sorry not allowed. Try again later!");
                break;
            }
            System.out.println("\nYour total: "+userTotal+"\nDealer's total: "+dealerTotal);
            if (userTotal >= 21) {
                System.out.println("You bust!");
                break;
            } else if (userTotal > dealerTotal || dealerTotal >= 21) {
                System.out.println("You win!");
                break;
            }
        }
        System.out.println("Answer for the question \"What fastens two people yet touches only one?\" is a wedding ring");
    }
}
