package unit1;

import java.util.Scanner;

/**
 * Description: String Variable Worksheet
 * Date: October 2, 2024
 * @author Kate Sheu
 */
public class MakeLabels {
	/**
	 * Entry point into the program
	 * @param args
	 */

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	String subject;
	System.out.println("Type in the subject and press <Enter>");
	subject = sc.nextLine();
	
	String name;
	System.out.println("Type in your name and press <Enter>");
	name = sc.nextLine();
	
	System.out.println();
	System.out.println("******************************");
	System.out.println(subject);
	System.out.println(name);
	System.out.println("******************************");
	sc.close();

	}

}
