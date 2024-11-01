package unit2;

import java.util.Scanner;

/**
 * Description: This program tests if the number inputed is positive or negative.
 * Date: November 1, 2024
 * @author Kate Sheu
 */
public class PositiveNegative {
/**
 * Entry point into new program
 * @param args
 */

	public static void main(String[] args) {
		// Getting use input
				Scanner sc = new Scanner (System.in);
				System.out.println("Please enter a integer digit and press <enter>");
				int num = sc.nextInt();
				
				//Testing if number is positive or negative
				if (num > 0) {
					System.out.println("Your integer is a positive number.");
				}
				if (num < 0) {
					System.out.println("Your integer is a negative number.");
				}
				// Testing if number is divisible by 7 
				if (num%7 == 0) {
					System.out.println("Your integer is divisible by 7.");
				}
				else {
					System.out.println("Your integer is not divisible by 7.");
				}
				sc.close();

	}

}
