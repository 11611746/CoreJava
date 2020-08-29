/**
*Break Statement: When a particular block uses a break statement, after encountering the break statement in the block the rest of the statement don't get execute
with in that block and it jump out of that block.
*Break Statement can be used in loop and switch case.
Eg:
  while(condition){
  Statement1;
  break;
  Statement2;
}
*Satement1 will get execute only and it will come out from the while loop.
*/

public class LabeledBreak{
  public static void main(String[] args) {
    int number = 1;
    int number1 = 1;

    paul:                    //Label Declared
    //outer while loop
    while (number1<5) {
      //inner While loop
      while(number<5){
      if (number1==3)
        break paul;       //Labeled Break Satement
        System.out.print(" "+number+" ");
        number++;
      }

      number = 1;
      System.out.println("");
      number1++;
    }


    System.out.println("\nOut of loop\n");
    while (number<5) {
      System.out.println(number+" ");
      number++;
      if (number==4)
      break;            //Unlabeled Break Statement
    }

  }
}
