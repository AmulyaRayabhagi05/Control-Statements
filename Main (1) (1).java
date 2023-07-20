
//name:
//period:
import java.util.*;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    int[] nums = { 2, 4, 5, 8, 16, 2, 3, 5, 9, 0, 9, 12, 6 };
    // 2
    System.out.println(nums[0]);
    // 3
    System.out.println(nums[1]);
    // 4
    System.out.println(nums[3]);
    // 5
    System.out.println(nums[12]);
    // 6
    System.out.println(nums.length);
    // 7
    System.out.println(nums[nums.length - 1]);
    // 9
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    // 10
    if (nums[0] == 6 || nums[nums.length - 1] == 6) {
      System.out.println("\nTrue");
    } else
      System.out.println("\nFalse");
    // 11
    boolean aboveTen = false;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 10) {
        aboveTen = true;
        break;
      }

    }
    if (aboveTen)
      System.out.println("above 10");
    else
      System.out.println("below/at 10");

    // 12
    boolean foundSix = false;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 6) {
        foundSix = true;
        break;
      }
    }
    if (foundSix)
      System.out.println("Found a 6");
    else
      System.out.println("no 6");
    // 13
    boolean nottwoToEight = false;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= 8 & nums[i] <= 2) {
        nottwoToEight = true;
        break;
      }
    }
    if (nottwoToEight == false)
      System.out.println("no");
    else
      System.out.println("yes");

    // Histogram app
    int[] data = new int[25];
    Random rng = new Random();
    for (int i = 0; i < data.length; i++) {
      data[i] = rng.nextInt(10);

    }
    System.out.println(Arrays.toString(data));
    int[] count= new int[10];
    for(int i=0;i<data.length;i++)
    {
      int charachter = data[i];
      count[charachter]++;
    }
    for(int i=0;i<count.length;i++){
    System.out.println(i+" occured "+ count[i]+" times.");
    }
  }
}