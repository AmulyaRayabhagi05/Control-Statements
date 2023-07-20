import java.util.*;
class Main {
//2
  public static boolean isPositive(int a){    
    if(a>0){
      return true;
    }
    else{
      return false;
    }
  }
  //3
  public static boolean isOdd(int a){
    if((a%2)!=0){
      return true; 
    }
    else{
      return false;
    }
  }
//4
public static int getMax(int a, int b){
  return Math.max(a,b);
}
//6
public static int rollDice(){
 Random rand = new Random(); 
 return random.nextInt(7);
}

//7
public static int rollDice(int numFaces){
  Random rand = new Random(); 
  return random.nextInt(numFaces); 
}
//8
public static String capitalizeFirst(String name){
  return name.substring(0, 1).toUpperCase();
}
//9
public static double circleArea(double radius){
  return Math.PI*Math.pow(radius,2);
}
//10
public static boolean isMultiple(int a, int b){
  if (b % a == 0) {
    return true; 
  }
  else{
    return false; 
  }  
}
//12
public static String convertTime(double time, boolean isMinutes){
  if(isMinutes==true){
   return time + "minutes is" + time*60 + "second";
  }
  else{
   return time + "secounds" + time/60 + "second";
  }
}
//13
public static void printDiagonal(String s){
  System.out.print("h\n\te\n\t\tl\n\t\t\tl\n\t\t\t\to");
}

// Approximation PI
public static doube approxiationPi(double iterations){
  iterations=0.0;
  int s=1;
  int n= 10000;
  for(int i=0; i<n; i=i+2){
    iterations += s/i;
    s=-s;
    }
    return iterations*4;
}
  public static void main(String[] args) {
    System.out.println(" Question 5: 1= Atomic Number of Hydrogen ");
    System.out.println(" Question 11: 4= Years in one Presidential Term ");
  }
}