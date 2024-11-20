package unit1;

import java.text.NumberFormat;
import java.util.Scanner;
/**
 * Description: This program prints the NPOutput worksheet
 * Date: October 17,2024
 * @author Kate Sheu
 */
public class NFOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double TAX_RATE = 0.13;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		System.out.println("The cost of your item with tax is " + money.format(total));
		System.out.println("The tax rate is " + percent.format(TAX_RATE));
		
		//How can you change how your value is displayed?
		//The value displayed changes depending on what comes after NumberFormat 
		//I can then use x.format() with any format of my choice
		
		//What other formats does NumberFormat offer?
		//NumberFormat.getIntegerInstance()
		//This format converts value into an integer in the default format locale
		
		//NumberFormat.getCompactNumberInstance()
		//Returns compact number format with default format locale with short format style
		
		//NumberFormat.getNumberInstance()
		//Returns general purpose number format for the current default number locale
		
		//NumberFormat.getInstance()
		//Returns the number purpose instance for general purpose number formatting
		
		sc.close();
	}

}
