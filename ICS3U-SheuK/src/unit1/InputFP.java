package unit1;

import java.util.Scanner;

/**
 * Description: Floating-Point Variables Worksheet
 * Date: October 3, 2024
 * @author Kate Sheu
 */
public class InputFP {
	/**
	 * Entry point to new program.
	 * @param args
	 */

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	//Declare variables 
	
	double num1, num2;
	
	//Getting user input
	System.out.println("Type in a value for num1 and press <Enter>");
	num1 = sc.nextDouble();
	
	System.out.println("Type in a value for num2 and press <Enter>");
	num2 = sc.nextDouble();
	
	//Printing output
	System.out.println();
	System.out.println("The first number entered was"+ num1);
	System.out.println("The second number entered was"+ num2);
	sc.close();
 
	}

}
