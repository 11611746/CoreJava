/**
*In java we can use printf and it returns an object of PrintStream type
*executing a program without a semi-colon ';'
*/

public class PrintHello{
  public static void main(String[] args) {

    if (System.out.printf("Hello")==null) {

    }
  }
}

/*
*if (System.out.printf("Hello")==null){}
*This if condition will execute and print 'Hello' and then it will check the condition. Though the condition is false because the printf method will return an object of PrintStream.
*/
