/**
*Armstrong number: 153

*Actual number: 153
*cube of a individual number when added together and the result is same as the Actual number is said to be Armstrong number.
1*1*1 + 5*5*5 + 3*3*3 = 153

*the Actual number is stored in another variable named quoitent
*to find the individual digit: remainder = quoitent % 10;      *this will give the last digit
*to find the the cube of individual digit cube = remainder*remainder*remainder;
*to add all the cube of individual digit: sum += cube; or sum = sum + cube;
*to get the remaining digit, you need the quoitent: quoitent = quoitent / 10;
*repeat this process by using a loop
*check if the Actual number is same as the sum, if yes than it is a armstrong number.
*/

public class Armstrong{

  public static void main(String[] args) {
    int sum,remainder,quoitent,cube;
    int number = 1;
    sum = 0;
    quoitent = number;
    while (quoitent>0) {
      remainder = quoitent % 10;
       quoitent = quoitent / 10;
       cube = remainder*remainder*remainder;
       sum += cube;
    }

    if (sum==number) {
      System.out.print(number+" is armstrong number.");
    }
    else{
      System.out.print(number+" is not a armstrong number.");
    }
  }
}
