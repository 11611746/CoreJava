/**
*Random: it generates random values. It is found inside java.util package
*/

import java.util.Random;

public class RandomInt{
  public static void main(String[] args) {
    Random random = new Random();
    int numbers[] = new int[35];
    int end=numbers.length;
    for (int start=0; start<end; start++)
      numbers[start]=random.nextInt(100);         //it will insert any random numbers between 1 - 100

    for (int start : numbers)
      System.out.print(start+" ");

    //value at 20th position
    System.out.println("\n\nvalue at 20th position: "+numbers[19]);              //why 19? because index number stars from 0 so, 20-1=19
  }
}
