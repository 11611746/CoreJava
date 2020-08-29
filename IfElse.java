/**
*If-Else
*It needs a specefic condition to work with it, either the conditions must be true or false.
*We need to specify the condition in the 'IF' part and if the condition matches the 'IF' block will execute.
*The 'ELSE' part has no condition in it, this 'ELSE' block works only if the 'IF' part condition is false.

Eg:
if(condition){
Statement1;
}
else{
Statement2;
}
*/

public class IfElse{
  public static void main(String[] args) {
    int number1 = 3;
    int number2 = 1;

    if (number1==3) {
      System.out.println("Yes it is 3");
    }
    else{
      System.out.println("No it's not 3");
    }

    if (number2==6) {
      System.out.println("Yes it is 6");
    }
    else{
      System.out.println("No it's not 6");
    }
  }
}
