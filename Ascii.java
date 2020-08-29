/**
*ASCII -> (American Standard Code for Information Interchange)ASCII is a 7-bit character set containing 128 characters. It contains the numbers from 0-9, the upper
and lower case English letters from A to Z, and some special characters.
*2^7 -> 128
*128 characters starts from -> 0 - 127
*/

public class Ascii{
  public static void main(String[] args) {
    int ascii;

    System.out.println("\n\n\nASCII Code ------- Character\n\n");
    for (ascii=0; ascii<128; ascii++) {
      System.out.println(" "+ascii+" ----------- "+(char)ascii);
    }
  }
}
