/**
*Data Types -> It defines the type of data

*int - 4 bytes
*float - 4 bytes
*double - 8 bytes
*char - 2 bytes
*boolean - 1 byte

*int:
*short int - 2 bytes
*long int - 8 bytes
*byte - 1 byte

*By default any real numbers/decimal numbers are recognised as double in java
*Problem with double is wastage of memory if we use small real numbers eg: 2.5,3.4 etc. So, in order to overcome this memory wastage problem we need to
specify float in this manner
*eg: float num = 3.5f; It signifies don't go for double use float.

*Char should be in a single quote ''
*String should be in a double quote ""
*ASCII code -> it's integer representation of any char
*ASCII code 'A' -> 65
*ASCII code 'B' -> 66
*ASCII code 'C' -> 67 and so on
*ASCII code 'Z' -> 90

*ASCII code 'a' -> 97
*ASCII code 'b' -> 98
*ASCII code 'c' -> 99 and so on
*ASCII code 'z' -> 122

*ASCII value starts at 0 and ends at 127
*/

import java.util.*;

public class DataTypes{

  public static void main(String[] args) {

    int num1 = 129;
    int num2 = 20;

    float a = 9.4f;
    float b = 2.8f;

    char ch1 = 'Z';

    System.out.println("Before: num1+num2 = "+(num1+num2));
    System.out.println("Float: a+b = "+(a+b));
    System.out.println("Char: "+ch1);
    System.out.println("Char to Integer: "+(int)ch1);      //type casting -> it will convert the char value to integer value
    System.out.println("Integer to Char: "+(char)num1);
    num2 = 10;
    System.out.println("After: num1+num2 = "+(num1+num2));
  }
}
