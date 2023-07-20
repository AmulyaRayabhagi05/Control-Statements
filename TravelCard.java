import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Name: Amulya Prasad Rayabhagi
//Class: 3B
//School: LHS(Liberty High School)
public class TravelCard {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("ticket2.txt"));
        int D = input.nextInt();
        int sum = 0;
        for (int i = 0; i < D; i++) {
            int t = input.nextInt();
            for (int j = 0; j < t; j++) {
                sum += input.nextInt();
            }
        }
        double Pounds = sum / 100;

        if (Pounds >= 35) {
            System.out.println("Buy the TravelCard");
            int Pences = sum - 3500;
            System.out.println("Expected Saving: " + Pences / 100 + " Pounds " + Pences % 100 + " Pence");
        } else {
            System.out.println("Buy Single-Use Tickets ");
            int Pences = 3500 - sum;
            System.out.println("Expected Savings: " + Pences / 100 + " Pounds " + Pences % 100 + " Pence");
        }

    }
}
