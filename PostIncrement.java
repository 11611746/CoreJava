/**
*Postincrement Operator: i++
*Postincrement Operator: Assign the value first and than increment the value by one
*i++ -> i = i + 1;
*/

public class PostIncrement{

  public static void main(String[] args) {
    int j,i=5;
    j = i++;
    System.out.println("j = "+j+" i = "+i);

    i = i++;
    System.out.println("i = i++ value "+i);

    //how i = i++; works
    int temp = i;
    i = i + 1;
    i = temp;
    System.out.println("i = temp value "+i);

    i++;
    System.out.println("i++ value "+i);
  }
}
