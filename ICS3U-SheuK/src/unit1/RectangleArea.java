package unit1;

import java.util.Scanner;

/**
 * Description: RectangleArea worksheet
 * Date: October 2, 2024
 * @author Kate Sheu
 */
public class RectangleArea {
/**
 * Entry point to program
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// Declare variables
		int length, width, depth;
		
		// Get user input
		System.out.println("AREA PROGRAM");
		System.out.println("Type in the length of the rectangle and <ENTER>");
		length = sc.nextInt();
		
		System.out.println("Type in the width of the rectangle and <ENTER>");
		width = sc.nextInt();
		
		System.out.println("Type in the depth of the rectangle and <ENTER>");
		depth = sc.nextInt();
		
		// calculate the area 
		int area = length * width;
				
		//calculate the volume
		int volume = length *width *depth;
		
		//print the output
		System.out.println("The area of your rectangle is" + area);
		System.out.println("The volume of your rectangle is" + volume);
		sc.close();

	}

}
