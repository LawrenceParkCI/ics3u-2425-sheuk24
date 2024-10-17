package unit1;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Description: This program prints the DFOutput work sheet
 * Date: October 17, 2024
 * @author Kate Sheu
 */

public class DFOutput {
/** 
 * Entry point to new program
 * @param args
 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Run the following program with a cost of 10.00.
		//What value is displayed in the output?
		//"The cost of your item with tax is 11.3" is printed

		final double TAX_RATE = 0.13;
		DecimalFormat money = new DecimalFormat("$#,###,##0.00");
		DecimalFormat percent = new DecimalFormat("#.#%");

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		
		System.out.println("The cost of your item with tax is " + money.format(total));
		

		//Change the above print statement on line 19 to:
		//System.out.println("The cost of your item with tax is " + money.format(total));
		//Run the program again, how is the output different? Why?
		//The output changed because the money.format function transforms numerical values into currency 
		
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.00"
		//Run the program again with the cost of 10, how is the output different?
		//It prints a dollar sign in front of 11.30 as the new output
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Run the program again with the cost of 10, how is the output different?
		//The cost of your item with tax is $11.3. This is different because a decimal point was lost.
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Calculate 10.50 x 1.13 = 11.865
		//Run the program again with the cost of 10.50, what is happening?
		//The program rounded to the hundredth decimal point to follow a currency format
		
		//Modify the parameter for the DecimalFormat on line 15 as you think is appropriate for money.
		//Run the program again with the cost of 123456, what is displayed?
		//The cost of your item with tax is $139505.28 is displayed 
		//I did not modify the parameter because I think 2 decimal points is appropriate for currency. 

		
		//Modify the parameter for the DecimalFormat on line 15 to be "$#,###,##0.00"
		//Run the program again with the cost of 123456, how is the output different? Explain what is happening.
		//The cost of your item with tax is $139,505.28 is printed
		//This is different as commas are displayed every 3 digits
		
		
		//Uncomment the following print line, and run the program with any value for the cost.
		//What value is printed for the TAX_RATE?
		//I inputed 10.00, the value printed for "tax rate" is 0.13
		System.out.println("The tax rate is " + TAX_RATE);
		
		//Change the above print statement to format the TAX_RATE using the percent DecimalFormat instance.
		//Run the program again with any cost, how is the TAX_RATE displayed differently? 
		//The tax rate is 13% is displayed. It is different because it is displayed as a percent rather than a decimal.
		System.out.println("The tax rate is " + percent.format(TAX_RATE));
		
		sc.close();
	}

}
