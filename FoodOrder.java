import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Name: Amulya Prasad Rayabhagi
//School: Liberty High School
//Period: 3B

//Name of restaurant: Frisco Student Cuisine
//Tofu stir fry: 12.75
//Black Bean Burrito: 6.00
//Veggie quesadilla: 7.45

public class FoodOrder {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputFoodOrder = new Scanner(new File("Order.txt"));


        double orderTotal = 0.0;
        int quantity1 = 0;
        int quantity2 = 0;
        int quantity3 = 0;
        String food1 = "Tofu stir fry";
        String food2 = "Black Bean Burrito";
        String food3 = "Veggie quesadilla";
        double rate1 = 12.75;
        double rate2 = 6.00;
        double rate3 = 7.45;

        while (inputFoodOrder.hasNextLine()) {
            String food = inputFoodOrder.nextLine();

            if (food.equals("Tofu stir fry")) {
                quantity1++;
            } else if (food.equals("Black Bean Burrito")) {
                quantity2++;
            } else if (food.equals("Veggie quesadilla")) {
                quantity3++;
            }
        }
        System.out.println("Frisco Student Cuisine");
        System.out.printf("-------------Your Order------------%n");
        System.out.printf("%2d %-25s %.2f %n", quantity1, food1, quantity1 * rate1);
        orderTotal += quantity1 * rate1;
        System.out.printf("%2d %-25s %.2f %n", quantity2, food2, quantity2 * rate2);
        orderTotal += quantity2 * rate2;
        System.out.printf("%2d %-25s %.2f %n", quantity3, food3, quantity3 * rate3);
        orderTotal += quantity3 * rate3;
        System.out.printf("-----------------------------------%n");
        System.out.printf("%-28.7s %.2f", "Total:", orderTotal);
    }
}
