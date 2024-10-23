package unit1;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Description: This program allows users to input their grocery order and prints a receipt to go with it.
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
		//Printing logo
				System.out.println("\n             ⠈⠛⠻⠶⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀ ");
				System.out.println("              ⠀⠀⠀⠀ ⠈⢻⣆⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀  ⠀  ");
				System.out.println("              ⠀⠀⠀⠀⠀⠀⠀⢻⡏⠉⠉⠉⠉⢹⡏⠉⠉⠉⠉⣿⠉⠉⠉⠉⠉⣹⠇⠀⠀⠀  ");
				System.out.println("           ⠀   ⠀⠀⠀⠀⠀⠀⠈⣿⣀⣀⣀⣀⣸⣧⣀⣀⣀⣀⣿⣄⣀⣀⣀⣠⡿⠀⠀⠀⠀");
				System.out.println("           ⠀⠀   ⠀⠀⠀⠀⠀⠀⠸⣧⠀⠀⠀⢸⡇⠀⠀⠀⠀⣿⠁⠀⠀⠀⣿⠃⠀⠀⠀");
				System.out.println("           ⠀⠀⠀   ⠀⠀⠀⠀⠀⠀⢹⣧⣤⣤⣼⣧⣤⣤⣤⣤⣿⣤⣤⣤⣼⡏⠀⠀⠀⠀⠀");
				System.out.println("           ⠀⠀⠀   ⠀⠀⠀ ⠀⠀⠀⠀⢿⠀⠀⢸⡇⠀⠀⠀⠀⣿⠀⠀⢠⡿⠀⠀⠀⠀⠀⠀");
				System.out.println("          ⠀⠀⠀⠀   ⠀⠀⠀⠀⠀  ⠀⢸⣷⠤⠼⠷⠤⠤⠤⠤⠿⠦⠤⠾⠃⠀⠀⠀⠀⠀⠀");
				System.out.println("            ⠀⠀⠀   ⠀⠀⠀⠀⠀⠀⢀⣾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
				System.out.println("             ⠀⠀⠀   ⠀⠀⠀⠀⠀⠀⢾⣷⢶⣶⠶⠶⠶⠶⠶⠶⣶⠶⣶⡶⠀⠀⠀");
				System.out.println("            ⠀⠀⠀⠀⠀⠀   ⠀⠀⠀⠸⣧⣠⡿⠀⠀⠀⠀⠀⠀⢷⣄⣼⠇⠀⠀⠀⠀⠀⠀⠀");
				
		
		//Declaring variables.
		String item1, item2;
		double cost1, cost2;
		int quantity1, quantity2;
		final double taxRate = 0.13;
		
		//Formatting.
		DecimalFormat money = new DecimalFormat ("0.00");
		
		//Getting user input for item 1.
		System.out.println("\nWelcome to Ms. Sheu's Grocery! Please press ENTER after answering each question!");
		System.out.print("\nWhat would you like to buy? ");
		item1 = sc.nextLine();
		System.out.print("Sounds great! How much does it cost? $");
		cost1 = sc.nextDouble();
		System.out.print("How many would you like? ");
		quantity1 = sc.nextInt();
		sc.nextLine();
		
		//Getting user input for item 2.
		System.out.print("\nWhat is the second item you would like to buy? ");
		item2 = sc.nextLine();
		System.out.print("Amazing! How much does it cost? $");
		cost2 = sc.nextDouble();
		System.out.print("How many would you like? ");
		quantity2 = sc.nextInt();
		System.out.println("Sounds delicious!");
		
		//Getting Date and Time.
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy HH:mm");
		String formattedDateTime = now.format(formatter);
		
		//Calculations.
		double totalCost1 =  cost1*quantity1;
		double totalCost2 = cost2*quantity2;
		
		
		
		//Printing receipt
		System.out.println("\nHere is your receipt:\n");
		
		
		//Formatting Title
		String title = "Ms. Sheu's Grocery";
		int totalWidth = 40;
		int padding = (totalWidth - title.length())/2;
		String centeredTitle = String.format("%" + padding + "s%s%" + padding + "s", "", title, "");
		System.out.println(centeredTitle);
		System.out.println("...........................................");


		
		//Printing output
		System.out.println(formattedDateTime);
		System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
		System.out.println("|-----------------------------------------|");
		System.out.printf("%-10s%-10s%-10s%-10s%-10s", "|Item", "|Price", "|Quant.","|Total Price", "|");
		System.out.println("\n|-----------------------------------------|");
		System.out.printf("%-1s%-9s%-3s%-7s%-1s%-9s%-3s%-9s%-1s", "|", item1, "| $", cost1, "|", quantity1, "| $", money.format(totalCost1), "|");
		System.out.printf("\n%-1s%-9s%-3s%-7s%-1s%-9s%-3s%-9s%-1s", "|", item2, "| $", cost2, "|", quantity2, "| $", money.format(totalCost2), "|");
		System.out.println("\n|-----------------------------------------|");
		
		double subTotal = totalCost1 + totalCost2;
		System.out.printf("%-1s%31s%10s%1s","|", "Subtotal: $", money.format(subTotal), "|");
		
		double taxPrice = taxRate*subTotal;
		System.out.printf("\n%-1s%31s%10s%1s","|", "Tax: $", money.format(taxPrice), "|");
		
		double total = subTotal + taxPrice;
		System.out.printf("\n%-1s%31s%10s%1s","|", "Total: $", money.format(total), "|");
		System.out.println("\n|-----------------------------------------|");
		System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
		System.out.println("\nThis is approximately $" + Math.round(total) + ".");
		
		//Challenge #1
		System.out.println("The total rounded to the nearest dollar is: $" + money.format(Math.round(total)));
		
		//Challenge #2
		total = (Math.round(total*20)/20.00);
		System.out.println("The total rounded to the nearest 5 cents is: $" + money.format(total));
		
		System.out.println("\nThank you for shopping at Ms. Sheu's Grocery!\nHave a great day!");
		sc.close();
		

	}

}
