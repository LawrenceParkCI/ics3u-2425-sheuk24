package unit3;

/**
 * Description: This program includes different MathPlus methods. 
 * Date: December 17, 2024
 * @author Kate Sheu
 */


public class MathPlus {
	/**
	 * Entry point to new program
	 * Demonstrates the use of MathPlus methods: distance, hypotenuse, numOfFactors, and isPrime
	 * @param args
	 */

	public static void main(String[] args) {
		// Calculating the distance between points (3, 6) and (2, 8)
		double distance = distance(3, 6, 2, 8 );
		System.out.println(distance);

		// Calculating the hypotenuse of a triangle with sides 2 and 4
		double hypotenuse = hypotenuse(2, 4);
		System.out.println(hypotenuse);

		// Finding the number of factors of 24
		int numOfFactors = numOfFactors(24);
		System.out.println(numOfFactors);

		// Checking if 19 is a prime number
		boolean isPrime = isPrime(19);
		System.out.println(isPrime);

	}

	/**
	 * Calculates the distance between two points.
	 * @param x1 x-value of the first coordinate 
	 * @param y1 y-value of the first coordinate 
	 * @param x2 x-value of the second coordinate
	 * @param y2 y-value of the second coordinate
	 * @return distance between the two points
	 */
	public static double distance( int x1, int y1, int x2, int y2 )
	{

		double distance = Math.sqrt(Math.pow(y2-y1,2)+ Math.pow(x2-x1,2));
		return distance;
	}

	/**
	 * Calculates the hypotenuse of a right triangle given the lengths of two sides.
	 * @param x Length of the first side
	 * @param y Length of the second side
	 * @return Length of the hypotenuse
	 */

	public static double hypotenuse( double x, double y )
	{
		double hypotenuse = Math.sqrt(Math.pow(x,2)+ Math.pow(y, 2));
		return hypotenuse;

	}

	/**
	 * Calculates the number of factors of a given number.
	 * @param x The number to calculate factors for
	 * @return Number of factors of the given number
	 */
	public static int numOfFactors(int x)
	{
		int numOfFactors = 0; 
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) { 
				numOfFactors++; 
			}
		}
		return numOfFactors;

	}

	/**
	 * Determines if a number is prime.
	 * @param number The number to check
	 * @return true if the number is prime, false otherwise
	 */
	static boolean isPrime (int number)
	{
		boolean isPrime = true;
		if (number <= 1) 
			isPrime = false;

		for (int i = 2; i <= Math.sqrt(number); i++)
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		return isPrime;

	}
}