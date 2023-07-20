//Name: Amulya
//Period: 3B
import java.util.*;
public class BasicBlackjack
{
   public static void main (String[] args)
   {
        Scanner console = new Scanner(System.in);
        //2
        System.out.println("How many apples do you have? ");
        int apples= console.nextInt();
        if (apples>=0)
        {
         System.out.println("Hello world");
        }
        //3 and 4
        if (apples%2==0)//3
        {
            System.out.println( "Omg it's even!");
        }
        else
        {
            System.out.println("Hmm that's odd!");
        }
        //5
        int votingAge=18;
        System.out.println("What is your actualy age?");
        int actualAge= console.nextInt();
        if (actualAge>=votingAge)
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("You can't vote");
        }
        //6
        int angle1;
        int angle2;
        int angle3;
        System.out.println("What would you like to put for your angle1?");
        angle1= console.nextInt();
        System.out.println("What would you like to put for your angle2?");
        angle2= console.nextInt();
        System.out.println("What would you like to put for your angle3?");
        angle3= console.nextInt();
        if (angle1+angle2+ angle3==180)
        {
            if(angle1==60 && angle2==60 && angle1==60)
            {
                System.out.println("equaliteral");
            }
            else if (angle1==angle2 || angle2==angle3|| angle1==angle3)
            {
                System.out.println("isoceles");
            }
            else 
            {
                System.out.println("Scalene");
            }
        }
        else
        {
            System.out.println("error");
        }
        //7
        //8
        double grade;
        System.out.println("What is your grade?");
        grade= console.nextDouble();
        if (grade>=90 && grade<=100)
        {
            System.out.println("A");
        }
        else if (grade>=80 && grade<=89)
        {
            System.out.println("B");
        }
        else if (grade>=70 && grade<=79)
        {
            System.out.println("C");
        }
        else if (grade>=60 && grade<=69)
        {
            System.out.println("D");
        }
        else if ( grade<=59)
        {
            System.out.println("F");
        }
        //9
        int player1;
        int player2;
        System.out.println("Rock-1\nPaper-2\nScissors-3\n");
        System.out.println("Choose a number (Player1):");
        player1=console.nextInt();
        System.out.println("Choose a number (Player2):");
        player2=console.nextInt();
        
        if (player1==player2) 
           {
               System.out.println("Tie!");
           }
           else if (player1==1 && player2==3)
           {
               System.out.println("Rock beats scissors! Player 1 wins");
           }
           else if (player1==3 && player2==1)
           {
            System.out.println("Rock beats scissors! Player 2 wins");
           }
           else if (player1==2 && player2==3)
           {
            System.out.println("Scissors cuts paper! Player 2 wins");
           }
           else if (player1==3 && player2==2)
           {
            System.out.println("Scissors cuts paper! Player 1 wins");
           }
           else if (player1==1 && player2==2)
           {
            System.out.println("Paper covers rock! Player 2 wins");
           }
           else if(player1==2 && player2==1)
           {
              System.out.println("Paper covers rock! Player 1 wins"); 
           }
      
        //Basic Blackjack app
        int hand1;
        int hand2;
        System.out.println("Player1, enter hand value: ");
        hand1= console.nextInt();
        System.out.println("Player2, enter hand value: ");
        hand2= console.nextInt();
        if (hand1==hand2 && hand1<=21 && hand2<=21)
        {
            System.out.println("tie!");
        }
        else if (hand1>21 && hand2>21)
        {
            System.out.println("Both players bust");
        }
        else if (hand1>hand2)
        {
            System.out.println("Player 1 wins!");
        }
        else if (hand2>hand1)
        {
            System.out.println("Player 2 wins!");
        }
        
        
        
        
        
}
}