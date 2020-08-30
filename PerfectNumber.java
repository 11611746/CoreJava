/**
*Perfect Number: sum of all the factors must be equal to the number.
Eg:
  6:
  factors -> 1,2,3
  sum of all the factors -> 1+2+3 = 6
  sum of all the factors == number
*/

public class PerfectNumber{
  public static void main(String[] args) {
    int number=9;
    int sum=0;

    for (int i=1; i<number; i++) {
      if (number%i==0) {
        sum = sum + i;
      }
    }

    System.out.println("Total Sum = "+sum);
    if (sum==number)
      System.out.println("Perfect Number");
    else
      System.out.println("Not a Perfect Number");
  }
}
