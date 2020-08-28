/**
*Fibonacci series: 1 1 2 3 5 8 13...
*first number: first = 0;
*second number: second = 1;
*sum of first and second number: sum = first + second;
*assign the value of second to first inside a loop
*assign the value of sum to second
*/

public class Fibonacci{

  public static void main(String[] args) {
    int first,second,sum;
    first = 0;
    second = 1;

    int temp = 52;

    System.out.print("Fibonacci Series: "+second);
    for(int i=0; i<10; i++){
      sum = first + second;
      first = second;
      second = sum;
      System.out.print(" "+sum);
    }
  }
}
