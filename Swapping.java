/**
A = 3
B = 9
After swapping: Interchanging the values between two variables
A = 9
B = 3
*/

public class Swapping{
  public static void main(String[] args) {
    int number1 = 3;
    int number2 = 9;
    System.out.println("Logic Number 1...");
    System.out.println("Before Swapping...\n");
    System.out.println("Number1 : "+number1);
    System.out.println("Number2 : "+number2);

    //Eg: 3+9=12, 12-9=3, 12-3=9
    number1 = number1 + number2;    //number1 = 3+9=12
    number2 = number1 - number2;    //number2 = 12-9=3
    number1 = number1 - number2;    //number1 = 12-3=9

    //we are not using any extra memory or variable

    System.out.println("After Swapping...\n");
    System.out.println("Number1 : "+number1);
    System.out.println("Number2 : "+number2);

    int a=2;
    int b=3;
    System.out.println("\nLogic Number 2");
    System.out.println("Before Swapping...\n");
    System.out.println("a : "+a);
    System.out.println("b : "+b);

    a=a+b-(b=a);      //in java the expressions which are inside () are execute first.
    //a=2+3-(b=2)
    //a=2+3-(2)
    //a=3
    System.out.println("After Swapping...\n");
    System.out.println("a : "+a);
    System.out.println("b : "+b);
  }
}
