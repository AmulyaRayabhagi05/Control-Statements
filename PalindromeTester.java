import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Name: Amulya Prasad Rayabhagi
//Class: 3B
//School: LHS (Liberty High School)
public class PalindromeTester {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.print("Enter a string to be tested: ");
        String tested=console.nextLine();
        String temp = tested.replace(" ","");
        boolean isPalindrome= true;
        for(int i=0;i<temp.length(); i++)
        {
            char checking= temp.charAt(i);

            if(checking!=temp.charAt(temp.length()-1-i))
            {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
        {
            System.out.println("It's a palindrome");
        }
        else
            System.out.println("It's not a palindrome");

    }
}
