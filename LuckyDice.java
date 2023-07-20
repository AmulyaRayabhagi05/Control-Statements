//Name:Amulya
//Period:3b
//School:LHS
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner console= new Scanner(System.in);
    Random rng= new Random();
    // 1
    System.out.print("Type an integer: ");
    int factoringInteger= console.nextInt();
    System.out.print("Factors of "+factoringInteger+" >>> ");
    for(int i=1; i<=factoringInteger;i++)
    {
      if(factoringInteger%i==0)
        System.out.print(i+" ");
    }
    //2
    System.out.print("\nType an integer: ");
    int n= console.nextInt();
    int sum=0;
    for(int i=1; i<=n;i++)
    {
      if(i%3==1&&i%4==1&&i%5==1&&i%6==1)
        sum++;
    }
    System.out.println("There are "+sum+" cool numbers up to "+n);
    //3
    sum=0;
    int i=1;
     while(i<=n)
    {
      if(i%3==1&&i%4==1&&i%5==1&&i%6==1)
        sum++;
      i++;
    }
    System.out.println("There are "+sum+" cool numbers up to "+n);
    //4
    //5
    System.out.print("\nType an integer: ");
    int perfectNumber= console.nextInt();
    int sum=0;
    for(int i=1; i< perfectNumber; i++)
    {
      if(perfectNumber%i==0)
      {
        sum+=i;
      }                                     
    }
    if(sum==perfectNumber){System.out.println(perfectNumber+" is a perfect number");}
    else
      System.out.println(perfectNumber+" is not a perfect number");
      //6
    sum=0;
    int i=1;

    do
    {
      if(perfectNumber%i==0){
        sum+=i;
        }
      i++;
    }
    while(i<perfectNumber);
    if(sum==perfectNumber){System.out.println(perfectNumber+" is a perfect number");}
    else
      System.out.println(perfectNumber+" is not a perfect number")
    //Lucky Dice
    System.out.print("Number of faces on each die: ");
    int faces= console.nextInt();
    System.out.print("Number of simulations: ");
    int simulations= console.nextInt();
    int average =0;
    for(int i=1; i<=simulations;i++)
    {
      int total = 0;
      int count =0;
      while(total<=1000){
        int dice1= rng.nextInt(faces);
        int dice2= rng.nextInt(faces);    
        total+= dice1+dice2;
        count++;
      }
      average+=count;

     System.out.println("Simultaions : "+i+" number of rolls to reach 1000 >>> "+count);
    }

    System.out.println("Average no of rolls, for all simulation >>> "+average/simulations);

   
  }
}
