import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PackingCubes {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("PackingCube.txt"));
        int numOfLines = input.nextInt();
        for (int i = 0; i < numOfLines; i++) {
            int num = input.nextInt() / 3;
            System.out.println((int) Math.pow(num, 3));
        }
        input.close();
    }

}
