/*
(Sort three numbers) Write a method with the following header to display three
numbers in decreasing order:
public static void displaySortedNumbers(
 double num1, double num2, double num3)
Write a test program that prompts the user to enter three numbers and invokes the
method to display them in decreasing order

 */

import java.util.Scanner;

public class Opgave6_5 {
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter three numbers
        System.out.println("Enter three numbers ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        //Display numbers in decreasing order
        displaySortedNumbers(number1, number2, number3);

    }

       //displaySortedNumber Method display three numbers in decreasing order
        public static void displaySortedNumbers(double num1, double num2, double num3){
        double temp; //hold number to swap

            if (num2 > num1 && num2 > num3){
                temp = num1;
                num1 = num2;
                num2 = num1;
            }
            else if (num3 > num1 && num3 > num2) {
                temp = num1;
                num1 = num3;
                num3 = temp;
            }
            if (num3 > num2) {
                temp = num2;
                num2 = num3;
                num3 = temp;
            }

            //Display result

            System.out.println(num1 + " " + num2 + " " + num3 );
        }

}
