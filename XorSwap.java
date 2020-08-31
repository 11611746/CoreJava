/**
A = 3
B = 9
After swapping: Interchanging the values between two variables
A = 9
B = 3

*XOR:
  1 ^ 1 = 0
  0 ^ 1 = 1
  1 ^ 0 = 1
  0 ^ 0 = 0
*/

public class XorSwap{
  public static void main(String[] args) {
    int a=4;      //100(binary format)
    int b=7;      //111(binary format)
    System.out.println("Before Swapping...\n");
    System.out.println("a : "+a);
    System.out.println("b : "+b);

    a=a^b;      //a=100^111=011
    b=a^b;      //b=011^111=100
    a=a^b;      //a=011^100=111

    System.out.println("After Swapping...\n");
    System.out.println("a : "+a);
    System.out.println("b : "+b);
  }
}
