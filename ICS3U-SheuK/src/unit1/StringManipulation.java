package unit1;

import java.util.Scanner;

/**
 * Description: The program takes a sentence and uses the sentence to reprint as upper case, lower case, and calculates the length and certain indexes of the sentence.
 * Date: October 7, 2024
 * @author Kate Sheu
 */
public class StringManipulation {
/**
 * Entry point to new program
 * @param args
 */
	public static void main(String[] args) {
		//Declaring variables
		Scanner sc = new Scanner(System.in);
		String sentence;
		System.out.println("Enter a sentence of your choice and press <enter>");
		sentence = sc.nextLine();
		
		//Getting user input 
		System.out.println("\nYour sentence:");
		System.out.println(sentence);
		
		//Calculating user input
		System.out.println("\nHere's your sentence in all UPPERCASE!");
		System.out.println(sentence.toUpperCase());
		System.out.println("\nHere's your sentence in all lowercase!");
		System.out.println(sentence.toLowerCase());
		System.out.println("\nHere's the length of your sentence!");
		System.out.println(sentence.length());
		System.out.println("\nHere is the character at index 5 of your sentence!");
		System.out.println(sentence.charAt(5));
		
		sc.close();

	}

}
