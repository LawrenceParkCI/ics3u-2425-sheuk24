package unit1;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Description
 * Date: October 18, 2024
 * @author Kate Sheu
 */

public class GroceryShopping {
	/**
	 * Entry point to new program
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("|| $$$ \\\\\\ ========== \"Ms. Sheu's Grocery\" ========== /// $$$ ||");
		
		//declaring variables
		String item1, item2;
		double cost1, cost2;
		int quantity1, quantity2;
		
		//Formating
		DecimalFormat money = new DecimalFormat ("0.00");
		
		//getting user input for item 1
		System.out.println("\nWelcome to Ms. Sheu's Grocery! Please press ENTER after answering each question!");
		System.out.print("What would you like to buy? ");
		item1 = sc.nextLine();
		System.out.print("Sounds great! How much does it cost? $");
		cost1 = sc.nextDouble();
		System.out.print("How many would you like? ");
		quantity1 = sc.nextInt();
		sc.nextLine();
		
		//getting user input for item 2
		System.out.print("\nWhat is the second item you would like to buy? ");
		item2 = sc.nextLine();
		System.out.print("Amazing! How much does it cost? $");
		cost2 = sc.nextDouble();
		System.out.print("How many would you like? ");
		quantity2 = sc.nextInt();
		System.out.println("Sounds delicious!");
		
		//Getting Date and Time
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy HH:mm");
		String formattedDateTime = now.format(formatter);
		
		//Calculations for Subtotal
		double totalCost1 =  cost1*quantity1;
		double totalCost2 = cost2*quantity2;
		
		//Calculating Tax 
		final double taxRate = 0.13;
		
		//printing receipt
		System.out.println("\nHere is your receipt:\n");
		
		//Formatting Title
		String title = "Ms. Sheu's Grocery";
		int totalWidth = 40;
		int padding = (totalWidth - title.length())/2;
		String centeredTitle = String.format("%" + padding + "s%s%" + padding + "s", "", title, "");
		System.out.println(centeredTitle);
		
		System.out.println(formattedDateTime);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.printf("%-10s%-10s%-10s%-10s%-10s", "|Item", "|Price", "|Quant.","|Total Price", "|");
		System.out.println("\n|-----------------------------------------|");
		System.out.printf("%-1s%-9s%-3s%-7s%-1s%-9s%-3s%-9s%-1s", "|", item1, "| $", cost1, "|", quantity1, "| $", cost1* quantity1, "|");
		System.out.printf("\n%-1s%-9s%-3s%-7s%-1s%-9s%-3s%-9s%-1s", "|", item2, "| $", cost2, "|", quantity2, "| $", cost2* quantity2, "|");
		System.out.println("\n|-----------------------------------------|");
		
		double subTotal = totalCost1 + totalCost2;
		System.out.printf("%-1s%31s%10s%1s","|", "Subtotal: $", money.format(subTotal), "|");
		
		double taxPrice = taxRate*subTotal;
		System.out.printf("\n%-1s%31s%10s%1s","|", "Tax: $", money.format(taxPrice), "|");
		
		double total = subTotal + taxPrice;
		System.out.printf("\n%-1s%31s%10s%1s","|", "Tax: $", money.format(total), "|");
		System.out.println("\n|-----------------------------------------|");
		System.out.println("Thankyou for shopping have a gr");
		sc.close();
		

	}

}
