/**
*Loop: Let us consider a point 'A' and try to draw a complet circle from that point and repeat this process again and again.
*While Loop: it's first check the condition if it is true than executes the block of statements inside it and repeat the process untill the condition becomes false.
Eg:
while(condition){
statement;
increment/decrement operator;
}

*condition -> total number of repeations.
*increment operator -> incrementing the number of complete rotation of a circle.
*statement -> Drawing the circle.
*/

public class WhileLoop{
  public static void main(String[] args) {
    int number=0;

    while(number<=10){
      number++;
      System.out.print(number+" ");
      number++;
    }
  }
}
