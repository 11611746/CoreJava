/**
*Constructor: it is used to allocate an amount of memory required by object inside a heap memory.
*in java the object inside heap memory are know as instance.
Eg: Class_Name Object_Name = new Class_Name();
    Abc obj = new Abc();

    Abc -> Class name
    obj -> Reference
    new -> To create object/instance
    Abc() -> Constructor/ Member Method. This will allocate the amount of memory required by object inside a heap memory

*Constructor: 1. Member Method
              2. Has same name as the Class
              3. Never returns anything
              4. Use to allocate memory
              5. It is called automatically when the object/instance is created. you cannot call explicitly.

*Types: 1. Default Constructor
            *when an object/instance is created the Default Constructor is called automatically.
            *You don't have to define the Default Constructor inside a Class it is upto you.
            *you can initilize a default value inside a Constructor
            Eg:
              Class Abc{
              int a;    //default value is 0
              public Abc(){
                a=1;    //default value is now set to 1
              }
              }
        2. Parameterized Constructor
            *works similar as Default Constructor but contains parameter and it needs to be defined inside a class
            Eg:
              Class Abc{
              public Abc(int a){
                System.out.print("Value of a is : "+a);
              }
              }

*Working:
Eg:

public staic void main(String args[]){}
int a = 10;
Abc obj = new Abc();
obj.method();
}

Class Abc{
  public method(){
    System.out.print("Hello");
  }
}

Stack Memory                                                                    Heap Memory
  Name    |     Address/Value
    a                 10
   obj             @dd214e     <--------------------------------------------->     [@dd214e]
                                                                                   [Abc(){                    //default constructor
                                                                                   }
                                                                                   public method(){
                                                                                   System.out.print("Hello");
                                                                                   }]



*here in the heap memory the object/instance is created and for every instance created their is a unique hash code.
*in the stack memory the Reference(obj) is stored along with the object/instance hash code.
*in a class if we have more than one constructor with different parameters than it will be knows as constructor overloading.
*/

public class Constructor{
  public static void main(String[] args) {
    Abc obj = new Abc();
//    Xyz obj2 = new Xyz(10,15.05f);
    Xyz obj2 = new Xyz();
    obj2.inside();                                                //calling the inside method in Xyz class
  }
}

class Abc{
  //default constructor this is called when the object is created
  public Abc(){
    System.out.println("I am default constructor in class Abc");
  }
}

class Xyz{
  public Xyz(){                                                   //default constructor
    callingMe();
  }

  public Xyz(int a, float b){                                    //Parameterized constructor
    System.out.println("Value in a: "+a);
    System.out.println("Value in b: "+b);
  }

  //this is a case of constructor overloading

  public void inside(){                                          //method
    System.out.println("I am the method inside class Xyz");
  }

  public void callingMe(){                                      //method
    System.out.println("I am the method inside class Xyz and I have been called by default constructor of Xyz class");
  }
}
