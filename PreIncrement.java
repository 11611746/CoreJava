/**
*Preincrement Operator: ++i
*Preincrement Operator: First it increment the value by one and than assign the value
*++i -> i = i + 1;

*how i = ++i; works
i=6
i = i + 1;
int temp = i;
i = temp;
System.out.println("i = temp value "+i);

*Output: 7
*/

public class PreIncrement{
  public static void main(String[] args) {
    int j,i=5;
    j = ++i;
    System.out.println("j = "+j+" i = "+i);

    i = ++i;
    System.out.println("i = ++i value "+i);

    ++i;
    System.out.println("i++ value "+i);
  }
}
