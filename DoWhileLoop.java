/**
*Loop: Let us consider a point 'A' and try to draw a complet circle from that point and repeat this process again and again.
*Do While Loop: it's first executes the block of statements inside it than check the condition, if it is true and repeat the process untill the condition becomes false.
Eg:
do{
statement;
increment/decrement operator;
}while(condition);

*condition -> total number of repeations.
*increment operator -> incrementing the number of complete rotation of a circle.
*statement -> Drawing the circle.
*/

public class DoWhileLoop{
  public static void main(String[] args) {
    int number=20;

//Do While
    System.out.println("Do While Loop: ");
    do{
    //  number++;
      System.out.print(number+" ");
      number++;
    }while(number<10);


//While Loop
    System.out.println("\n\nWhile Loop: ");
    while(number<10){
    //  number++;
      System.out.print(number+" ");
      number++;
    }
  }
}
