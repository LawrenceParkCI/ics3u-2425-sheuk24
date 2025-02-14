package unit3;

import java.util.ArrayList;
import java.util.Arrays;

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
		double distance = distance(3, 6, 2, 8);
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

		//Calculating the sum of the array
		int[] intArray = {1, 2, 3, 4, 5};
		int intSum = sum(intArray);
		System.out.println(intSum);

		//Calculating the sum of the array
		double[] doubleArray = {1.5, 2.5, 3.0};
		double doubleSum = sum(doubleArray);
		System.out.println(doubleSum);

		//Calculating the index of the smallest number in the array
		int minIndex = min(intArray);
		System.out.println(minIndex);

		//Calculating the index of the smallest number in the array
		double[] doubleArrayForMin = {5.2, 1.1, 3.7};
		int doubleMinIndex = min(doubleArrayForMin);
		System.out.println(doubleMinIndex);

		//Calculating the largest number in the array 
		int maxIndex = max(intArray);
		System.out.println(maxIndex);

		//Calculating the largest number in the array 
		int doubleMaxIndex = max(doubleArrayForMin);
		System.out.println(doubleMaxIndex);

		//Calculating the difference between the largest and smallest number in the array 
		int bigDiff = bigDifference(intArray);
		System.out.println(bigDiff);

		//Calculating the difference between the largest and smallest number in the array 
		double bigDiffDouble = bigDifference(doubleArrayForMin);
		System.out.println(bigDiffDouble);

		//Calculating the factors of 16
		int[] factors = factors(16);
		System.out.println(Arrays.toString(factors));

		//Calculating the mean of an array
		double[] x = {3, 8.4, 9.6, 10.1};
		System.out.println(mean(x));

		//Calculating the median of an array 
		double[] y = {2,5.8,7,9,1.2,4,6.2};
		System.out.println(median(y));

		//Calculating the mode of an array 
		double[] z = {2.7, 3.2, 7.8, 2.7, 7.8, 7.8, 1.5};
		System.out.println(mode(z));

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

	/**
	 * Adds all the numbers in the array and returns the sum.
	 * @param x The array of numbers to sum.
	 * @return The total sum of the numbers.
	 */
	public static int sum (int [] x)
	{
		int sum = 0; 
		for (int i = 0; i < x.length; i++) {
			sum += x[i]; 
		}

		return sum; 
	}
	/**
	 * Adds all the numbers in the array and returns the sum.
	 * @param y The array of numbers to sum.
	 * @return The total sum of the numbers.
	 */
	public static double sum (double [] y)
	{
		double sum = 0.0; 
		for (int i = 0; i < y.length; i++) {
			sum += y[i]; 
		}

		return sum; 

	}
	/**
	 * Returns the index of where the smallest number in the array is located
	 * @param x The array of numbers 
	 * @return The index of the smallest number in the array
	 */
	public static int min (int [] x)
	{
		int min = 0; 

		for (int i = 1; i < x.length; i++) {
			if (x[i] < x[min]) {
				min = i; 
			}
		}

		return min;

	}
	/**
	 * Returns the index of where the smallest number in the array is located
	 * @param x The array of numbers 
	 * @return The index of the smallest number in the array
	 */
	public static int min (double [] x)
	{
		 int min = 0; 

		    for (int i = 1; i < x.length; i++) {
		        if (x[i] < x[min]) {
		            min = i; 
		        }
		    }

		    return min;
	}

/**
 * Returns the index of where the largest number in the array is located
 * @param x The array of numbers 
 * @return The index of the largest number in the array
 */
public static int max (int [] x)
{
	int max = 0;  

	for (int i = 1; i < x.length; i++) { 
		if (x[i] > x[max]) { 
			max = i; 
		}
	}

	return max;

}
/**
 * Returns the index of where the largest number in the array is located
 * @param x The array of numbers 
 * @return The index of the largest number in the array
 */
public static int max (double [] x)
{
	int max = 0; 

    for (int i = 1; i < x.length; i++) {
        if (x[i] > x[max]) {
            max = i; 
        }
    }

    return max;

}
/**
 * Returns the difference between the largest and smallest numbers in the array
 * @param x The array of numbers 
 * @return The difference between the largest and smallest numbers of x
 */
public static int bigDifference (int [] x)
{
	int max = x[0];  
	int min = x[0];  

	for (int i = 1; i < x.length; i++) { 
		if (x[i] > max) {
			max = x[i]; 
		}
		if (x[i] < min) {
			min = x[i]; 
		}
	}

	int bigDifference = max - min;

	return bigDifference; 

}
/**
 * Returns the difference between the largest and smallest numbers in the array
 * @param x The array of numbers 
 * @return The difference between the largest and smallest numbers of x
 */
public static int bigDifference (double [] x)
{
	double max = x[0];  
	double min = x[0];  

	for (int i = 1; i < x.length; i++) { 
		if (x[i] > max) {
			max = x[i]; 
		}
		if (x[i] < min) {
			min = x[i]; 
		}

	}

	int bigDifference = (int) (max - min);

	return bigDifference;

}
/**
 * Returns an array of all the factors of the given number
 * @param x The number to calculate the factors for
 * @return An array of factors of x
 */
public static int [] factors (int x)
{
	//Calculating the number of factors the variable has 
	int numOfFactors = 0;
	for (int i = 1; i <= x; i++) {
		if (x % i == 0) {
			numOfFactors++;
		}
	}

	//Creating array to store the variables 
	int[] factors = new int[numOfFactors];
	int index = 0;


	for (int i = 1; i <= x; i++) {
		if (x % i == 0) {
			factors[index] = i;
			index++;
		}
	}

	return factors;
}
/**
 * Returns the average of all the numbers in the array
 * @param x The array of numbers 
 * @return The average of x
 */
public static double mean (double [] x)
{
	double sum = 0; 
	for (int i = 0; i < x.length; i++) {
		sum += x[i]; 
	}
	double mean = sum/x.length;

	return mean;
}
/**
 * Returns the median of all the numbers in the array
 * @param x The array of numbers 
 * @return The median of x
 */
public static double median (double [] x)
{
	//Sorting the array in ascending numerical value 
	Arrays.sort(x);
	//Declaring variables 
	int length = x.length;
	int mid = x.length / 2;
	double median;
	//Calculating median if number is even
	if (length%2==0) {
		median = (x[mid - 1] + x[mid]) / 2.0; 
		//Calculating median if number is odd
	} else {
		median = x[mid]; 
	}

	return median; 
}
/**
 * Returns the mode of all the numbers in the array
 * @param x The array of numbers 
 * @return The mode of x
 */
public static double mode (double [] x)
{
	//Sorting the array in ascending numerical value   
	Arrays.sort(x);

	//Declaring variables 
	double mode = x[0];
	int maxCount = 1;      
	int currentNum = 1; 

	//Counting number occurrences 
	for (int i = 1; i < x.length; i++) {
		if (x[i] == x[i - 1]) {
			currentNum++; //Incrementing count for repeated numbers
		} else {
			currentNum = 1; //Reseting count for different number
		}


		if (currentNum > maxCount) {
			maxCount = currentNum;
			mode = x[i]; 
		}
	}

	return mode;
}

}




