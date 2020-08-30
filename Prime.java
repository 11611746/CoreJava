/**
*Number which is divisible by 1 and itself, having two factors.
Eg: 2,3,5,7,11...
*1 is not a prime number
*/

public class Prime{
  public static void main(String[] args) {
    int number=5;
    int count=0;

    if (number==1) {                                        //to check the number is 1 or not
      System.out.println("Not a prime number."+count);
    }
    else {
      for (int i=2; i<number; i++) {                       //this will divide the number from 2 and one less than the number itself
        if (number%i==0) {                                 //to check the remainder is 0 or not
          count++;                                         //count the number of 0 remainder
        }
      }
      if (count>0)                                        //if the number of count is greater than 1
        System.out.println("Not a prime number.");
      else
        System.out.println("prime number.");
    }

  }
}
