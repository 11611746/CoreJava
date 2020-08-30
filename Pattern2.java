/**

  1
  0 1
  1 0 1
  0 1 0 1
  1 0 1 0 1

Print -> print in same line.
Println -> print in next line.
Printf -> print in format.

why for loop?
if you know both the starting and ending point the select for loop.

*/

public class Pattern2{
  public static void main(String[] args) {
    int line,star;
    System.out.println("Using For Loop\n");
    for (line=1; line<6; line++) {              //this will create the lines
      for (star=1; star<=line; star++) {        //this will print the * on each line, number of stars that will be printed on each line will be based on the line number
        if (line%2==0) {                        //this is for even lines

          if (star%2==0)                        //to check the star is even or odd
            System.out.print(" 1 ");            //if it is even print 1
          else
            System.out.print(" 0 ");            //else print 0
        }

        else {                                  //this is for odd lines

          if (star%2==0)                        //to check the star is even or odd
            System.out.print(" 0 ");            //if it is even print 0
          else
            System.out.print(" 1 ");            //else print 1
        }
      }
      System.out.println("");
    }

    System.out.println("\nUsing While Loop\n");
    int line1 = 1;
    int star1 = 1;
    while(line1<6){                           //Outer while loop will print lines
      while(star1<=line1){                         //Inner while loop will print * on each line
        if (line1%2==0) {

          if (star1%2==0)
            System.out.print(" 1 ");
          else
            System.out.print(" 0 ");
        }

        else {

          if (star1%2==0)
            System.out.print(" 0 ");
          else
            System.out.print(" 1 ");
        }
        star1++;                              //Will increment the number of star by one
      }
      star1 = 1;                             //To reset the value of Star from 6 to 1 after each itteration of Outer loop
      System.out.println("");
      line1++;                               //Will increment the number of line by one
    }
  }
}
