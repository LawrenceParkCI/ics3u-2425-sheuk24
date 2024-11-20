package unit1;

import java.util.Scanner;

/**
 * Description: UsingMathMethods worksheet
 * Date: October 9, 2024
 * @author Kate Sheu
 */
public class UsingMathMethods {

	/**
	 * Entry point to new program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.println("Part A");
		
		//Write code to ask the user for any real number to be input.
		System.out.println("Type in any real number and press <ENTER>");
		
		//Store their input into the num variable
		num = sc.nextDouble();
		
		System.out.println(Math.round(num));
		System.out.println(Math.rint(num));
		System.out.println(Math.sqrt(num));
		System.out.println(Math.abs(num));
		System.out.println(Math.pow(num, 2));
		System.out.println(Math.pow(num, num));
		System.out.println(Math.pow(num, 3));

		
		/*
		 * Run the program and write down the output that is produced
		 * when each of the following values are input:
		 * 
		 * 					num = 16.75				| num = 4.0		| num = -23.45
		 * 					-----------------------------------------------
		 * Math.round(num)	  17					| 4				| -23
		 * Math.rint(num)	  17.0					| 4.0			| -23.0
		 * Math.sqrt(num)     4.092676385936225		| 2.0			| NaN
		 * Math.abs(num)	  16.75					| 4.0			| 23.45
		 * Math.pow(num, 2)	  280.5625				| 16.0			| 549.9024999999999
		 * Math.pow(num, num) 3.178689376746782E20	| 256.0			| NanN
		 * Math.pow(num, 3)	  4699.421875			| 64.0			| -12895.213624999999
		 * 
		 */
		
		//Why does the last value(-23.45) give strange output for Math.sqrt(num)?
		//because you can't have the square root of a negative number
		//Nan stands for Not a number!
		
		//In your own words describe what the following Math methods does
		/*
		 * round: rounds the first decimal point to the closest integer (1-4 round down, 5-9 round up)
		 * rint: rounds first decimal point, however keeps number as a double (e.g. 5.9 = 6.0)
		 * sqrt:calculates the square root of a number 
		 * abs: calculates the absolute value of a number 
		 * pow: calculates exponents with the first variable being the base and the second variable being the exponent (e.g. (6,3) = 6^3) 
		 */
		
		//The methods round, sqrt and abs only have one parameter (which is in the brackets).
		//Why does the pow method have 2 parameters? Explain the purpose of these 2 parameters.
		// The two parameters represent the base and the exponent.
		
		System.out.println("\nPart B");
		//Ask the user for any real number and an integer to be input. Display the real number,
		//and its square root. Also determine and display the real number raised to the integer power.
		
		double realNum;
		System.out.println("Type in any real number and press <ENTER>");
		realNum = sc.nextDouble();
		
		double realNum2;
		System.out.println("Great! Now type in an integer and press <ENTER>");
		realNum2 = sc.nextDouble();
		
		//Use suitable headings, displaying the results across the screen.\
		System.out.format("%-25s%-25s%-25s", "Real Number:", "Square Root", "Raised to the Power of: " + realNum2); 
		System.out.format("\n%-25s%-25s%-25s", realNum, Math.sqrt(realNum), (Math.pow(realNum, realNum2)));

				//
				//Eg. If the real number 13.5 nad the integer 2 are input, display
				//REAL NUMBER	SQUARE ROOT		RAISED TO POWER 2 <- display power here
				//   13.5		   3.6742			182.25
				
		//Write down the results produced by your program when the real number 7.8985 and
		//the integer 3 are input.
		/*
		 *Real Number: 7.8985
		 * Square Root of Real Number: 
			2.8104270138183627
		 *Real number raised to the integer power of 3:
			492.75820832162503
		 */
		
		
		//Change your program so that instead of inputting an integer power, a real number
		//power can be input.
		//Write down the results produced by your program when the following are input:
		//a) the number 16 and the real number power 0.5
		//Real Number: 15.0
		//Square Root of Real Number: 
		//3.872983346207417
		//Real number raised to the integer power of 0.5:
		//3.872983346207417

		//b) the number 8 and the real number power 0.33
		//Real Number: 8.0
		//Square Root of Real Number: 
		//2.8284271247461903
		//Real number raised to the integer power of 0.33:
		//1.9861849908740719
		
		//Does your program give a different answer if 0.3333333 is input instead of 0.33 for the power?
		//Yes, the different answer is:
		//Real Number: 8.0
		//Square Root of Real Number: 
		//2.8284271247461903
		//Real number raised to the integer power of 0.3333333:
		//1.9999998613705687
		sc.close();

		
		
		
		
	}

}
