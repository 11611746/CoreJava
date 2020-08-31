/**
A = 3
B = 9
After swapping: Interchanging the values between two variables
A = 9
B = 3
*/

public class Swap{
  public static void main(String[] args) {
    int number1 = 3;
    int number2 = 9;
    System.out.println("Before Swapping...\n");
    System.out.println("Number1 : "+number1);
    System.out.println("Number2 : "+number2);

    int temp = number1;       //we are storing the value of number1 to temp.
    number1 = number2;        //assigning the value of number2 in number1.
//  number2 = number1;          if we do so the we will get the wrong output beacuse we have assign number1 = number2; so the updated value is 9.
                              //that is the reason why we use temp variable. In this approach we need extra space so this is not the best solution.
    number2 = temp;           //assigining the value of temp to number2.

    System.out.println("\nAfter Swapping...\n");
    System.out.println("Number1 : "+number1);
    System.out.println("Number2 : "+number2);
  }
}
