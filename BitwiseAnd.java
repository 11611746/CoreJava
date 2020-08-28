/**
*Bitwise AND operator: First it convert the number to binary form and then use AND operaion
*AND Operator Symbol: &
*AND OPERATION:
*0 AND 0 = 0
*0 AND 1 = 0
*1 AND 0 = 0
*1 AND 1 = 1

*Eg:
  5 -> 1 0 1
  4 -> 1 0 0
--------------  (AND OPERATION)
    -> 1 0 0  (4)
*/

public class BitwiseAnd{
  public static void main(String[] args) {
    int a=5,b=4;
    int c= a & b;
    System.out.println("a & b: "+c);
  }
}
