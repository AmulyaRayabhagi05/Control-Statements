import java.util.Scanner;

//Name: Amulya Prasad Rayabhagi
//School: Liberty High School
//Period: 3B
public class Hailstones {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //1
        int sum = 0;
        int num;
        while (true) {
            System.out.print("Enter an integer (or 0 to quit ): ");
            num = console.nextInt();
            sum += num;
            if (num == 0) {
                break;
            }
        }
        System.out.println("Sum of integers: " + sum);
        //2
        System.out.println("The age of Jo is 8 ");
        //3
        double drugPotency = 100;
        int month = 0;
        int potency;
        while (true) {
            System.out.println("Month: " + month + "\tPotency: " + drugPotency);
            month++;
            drugPotency *= .88;
            if (drugPotency < 50) {
                System.out.println("Month: " + month + "\tPotency: " + drugPotency);
                break;
            }
        }
        System.out.println("Discarded");
        //4
        int pin=2562;
        int numOfAttempts=0;
        while(true)
        {
            System.out.println("Please enter your pin(4 total digits, non-zero first digit)");
            int accessPin=console.nextInt();
            if(accessPin==pin)
            {
                System.out.println("Access granted");break;
            }
            else{ System.out.println("Access denied,try again");}
            numOfAttempts++;
            if(numOfAttempts==3)
            {
                System.out.println("You have exceeded the attempt limit.\nYour account has been blocked");
                break;

            }


        }
        //5
        int prevNumber=0;
        int fibanachiSum=1;

        System.out.println("Please enter the max value that you want your fibanachi sequence to run: ");
        int max=console.nextInt();
        System.out.print(prevNumber+" ");
        while(fibanachiSum<max)
        {
            System.out.print(fibanachiSum+" ");
            int temp =fibanachiSum;
            fibanachiSum+=prevNumber;
            prevNumber=temp;


        }
        System.out.println("\nPlease enter an integer from 1 to 1000: ");
        int n=console.nextInt();
        int hailStoneSeries=0;
        int numOfSteps =0;
        while(true)
        {
            System.out.println(n);
            numOfSteps++;
            if(n%2==0){
                n=(n/2);
            }
            else{
                n=3*n+1;
            }
            if (n==1){break;}
        }
        System.out.println(n);
        System.out.println("Series took "+numOfSteps+" steps to reach a value of 1");

    }
}
