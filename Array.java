/**
*Array: Collection of similar type of elements/values

Eg:
  int a,b,c,d,e;        //5 different variables to store 5 different values
  a=1;
  b=2;
  c=3;
  d=4;
  e=5;

  Array:  int f[5];         //5 ->it is the size of array or number of values that you want to store in the array. In array we use single variable to store multiple values/elements of similar data type.
  f[0]=1;                   //0 -> index number
  f[1]=2;                   //1 -> index number
  f[2]=3;
  f[3]=4;
  f[4]=5;

*In normal values are initilized/access by variable name but in arrays values initialized/access by index number. So, for every values index number is unique.

*When we will use array?
*When we want to store high amount of elements/values of similar datatype.

Eg:
int var[] = new int[5];
int -> datatype, defines the type of the values/elements
var -> variable name
[] -> this specifies var is not a normal variable it's a array type variable which will contain multiple values.
new ->since arrays in java are objects so,we need to create an object of the array with the help of 'new' keyword.
int ->defines the type of array of values/elemnts that you need.
[5] -> defines the size of the array/ how many elements/values it can store.

*/

public class Array{
  public static void main(String[] args) {
    int var[] = new int[5];
    int number[] = new int[10];

    var[0] = 1;
    var[1] = 2;
    var[2] = 3;
    var[3] = 4;
    var[4] = 5;

    System.out.println(var[0]);
    System.out.println(var[1]);
    System.out.println(var[2]);
    System.out.println(var[3]);
    System.out.println(var[4]);

    //Using for loop
    System.out.println("\nUsing For Loop\n");
    int start = 0;
    int end = 10;
    for (start=0; start<end; start++) {           //index numbers from 0 - 9
      number[start]=start+1;
      //number[0]=0+1;                            //1st iteration =1
      //number[1]=1+1;                            //2nd iteration =2
      //number[2]=2+1;                            //3rd iteration =3
      //number[3]=3+1;                            //4th iteration =4
      //number[4]=4+1;                            //5th iteration =5
      //number[5]=5+1;                            //6th iteration =6
      //number[6]=6+1;                            //7th iteration =7
      //number[7]=7+1;                            //8th iteration =8
      //number[8]=8+1;                            //9th iteration =9
      //number[9]=9+1;                            //10th iteration =10
      //start=10 < end=10, condition becomes false
    }

    for (start=0; start<end; start++) {
      System.out.print(number[start]+" ");
    }
  }
}
