package unit1;

import java.util.Scanner;

/**
 * Description: The program calculates the cost to carpet a room by using the length and width of the room and the cost per square meter of the carpet. 
 * Date: October 8, 2024
 * @author Kate Sheu
 */
public class Carpet {
/**
 * Entry point to new program
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// Declare variables
		double length, width, cost;
		
		//Getting user input
		System.out.println("COST TO CARPET");
		System.out.println("Type in the length of the room in METERS and press <ENTER>");
		length = sc.nextDouble();
		
		System.out.println("Type in the width of the room in METERS and press <ENTER>");
		width = sc.nextDouble();
		
		System.out.println("Type in the cost of the carpet PER SQUARE METER and press <ENTER>");
		cost = sc.nextDouble();
		
		//Calculate the area of the room in square meters
		double totalCost = length * width * cost;
		
		//print the output
		System.out.format("The cost to carpet your room will be: $%.2f",totalCost);
		sc.close();
		
	}

}
