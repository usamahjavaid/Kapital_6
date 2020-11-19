/*
(Display patterns) Write a method to display a pattern as follows:
1
1 2
1 2 3
...
n n−1 ... 3 2 1
The method header is
public static void displayPattern(int n)

 */

import java.util.Scanner;
public class Opgave6_6 {
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner (System.in);

        //prompt the user to enter number of rows
        System.out.println("Enter number of rows ");

        int numberOfRows = input.nextInt();

        //Display pattern
        displayPattern(numberOfRows);

    }
    //Display pattern method
    public static void displayPattern(int n) {
         //Holds number of whitespace
        int padding = n - 1;
        for (int r = 1; r <=n; r++) {
            //print padding
            for (int p = 0; p <padding ; p++) {
                System.out.print(" ");
                
            }
            //print numbers
            for (int i = r; i >0 ; i--) {
                System.out.print(i + " ");
                
            }
            System.out.println();
            padding--; //Decrement padding
        }


    }

}
