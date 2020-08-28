/**
*Else-If
*It is almost similar to If-Else but the major difference is that If-Else works with One Condition where as Else-If works with Multiple Different Conditions.
*One Condition:
Eg: if(condition){}
    else{}
Eg: if(condition1 && condition2){}
    else{}
Eg: if(condition1 || condition2){}
    else{}

*Multiple Different Conditions:
Eg: if(condition1){}
    else if(condition2){}
    else{}
Eg: if(condition1 && condition2){}
    else if(condition3){}
    else{}

*&& Operator
*If any of the condition is false the result is false
True -> T
False -> F
condition1 -> a
condition2 -> b

    a * b = &&
    T * T = T
    F * T = F
    T * F = F
    F * F = F

*|| Operator
*If any of the condition is true the result is true
True -> T
False -> F
condition1 -> a
condition2 -> b

    a + b = ||
    T + T = T
    F + T = T
    T + F = T
    F + F = F

*If a If-Else block or a Else-if block has a single line in it than you can skip {}
*/

public class ElseIf{
  public static void main(String[] args) {
    int number1 = 3;
    int number2 = 1;
    int number3 = 8;

    //to find the largest number
    if (number1>number2 && number1>number3)
      System.out.println(number1+" is greater");

    else if (number2>number1 && number2>number3)
      System.out.println(number2+" is greater");

    else
      System.out.println(number3+" is greater");
  }
}
