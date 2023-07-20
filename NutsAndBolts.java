//Name: Amulya
//Period: 3B
import java.util.*;
public class NutsAndBolts
{
    public static void main(String[] args)
    {
       Scanner console= new Scanner(System.in);
       /*
        //1 
       double num1,num2;
       System.out.print("Value for num1: ");
       num1=console.nextDouble();
       System.out.println("Value for num2: ");
       num2=console.nextDouble();
       if(num1==num2)
        System.out.println("same");
       //2
       System.out.print("Total Bill: ");
       double totalBill;
       totalBill=console.nextDouble();
       if(totalBill>2000)
        System.out.println(totalBill-.85);
       else if (totalBill>100&&totalBill<200)
        System.out.println(totalBill-.90);
       //3
       System.out.print("Total Bill: ");
       totalBill=console.nextDouble();
       if(totalBill>2000)
        System.out.println(totalBill-.85);
       else if (totalBill>100&&totalBill<200)
        System.out.println(totalBill-.90);
       if(totalBill>2000)
        System.out.println(totalBill-.85);
       System.out.print("Do you have a coupon? Enter true or false >>> ");
       boolean coupon;
       coupon=console.nextBoolean();
       if(coupon)
        System.out.println("Total bill after discounts(if applicable)= "+totalBill+1.05);
       else
        System.out.println("Total bill after discounts(if applicable)= "+totalBill);
       //4
       System.out.println("You can catch a cold but never be able to throw it");
       //5
       int year;
       System.out.print("Year: ");
       year= console.nextInt();
       if(year%4==0 && year%100 !=0||year%400==0){System.out.println(year + "is a leap year");}
       */
       //Nuts and bolts app
       int nuts,bolts,washers;
       System.out.print("Nuts: ");
       nuts=console.nextInt();
       System.out.print("Bolts: ");
       bolts=console.nextInt();
       System.out.print("Washers: ");
       washers=console.nextInt();
       if (nuts<bolts){System.out.println("Warning! Check order: too few nuts");}
       else if (bolts<nuts){System.out.println("Warning! Check order: too few bolts");}
       else {System.out.println("You're bolts and nuts are good to go");}
       if(2*washers!=bolts){System.out.println("Warning! Check order: too few washers");}
       else {System.out.println("All good to go");}
       int total= (bolts*5)+(nuts*3)+(washers*1);
       System.out.println("Total cost (in cents): "+total);
    }
}
