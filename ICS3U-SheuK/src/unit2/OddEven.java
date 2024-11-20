package unit2;

import java.util.Scanner;

/**
 * Description: This program prints if the number inputted is odd or even.
 * Date: November 1, 2024
 * @author Kate Sheu
 */

public class OddEven {
/**
 * Entry point into new program
 * @param args
 */

	public static void main(String[] args) {
		
		// Getting use input
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a integer digit and press <enter>");
		int num = sc.nextInt();
		
		//Testing if number is odd or even
		if (num%2 == 0) {
			System.out.println("Your integer is an even number");
		}
		else {
			System.out.println("Your integer is an odd number");
		}
		sc.close();

	}

}
