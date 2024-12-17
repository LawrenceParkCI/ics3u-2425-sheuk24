package unit3;

/**
 * Description: This program includes different MathPlus methods. 
 * Date: December 17, 2024
 * @author Kate Sheu
 */


public class MathPlus {
	/**
	 * Entry point to new program
	 * @param args
	 */

	public static void main(String[] args) {
		//Distance
		double distance = distance(3, 6, 2, 8 );
		System.out.println(distance);
		//Hypotenuse
		double hypotenuse = hypotenuse(2, 4);
		System.out.println(hypotenuse);
		//Number of Factors 
		int numOfFactors = numOfFactors(24);
		System.out.println(numOfFactors);
		//Prime
		boolean isPrime = isPrime (19);
		System.out.println(isPrime);
		
	}

	/**
		 This program return the distance between 2 points
		 @param x1 -> x-value of first coordinate 
		 @param y1 -> y-value of first coordinate 
		 @param x2 -> x-value of second coordinate
		 @param y2 -> y-value of second coordinate
		 @return distance
	 */
	public static double distance( int x1, int y1, int x2, int y2 )
	{

		double distance = Math.sqrt(Math.pow(y2-y1,2)+ Math.pow(x2-x1,2));
		return distance;
	}

	/**
	 This program returns the hypotenuse of a triangle
	 after a user inputs 2 values 
	 @param x -> x-value of first side length 
	 @param y -> y-value of second side length 
	 @return hypotenuse
	 */

	public static double hypotenuse( double x, double y )
	{
		double hypotenuse = Math.sqrt(Math.pow(x,2)+ Math.pow(y, 2));
		return hypotenuse;

	}

	/**
	 This program returns the number of factors of the given number 
	 @param x -> value of given number 
	 @return number of factors of given number
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
	 This program returns true if the number given is prime, false otherwise.
	 @param x -> value of given number 
	 @return true or false
	 */
	public static boolean isPrime (int number)
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