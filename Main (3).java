
//Name: Amulya Prasad Rayabhagi
//Period: 3B
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner console= new Scanner(System.in);
    String[] s = {"Hello", "Goodbye", "Computer", "Science", "Um", "Do", "What", "Now"};
    int[] a = {5, 34, 3, -6, 7, 81, 1, 7, 5, 2, 2,  53, 4, 5, 62, 7};
    int[] b = {1, 3, 4, 90, -4, 60, 12, 13, 4, -4, -1, 2, 4, 4, 9, 8};

    //2
    int times=0;
    for(int i=0; i<a.length;i++){
       if(Math.abs(a[i]-b[i])<=2){
         times++;
       }
    }
    System.out.println("The number of times elements at the same index in arrays \'a\'and \'b\' differ by 2 or less: " + times);
    //3
     boolean twoTwos=false;
     boolean twoFours=false;
    for (int i = 0; i < a.length-1; i++) {
      if (a[i]==2&&a[i+1]==2){
        twoTwos=true;
        
      }
      if(a[i]==4&&a[i+1]==4){
        twoFours=true;
        
      }
      }
     if(twoFours&&twoTwos){
        System.out.println("not two/fours");}
     else if(twoFours||twoTwos){
        System.out.println("two/fours");}
     //4 
     int[] c = new int[a.length];   
      for (int i=0;i<a.length;i++) { 
        c[i]=a[a.length-i-1];
         }
       for (int element: c) {
            System.out.print(element+ " ");
        }  
    //5
    int min=a[0];
    int max=a[0];
    for(int i=0; i<a.length; i++ ) {
        min= Math.min(min,a[i]);
        max= Math.max(max,a[i]);
     }
     System.out.println("\nrange of the array\'a\': "+ (max-min));
    min= b[0];
    max= b[0];   
    for(int i=0; i<b.length; i++ ) {
        min= Math.min(min,b[i]);
        max= Math.max(max,b[i]);
     }  
      System.out.println("range of the array\'b\': " + 
      (max-min));
    //6
    System.out.println("stairs go up and down without moving also it could be the carpet on the stairs provided that the stairs had a carpet to begin with");
    //7
    for(int i=0;i<s.length; i++)
    {
     System.out.print(s[i].substring(0,1)+" ");
    }
    //8
    times=0;
    for(int i=0;i<s.length; i++)
    {
     if(s[i].charAt(s[i].length() - 1)=='e'){
       times++;
     }
    }
    System.out.println("\nNumber of times\'e\'appears: "+ times);
    //9
    int j=0;
    for(int i=0;i<s.length; i++)
    {
      j+=s[i].length(); 

     }
    System.out.println("Length of the total string s: " + j);
    //10 
    times=0;
    boolean lengthMoreThanSeven=false;
    for(int i=0;i<s.length; i++)
    {
     if(s[i].length()>=7){
       times++;
       if(times==2){
         lengthMoreThanSeven=true;
       }
       }
    } 
     if(lengthMoreThanSeven==true){
        System.out.println("Two len.7!");
     }
     else 
     {
       System.out.println("Less than2 len.7");}
    
    //11
    System.out.println("It ends up being your mother");
    //12
    times=0;
    for(int i=0;i<s.length; i++)
    {
      for(int k=0;k<s[i].length(); k++)
      {
        if(s[i].charAt(k)=='e'){
          times++;
        }
      }
    }
    System.out.println("\nNumber of times\'e\'appears: "+ times);
    //13
    int hiCount=0;
    int byeCount=0;
    String[] hiBye = {"byhigh", "hit", "byebye!", "hibye", "hilt"};  
      for (int i=0;i<hiBye.length;i++) { 
         for(int l=0;l<s[i].length(); l++)
       {
           if((l+2)<=hiBye[i].length()&& hiBye[i].substring(l,l+2).equals("hi")){
             hiCount++;
           }

           if((l+3)<= hiBye[i].length()&& hiBye[i].substring(l,l+3).equals("bye")){
             byeCount++;
             
           }
       }
         }
         if(hiCount==byeCount){
           System.out.println("Same hi/bye");
         }
         else{
           System.out.println("Not same hi/bye");
         }
         //Hangman
         String[] secretWord= {"c","o","m","p","u","t","e","r"};
         String[] masked= new String[secretWord.length]; 
         for(int i=0;i<masked.length;i++){
          masked[i]="_";
         }
         int counter=0;
         int guesses= 10;
         while(counter<guesses)
         {
           System.out.println("Guess a letter?");
           String letter= console.next();
           for(int m=0; m<masked.length;m++){
             if(secretWord[m].equals(letter))
             {
               masked[m]=letter;
             }
          
           }
           boolean checker=true;
           for(String element: masked){
             System.out.print(element+", ");
           }
           for(int i=0;i<masked.length;i++)
         {
           if(!masked[i].equals(secretWord[i])){
            checker=false;
           }
         }
         if(checker==true){
           System.out.println("YAY");
           break;
         }
           counter++;
         }
         
         for(int i=0;i<masked.length;i++)
         {
           if(masked[i].equals("_")){
             System.out.println("Sorry you snooze you loose");
           }
         }

    
       
  }
}