/**
*Bitwise OR operator: First it convert the number to binary form and then use AND operaion
*OR Operator Symbol: |
*OR OPERATION:
*0 OR 0 = 0
*0 OR 1 = 1
*1 OR 0 = 1
*1 OR 1 = 1

*Eg:
  5 -> 1 0 1
  4 -> 1 0 0
--------------  (OR OPERATION)
    -> 1 0 1  (5)
*/

public class BitwiseOr{
  public static void main(String[] args) {
    int a=5,b=4;
    int c= a | b;
    System.out.println("a | b: "+c);
  }
}
