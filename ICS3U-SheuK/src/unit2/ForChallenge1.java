package unit2;

import java.util.Scanner;

/**
Description: This program prints the ForChallenge work sheet
Date: November 26, 2024
@author Kate Sheu
*/

public class ForChallenge1 {
  public static void main(String[] args) {
    /*
      Create a program that asks for the starting number, the ending number, and how much you should count by. Then print out the numbers using a for loop.  You should be able to count by decimals.
      ie.

      Starting Num: 
        0
      Ending Num: 
        1
      Count by: 
        0.1
      Result: 
        0 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 1.0
    */
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a starting number:");
	int startNum = sc.nextInt();
	System.out.println("Please enter a ending number:");
	int endNum = sc.nextInt();
	System.out.println("Please enter what number you would like to count by:");
	double increment = sc.nextDouble();
	
	for (double num = startNum; num <= endNum; num += increment) {
	      System.out.printf("%.1f", num);
	    }
	sc.close();
  }
}