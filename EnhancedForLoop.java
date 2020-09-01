/**
*Enhanced For Loop: Values/Elements are directly accessed one after another you don't have to specify index numbers to access them.
*It works only with array and collections
*Using enhanced for loop you cannot access specific array elements/values, it will access all the elements/values of he array
Eg: printing all the elements in an array

Syntax: for(datatype variable_name : array_name)
*/

public class EnhancedForLoop{
  public static void main(String[] args) {
    int number[] = new int[5];
    int start;
    int end=number.length;
    //input
    for (start=0; start<end; start++)
      number[start]=start+1;

    //output
    for (int values: number)
      System.out.print(values+" ");
  }
}
