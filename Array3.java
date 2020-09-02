public class Array3{
  public static void main(String[] args) {
    int numbers[][]={
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12}
                  };
    for (int rows[] : numbers) {                //this will fetch the entire row. row[] -> since it is 2-Dimensional array we cannot fetch the element directly so, we are fetching the entire array of rows.
      for (int columns : rows) {                //this will fetch the entire elements on by one
        System.out.print(columns+" ");          //this will print the elements
      }
      System.out.println("");                   //this will move to next line
    }
  }
}
