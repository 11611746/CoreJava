/**
*2 Dimentional Array: combination of rows and columns
Eg:
  int a[] = {1,2,3,4};        //1-Dimentional Array
  int b[] = {5,6,7,8};
  int c[] = {9,10,11,12};

  int d[][] = {               //2-Dimentional Array
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
              };

c1, c2, c3, c4 -> columns
R1, R2, R3 -> Rows

              c1  c2  c3  c4

              {1, 2,  3,  4}       R1
              {5, 6,  7,  8}       R2
              {9, 10,  11, 12}     R3

Syntax:
datatype variable_name[][] = new datatype[size of rows][size of columns];

variable_name[][] -> array of array of element
variable_name[] -> array of element
*/

public class Array2{
  public static void main(String[] args) {
    int numbers[][]={
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12}
                  };
    int row_end = 3;
    int column_end = 4;
    for (int row_start=0; row_start<row_end; row_start++) {
      for (int column_start=0; column_start<column_end; column_start++) {
        System.out.print(numbers[row_start][column_start]+" ");
      }
      System.out.println("");
    }
  }
}
