/**

  * * * * *
  * * * * *
  * * * * *
  * * * * *
  * * * * *

Print -> print in same line.
Println -> print in next line.
Printf -> print in format.

why for loop?
if you know both the starting and ending point the select for loop.

*/

public class SquarePattern{
  public static void main(String[] args) {
    int line,star;
    System.out.println("Using For Loop\n");
    for (line=1; line<6; line++) {              //this will create the lines
      for (star=1; star<6; star++) {            //this will print the * on each line
        System.out.print(" * ");
      }
      System.out.println("");
    }

    System.out.println("\nUsing While Loop\n");
    int line1 = 1;
    int star1 = 1;
    while(line1<6){                           //Outer while loop will print lines
      while(star1<6){                         //Inner while loop will print * on each line
        System.out.print(" * ");
        star1++;                              //Will increment the number of star by one
      }
      star1 = 1;                             //To reset the value of Star from 6 to 1 after each itteration of Outer loop
      System.out.println("");
      line1++;                               //Will increment the number of line by one
    }
  }
}
