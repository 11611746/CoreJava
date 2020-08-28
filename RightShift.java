/**
*Right Shift operator: First it convert the number to binary form and then removes number of 0/1 from right depending upon the number of shift operation
*Right Shift Operator Symbol: >>
*Start Binary Number from right to left:  17 to binary -> 1 0 0 0 1
*Eg:
  5 -> 1 0 1
--------------  (Left Shift 2 - remove last two bit from the end.)
    -> 1  (1)
*/

public class RightShift{
  public static void main(String[] args) {
    int a=5;
    int c= a >> 2;
    System.out.println("Right Shift 2: "+c);
  }
}
