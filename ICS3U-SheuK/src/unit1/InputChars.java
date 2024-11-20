package unit1;

import java.util.Scanner;

/**
 * Description: InputChars worksheet
 * Date: October 3, 2024
 * @author Kate Sheu
 */
public class InputChars {
/**
 * Entry point to new program.
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Declare variables
		
		char ch1, ch2, ch3;
		//Getting use input
		System.out.println("Type in any three characters on the keyboard");
		System.out.println("Press <Enter> after each.");
		ch1 = sc.nextLine().charAt(0);
		ch2 = sc.nextLine().charAt(0);
		ch3 = sc.nextLine().charAt(0);
		
		//Printing output
		System.out.println();
		System.out.println("Together the 3 letters spell:" + (ch1 + ch2 + ch3));
		sc.close();
	}

}
