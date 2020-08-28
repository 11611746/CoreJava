/**
*Ternary operator: It is similar to If-Else statement
expression = condition?if-block code:else-block code;
*/

public class TernaryOperator{
  public static void main(String[] args) {
    int number1 = 3;

    String j = number1==3?"yes":"no";
    System.out.println(j);

    int i = number1==3?3:0;
    System.out.println(i);

    Object obj1;
    Object obj2;
    Object obj3;

    //If-Else Statement
    if (true) {
      obj1 = new Integer(5);
      System.out.println(obj1);
    }
    else {
      obj2 = new Double(10.2);
      System.out.println(obj2);
    }

    //Ternary Operator
    obj3 = true?new Integer(5):new Double(10.2);
    System.out.println(obj3);
  }
}

/*
*You might notice that there is a change in the output of 'If-Else Statement' and 'Ternary Operator' though both the statements are have same piece of code.
This is because using 'Ternary Operator' the output is dependend on both the data types of if and else statements. It always select the higher data type format
to display the result and this is the major difference between 'If-Else Statement' and 'Ternary Operator'.
*/
