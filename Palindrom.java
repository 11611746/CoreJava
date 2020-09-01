/**
*Palindrom Number: The given number when reversed should be same as the given number.
Eg:
  121:
  reversed number -> 121
  reversed number == number
*/

public class Palindrom{
  public static void main(String[] args) {
    int number=121;
    int reverse=0;
    for (int start=number; start!=0; start=start/10) {
      System.out.println(start);
      reverse = reverse*10+(start%10);
      //1st iteration: for(start=121; 121!=0; start=121/10)
      //reverse = 0*10+(121%10);
      //reverse = 0*10+(1);
      //reverse = 1;

      //2nd iteration: for(start=121; 12!=0; start=12/10)
      //reverse = 1*10+(12%10);
      //reverse = 1*10+(2);
      //reverse = 12;

      //3rd iteration: for(start=121; 1!=0; start=1/10)
      //reverse = 12*10+(1%10);
      //reverse = 12*10+(1);
      //reverse = 121;

      //4nd iteration: for(start=121; 0!=0; )
      //come out of the loop becaus 0!=0 condition is false
    }
    if(reverse==number)
      System.out.println("Palindrom Number");
    else
      System.out.println("Not Palindrom Number");


      //using while loop
      int number2=1222;
      int rev=0;
      int duplicate=number2;    //if we don't store the value of number2 in other variable, during comparision time we will get the wrong output due to the updation of number2 inside the while loop.
      while(number2!=0){
        int temp = number2%10;
        rev = rev*10+temp;
        number2 = number2/10;
      }
      if(rev==duplicate)
        System.out.println("Palindrom Number");
      else
        System.out.println("Not Palindrom Number");
  }
}

/*if you declare a variable inside any block the scope of that value remains within that block. you cannot access outside of the block.
*Eg: temp variable which is used in the program.
*/
