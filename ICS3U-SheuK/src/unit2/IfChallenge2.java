package unit2;
import java.util.Scanner;
/**
 * Description: This program prints the IfChallenge work sheet.
 * Date: November 10, 2024
 * @author Kate Sheu
*/

public class IfChallenge2 {
/**
 * Entry point into new program
 * @param args
 */
  public static void main(String[] args) {
    //This is for the portfolio

    /*Create a program that asks for three numbers.
    Tell the user if the numbers are strictly in order.
    ie.  2 5 11 or 5 6 7 are strictly in order.
    ie.  6 5 7 or 5 5 7 are not
    */
	Scanner in = new Scanner (System.in);
	//getting user input 
	System.out.println("Please enter the first number and press <enter>");
	int num1 = in.nextInt();
	System.out.println("Please enter the second number and press <enter>");
	int num2 = in.nextInt();
	System.out.println("Please enter the third number and press <enter>");
	int num3 = in.nextInt();
	
	//Calculations 
	if (num1<num2 && num2<num3) {
		System.out.println("Your numbers are strictly in order.");
	} else {
		System.out.println("Your numbers are not in order.");
	}
	in.close();
 
  }
}