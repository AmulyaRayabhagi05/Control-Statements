//Name:
//Period:
import java.util.*;
class Main {
  public static void main(String[] args) {
Scanner console= new Scanner(System.in);
int[] nums = { 2, 2, 4, 5, 8, 6, 2, 3, 5, 5, 5, 9, 0, 9, 6};
//2 
int sum = 0;   
   for (int i = 0; i < nums.length; i++) 
   { sum = sum + nums[i];}
   System.out.println("Sum of all the elements of an array: " + sum); 
//3 
boolean foundOdd = false;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i]%2!=0) {
        foundOdd = true;
        break;
      }
    }
    if (foundOdd)
      System.out.println("odd");
    else
      System.out.println("not odd");
//4
 boolean foundZero = false;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        foundZero = true;
        break;
      }
    }
    if (foundZero)
      System.out.println("Found a zero");
    else
      System.out.println("no zeros");
//6
  int numOfSix=0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i]==6) {
        numOfSix++;
      if(numOfSix==2){
        break;
      }   
      }
    }
    if (numOfSix>=2)
      System.out.println("Two sixes");
    else
      System.out.println("less than two sixes");
//7
    boolean twoThirds=false;
    for (int i = 0; i < nums.length-1; i++) {
      if (nums[i]==2&nums[i+1]==3){
        twoThirds=true;
        break;
      }
      }
    if (twoThirds==true)
      System.out.println("Found 2/3");
    else
      System.out.println("no 2/3");
  //8
     boolean inOrder=false;
    for (int i = 0; i < nums.length-1; i++) {
      if (nums[i]<=nums[i+1]){
        inOrder=true;
        break;
      }
      }
    if (inOrder==true)
      System.out.println("In order");
    else
      System.out.println("not in order");
  //9
  boolean foundEven = false;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i]%2==0) {
        foundOdd = true;
        break;
      }
    }
    if (foundEven)
      System.out.println("even");
    else
      System.out.println("unevens");
//10
  boolean threeInOrder=false;
    for (int i = 0; i < nums.length-1; i++) {
      if (nums[i]==nums[i+1]&nums[i+1]==nums[i+2]&nums[i]==nums[i+2]){
        threeInOrder=true;
        break;
      }
      }
    if (threeInOrder==true)
      System.out.println("Three in a row");
    else
      System.out.println("No three in a row"); 
//11
 
    int min=nums[0];
    int max=nums[0];
    for(int i=0; i<nums.length; i++ ) {
        min= Math.min(min,nums[i]);
        max= Math.max(max,nums[i]);
     }

         System.out.println(max-min);
//12
  int pairs=0;
    for (int i = 0; i < nums.length-1; i++) {
      if (nums[i]==nums[i+1]){
        pairs++;

      }
      }
      System.out.println("Number of pairs in \"nums\" array: "+pairs);
//Binary conversion
  System.out.print("Enter the length of the binary: ");    
  int length=console.nextInt();   
  int[] array = new int[length];  
  System.out.print("Enter the binary numbers: ");
  for(int i=0; i<length; i++)  
  {   
  array[i]=console.nextInt();  
  }
 int number=0;
 for(int i=0; i<length; i++) {
   number+=Math.pow(2,length-i-1)*array[i];
 }
 System.out.println("Binary number: "+ number+"decimals");
}
}
