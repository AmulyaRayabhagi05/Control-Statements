//Name: Amulya 
//Period: 3B
import java.util.*;
public class Seasons
{
    public static void main(String[] args)
    {
        Scanner console= new Scanner(System.in);
        int leftPressure, rightPressure;
        System.out.print("LeftPressure: ");
        leftPressure= console.nextInt();
        System.out.print("RightPressure: ");
        rightPressure= console.nextInt();
        //1
        
        if(leftPressure<36 || rightPressure<36)
                System.out.println("Warning! uneven tire pressure");
        //2
        System.out.print("LeftPressure: ");
        leftPressure= console.nextInt();
        System.out.print("RightPressure: ");
        rightPressure= console.nextInt();
        if (leftPressure-rightPressure>=4)
                System.out.println("Warning! uneven tire pressure");
        //3
        System.out.println("the word 'ton' is heavy spelt forwards and spells 'not' backwards");
        //4
        int num;
        System.out.print("Please choose a number: ");
        num= console.nextInt();
        if(num%10<5)
        {
            System.out.println(num-(num%10));
        }
        else if(num%10>=5)
        {
            System.out.println(num-(num%10)+10);
        }
        
        // Seasons app
        int month,day;
        System.out.print("Month: ");
        month= console.nextInt();
       if(month<=12 && month>=1)
       {
           System.out.print("Day: ");
           day= console.nextInt();
           if( day>=1 && day<=31)
           {
                if(month==12 && day>=16 || month==3 && day<=15 ||month==1 || month==2)
               {
                  System.out.println("Winter");
               }
                else if(month==3 && day>=16 || month==6 && day<=15 || month==4|| month==5)
               {
                  System.out.println("Spring");
               }
                else if(month==6 && day>=16 || month==9 && day<=15 || month==7||month==8)
               {
                  System.out.println("Summer");
               }
               else if(month==9 && day>=16 || month==12 && day<=15 || month==10||month==11)
               {
                  System.out.println("Fall");
               }
            }
            else{System.out.println("Please type values of days between 1 and 31");}
       }
       else{System.out.println("Please type values of months between 1 and 12");}
    }
}
    
