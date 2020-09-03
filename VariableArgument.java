/**
*Varargs -> Variable Argument:
When number of Argument don't matches parameter in that case we use method overloading(creating multiple method with same name but they differ in parameters) so to reduce the number of methods we us Variable Argument.
*In Variable Argument the argument must be of same datatype.
Eg:
class one{
  main_method{
    creating an object of the class;
    calling the method with the help of class object and passing arguments;
  }
}

class two{
  method_one(parameters){
            //this method will only call if the number of argument == number of parameters
  }

            //if the number of argument is increased we need to create a same method with updated parameters this is called method overloading
            //instead of using method overloading we can go with Variable Argument(argument datatype must not differ they must be same)

  method_one(int Variable_name[]){
            //this can take multiple arguments, no fixed size
            //but the problem is if the argument that you are passing is different it will show error
            //another problem is that, if we pass any array type of argument or normal argument it will get confuse between them
  }

  //to overcome this confusing problem -> method_one(int Variable_name[], java has came up with another type
  method_one(int ... Variable_name){
            //rest it works like an array.
  }
}

*if you are passing two arguments and you have two methods with same name(method overloading) one is Varargs method and the other one is normal
method with exact two parameters, in this case the first priority will be given to the normal method which is having two parameters. If any
match is not found it will go for Varargs method.
*/

public class VariableArgument{
  public static void main(String[] args) {
    Addition object = new Addition();             //creating an object of the class
    object.add(3,5,4);                            //calling the method with the help of class object and passing arguments
  }
}

class Addition{
  //method 1
  public void add(int a, int b){
    System.out.println("a+b : "+(a+b));
  }

  //method 2
  public void add(int ... sum){                   //Varargs -> Variable Argument

//Using Enhanced For Loop
    int total = 0;
    System.out.println("\nEnhanced For Loop");
    for (int start : sum) {
      total=total+start;
      System.out.print(start+" ");
    }
    System.out.println("sum : "+total);

//Using Normal For Loop
    total = 0;
    System.out.println("\nFor Loop");
    for (int start=0; start<sum.length; start++) {
      total=total+sum[start];
      System.out.print(sum[start]+" ");
    }
    System.out.println("sum : "+total);
  }
}
