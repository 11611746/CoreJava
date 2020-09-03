/**
*Jacked Array: Arrays of variable sizes. Array must be 2-Dimensional or Multi-Dimensional.
Eg:
method 1:
int a[][] = {
        {1,2,3,4,5,6},
        {5,3,2},
        {2,7,8,9,0},
        {3,4}
          };

explanation:
          c1  c2  c3  c4 c5 c6

          {1, 2, 3, 4, 5, 6},     R1
          {5, 3, 2},              R2
          {2, 7, 8, 9, 0},        R3
          {3, 4}                  R4

*You can see that number of colums in each row are different so you need to define each column seperately in Jacked Array.

method 2:
int a[][] = new int[4][];

  a[0] = new int[6];
  a[1] = new int[3];
  a[2] = new int[5];
  a[3] = new int[2];

*we know that the column size of each row is different so we need to initilize the size of column seperately.
*if you  are initilizing the value during the time of initilizing of array than you can go with the method 1.

*/

public class JackedArray{
  public static void main(String[] args) {
    //method 1
    System.out.println("Method 1");
    int arrays[][] = {
            {1,2,3,4,5,6},
            {5,3,2},
            {2,7,8,9,0},
            {3,4}
              };

    for (int rows[] : arrays) {
      for (int columns : rows) {
        System.out.print(columns+" ");
      }
      System.out.println("");
    }

    //method 2
    System.out.println("\n\nMethod 2");
    int a[][] = new int[4][];

      a[0] = new int[6];
      a[1] = new int[3];
      a[2] = new int[5];
      a[3] = new int[2];

    int row_end = 4;
      int value = 5;
    for (int row_start=0; row_start<row_end; row_start++) {
      for (int column_start=0; column_start<a[row_start].length; column_start++) {
        a[row_start][column_start]=(value=value+1);
      }
    }

    for (int rows[] : a) {
      for (int columns : rows) {
        System.out.print(columns+" ");
      }
      System.out.println("");
    }
  }
}
