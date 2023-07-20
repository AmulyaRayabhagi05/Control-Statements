import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputSimon1 = new Scanner(new File("Simon1.txt"));
        int numberOfLines1 = inputSimon1.nextInt();

        Scanner inputSimon2 = new Scanner(new File("Simon2.txt"));
        int numberOfLines2 = inputSimon2.nextInt();

        Scanner inputSimon3 = new Scanner(new File("Simon3.txt"));
        int numberOfLines3 = inputSimon3.nextInt();
        //Loops:

        for (int i = 0; i <= numberOfLines1; i++) {
            String F = inputSimon1.nextLine();
            if (F.startsWith("Simon says"))
                System.out.println(F.substring(10));
        }

        for (int i = 0; i <= numberOfLines2; i++) {
            String F = inputSimon2.nextLine();
            if (F.startsWith("Simon says"))
                System.out.println(F.substring(10));
        }
        for (int i = 0; i <= numberOfLines3; i++) {
            String F = inputSimon3.nextLine();
            if (F.startsWith("Simon says"))
                System.out.println(F.substring(10));
        }

    }
}
