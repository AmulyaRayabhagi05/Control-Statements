//Name: Amulya
//Period: 3B
import java.util.*;
public class BottlesonTheWall
{
       public static void main(String[] args)
    {
       Scanner console= new Scanner(System.in);
       //2
       int i=1;
       while(i<10){System.out.print(i);i++;}
       System.out.print("\n\n");
       //3
       int r=1;
       while(r<10){System.out.print(r+ " ");r++;}
       System.out.print("\n\n");
       //4
       int c=1;
       while(c<21){System.out.print(c+ " ");c+=2;}
       System.out.print("\n\n");
       //5 
       int a=5;
       while(a<55){System.out.print(a+ " ");a+=5;}
       System.out.print("\n\n");
       //6
       int d=10;
       while(d>0){System.out.print(d+ " ");d--;}
       System.out.print("\n\n");
       //7
       System.out.println("Answer to the riddle: The man had the hiccups and wanted a glass of water to help get rid of them. The bartender could hear the hiccups when the man spoke, so he brought the gun out to scare the hiccups away. It worked and the man thanked him and left, no longer needing the glass of water. ");
       //8
       int b= -4;
       while (b>-41){System.out.print(b+ " ");b+=-4;}
       System.out.print("\n\n");
       //9
       int m=1;
       while(m<257){System.out.print(m+ " ");m*=2;}
       System.out.print("\n\n");
       //10
       int u=1000;
       while(u>2){System.out.print(u+ " "); u/=2;}
       System.out.print("\n\n");
       
       //11
       
       int z=1;
       while(z<9)
       {
           System.out.print(z+ " "+z*-1+ " ");
           z++;
       }
       System.out.print("\n\n");
       //Bottles on the wall app
       System.out.println("Age: ");
       int age= console.nextInt();
       if (age>21)
       {
           System.out.println("Enter 1(for coke) or 2(for beer): ");
           int choice= console.nextInt(); 
           if (choice==1)
           {
            int l=99;
            while(l>1){System.out.print(l+ " bottles of Coke on the wall\n"+ l + " bottles of Coke\nTake one down, pass it around," ); l--; System.out.print(l+" bottles of Coke on the wall!\n\n");}
            System.out.println("1 bottle of Coke on the wall\n1 bottle of Coke\nTake one down, pass it around, zero more bottles of Coke on the wall\n\n");
           }
           else if(choice==2)
           {
            int g=99; 
            while(g>1){System.out.print(g+  " bottles of Beer on the wall\n"+ g + " bottles of Beer\nTake one down, pass it around," ); g--; System.out.print(g+" bottles of Beer on the wall!\n\n");}
            System.out.println("1 bottle of Beer on the wall\n1 bottle of Beer\nTake one down, pass it around, zero more bottles of Beer on the wall\n\n");
           }
           else{System.out.println("An error has occured please try again later");}
       }
       else
       {
           System.out.println("Enter 1(for coke) or 2(none): ");
           int choice= console.nextInt();
           if(choice==1)
           {
                int l=99;
            while(l>1){System.out.print(l+ " bottles of Coke on the wall\n"+ l + " bottles of Coke\nTake one down, pass it around," ); l--; System.out.print(l+" bottles of Coke on the wall!\n\n");}
            System.out.println("1 bottle of Coke on the wall\n1 bottle of Coke\nTake one down, pass it around, zero more bottles of Coke on the wall\n\n");
           }
           else if(choice==2)
           {System.out.println("Good choice!\nHave a nice day!");}
          else{System.out.println("An error has occured please try again later");}
       }
    }
}
