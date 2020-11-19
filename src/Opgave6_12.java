/*
2 (Display numbers) Write a method that prints numbers using the following header:
public static void printNumbers(int num1, int num2, int
 numberPerLine)
 This method prints the characters between num1 and num2 with the specified
numbers per line. Write a test program that prints ten characters per line from 1
to 100. Numbers are separated by exactly one space.
 */

import java.util.Scanner;
public class Opgave6_12 {
    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);
        int num1 = 1;
        int num2 = 100;
        int NumberOfLines = input.nextInt();
        printNumbers(num1, num2, NumberOfLines);
    }

    public static void printNumbers(int num1, int num2, int NumberOfLines){

        for (int i = 1; i <num2 ; i++) {
            if (i % NumberOfLines !=0 ){
                System.out.println(i + " ");
            }
            else {
                System.out.println(i);
            }
        }

    }


}
