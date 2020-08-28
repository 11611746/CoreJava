/**
*Left Shift operator: First it convert the number to binary form and then add number of 0 to right depending upon the number of shift operation
*Left Shift Operator Symbol: <<
*Start Binary Number from right to left:  17 to binary -> 1 0 0 0 1
*Eg:
  5 -> 1 0 1
--------------  (Left Shift 2 - add two 0 at the end.)
    -> 1 0 1 0 0  (5)
*/

public class LeftShift{
  public static void main(String[] args) {
    int a=5;
    int c= a << 2;
    System.out.println("Left Shift 2: "+c);
  }
}
