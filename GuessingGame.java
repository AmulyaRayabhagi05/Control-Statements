     
    //Name: Amulya
    //Period: 3B
    import java.util.*;
    public class GG
    {
        
        public static void main(String[] args)
       {
           Scanner console= new Scanner(System.in);
           //1
           
           System.out.println("Enter an interger: ");
           int n= console.nextInt();
           int z=1;
           while(z<=n){System.out.print(z+ " ");z++;}
            //2
            
           System.out.println("Enter an integer: ");
           n= console.nextInt();
           int i=1;
           int sum = 0;
           while(i<= n){sum+=i;i++;}
           System.out.println("sum is " + sum);
           //3
           System.out.println("Enter an integer: ");
           n= console.nextInt();
           i=1;
           sum = 0;
           while(i<= n)
            {
                if (i%2==0){sum+=i;}
                i++;
            }
           System.out.println("sum is " + sum);
           //4
           System.out.println("A person without having all fingers in one hand is described as a normal person since us as humans have 2 hands to hold all our 10 fingers ");
           //5
           System.out.println("Enter an integer: ");
           n= console.nextInt();
           i=1;
           sum = 0;
           while(i<= n)
            {
                if (i%7==0){sum+=i;}
                i++;
            }
           System.out.println("sum is " + sum);
           
           //Guessing Game
           System.out.println("Let's play a guessing game!");
           System.out.println("The number to guess will be from 1 to 1000");
           System.out.println("You have 7 attemps to guess the number correctly");
       
           int guesses=7;//the number of guesses a player does before he or she looses
           Random rng= new Random();
           int number= rng.nextInt(1000) + 1;
           
           List previousGuesses = new ArrayList();
           while(true){
                   
               System.out.print("Enter your guess (only a whole number (from 1 to 1000): ");
               int guess= console.nextInt();
               if (guess>1000 || guess<1){
                   System.out.println("You have been DISQUALIFIED since the instructions haven't been followed");
                   break;
               }
           
               if(previousGuesses.contains(guess)){
                   System.out.println("You have already guessed it!");
               }else{
                    previousGuesses.add(guess);
                    if(guess<number){
                        System.out.println("Too low");
                    }else if(guess>number){
                        System.out.println("Too high");
                    }else if (guess==number){
                        System.out.println("Well done!\nCongratugulations you have guessed the right number.\nSee you next time!");
                        break;
                    }
                    guesses--;
                    if (guesses==0) {System.out.println("Sorry, you snooze you looze. The number was "+number);break;}
               }
                System.out.println("Guesses remaining: "+guesses);
           }
       }
    }     
