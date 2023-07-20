// Name: Amulya Prasad Rayabhagi
// Period: 3B
import java.util.*;

public class Calculator
{
    public static void main(String[] args)
    {
       Scanner console= new Scanner(System.in);
       //1
       
       System.out.print("What interger value would like to put in the value for a?");
       int a= console.nextInt();
       if (a==9)
        {
            System.out.println("#1");
        }
       //2
       System.out.print("What integer value would like to put in the value for b?");
       int b= console.nextInt();
       if (b==9 || b>20)
        {
            System.out.println("#2");
        }
       //3
       System.out.print("What integer value would like to put in the value for c?");
       int c= console.nextInt();
       if (c==5 || c==6)
        {
            System.out.println("#3");
        }
       //4
       System.out.println();
       System.out.println("9 lives of a cat");
       System.out.println();
       //5
       System.out.print("What integer value would like to put in the value for d?");
       int d= console.nextInt();
       if (d!=4)
        {
            System.out.println("#5");
        }
        //6
       System.out.print("What  double value would like to put in the value for e?");
       double e= console.nextDouble();
       if (e< 10 && e>2 && e!=7.5)
        {
            System.out.println("#6");
        }
       //7
       System.out.print("What double value would like to put in the value for f?");
       double f= console.nextDouble();
       if (16<=f && f<=24)//20-4=16 and 20+4= 24 so the range would be 16<=f<=24
        {
            System.out.println("#7");
        }
       //8
       
       System.out.println("Welcome to Mystic Quest, assign stats to your character (max 15 points)");
       System.out.print("Enter strength (from 1 to 10) >>>");
       int strength= console.nextInt();
       System.out.print("Enter health (from 1 to 10) >>>");
       int health= console.nextInt();
       System.out.print("Enter magic (from 1 to 10) >>>");
       int magic= console.nextInt();
       if (strength+health+magic>15)
       {
          System.out.println("Point limit exceeded! Default values assigned");
         System.out.println("strength = " +  5 +","+ "health = "+ 5 +","+ "magic = " + 5 + ". Good luck!");
       }
       else
           {
            System.out.println("Strength = " + strength + ","+ "health = "+ health+","+"magic = " + magic+ ". Good luck!");
           }
       // 9
       System.out.println("It is match");
       System.out.println();
       //Calculator app
       System.out.println("1 - addition (+)");
       System.out.println("2 - subtraction (-)");
       System.out.println("3 - multiplication (*)");
       System.out.println("4 - division (/)");
       System.out.println("5 - modulus (%)");
       System.out.println();
       System.out.println("Enter the number of your desired operation from the menu above >>> ");
       int operation= console.nextInt();
       if (operation<1 || operation>5)
           {
            System.out.println("Sorry you have entered a wrong number from the menu" );
            System.exit(0);
           }
   
        
       System.out.println("Enter first number >>> ");
       int num1= console.nextInt();
       System.out.println("Enter secound number >>> ");
       int num2= console.nextInt();
      
       if (operation==1)
       {
           System.out.println(num1+ " + " + num2 + " = " + (num1 + num2) );
       }
       else if(operation==2)
       {
           System.out.println(num1+ " - " + num2 + " = " + (num1 - num2) );
       }
       else if(operation==3)
       {
           System.out.println(num1+ " * " + num2 + " = " + (num1 * num2) );
       }
       else if(operation==4)
       {
           System.out.println(num1+ " / " + num2 + " = " + (num1 / num2) );
       }
       else if(operation==5)
       {
           System.out.println(num1+ " % " + num2 + " = " + (num1 % num2) );
       }
       
       
       
       
       
       
            
        
        
        
        
    
}
}
