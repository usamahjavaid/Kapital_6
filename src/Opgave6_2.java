/*
(Sum the digits in an integer) Write a method that computes the sum of the digits
in an integer. Use the following method header:
public static int sumDigits(long n)
For example, sumDigits(234) returns 9 (= 2 + 3 + 4). (Hint: Use the % operator to extract digits and the / operator to remove the extracted digit. For instance,
to extract 4 from 234, use 234 % 10 (= 4 ). To remove 4 from 234, use 234 / 10
(= 2 3 ). Use a loop to repeatedly extract and remove the digit until all the digits
are extracted. Write a test program that prompts the user to enter an integer then
displays the sum of all its digits
 */
import java.util.Scanner;

public class Opgave6_2 {
    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter an integer
        long number = input.nextLong();

        //Display the sum of all the digits in the integer
        System.out.println("The sum of digits in " + number + " is " + sumDigits(number));

    }

    //Compute the sum of digits in an integer
    public static long sumDigits(long n) {

               int sum = 0;
               while (n > 0); {
                   sum+= n % 10;
                   n /= 10;
        }
              return sum;

    }

}
