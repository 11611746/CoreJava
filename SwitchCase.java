/**
*Switch Case is some what similar to if-else statements
*In java switch case supports string value

Eg:
switch(Expression){
  case1 : statement;
          break;
  case2 : statement;
          break;
  default : statement;
}

*If we don't use break in switch case than after matching a particular case it will execute that and execute rest of the
remaining cases. So to avoid that we use break statement and come out of the branch after executing the match case only.
*The default case is similar to  else condition, if any match is not found it will execute the default case.
*/

public class SwitchCase{
  public static void main(String[] args) {
    int i=2;
    String s="hi";

    switch(i){
      case 1: System.out.println("One");
              break;
      case 2: System.out.println("Two");
              break;
      case 3: System.out.println("Three");
              break;
      default: System.out.println("None");
    }

    System.out.println("Switch Case String");

    switch(s){
      case "hi": System.out.println("hi");
              break;
      case "hello": System.out.println("hello");
              break;
      case "hi hello": System.out.println("hi hello");
              break;
      default: System.out.println("None");
    }

  }
}
