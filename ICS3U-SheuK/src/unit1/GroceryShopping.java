package unit1;

import java.util.Scanner;

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
		
		//printing receipt
		System.out.println("\nHere is your receipt:");
		System.out.println("\nMs.Sheu's Grocery");//date and time need to be added
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.printf("%-20s%-20s%-20s%-20s%-20s", "|Item", "|Price", "|Quant.","|Total Price", "|");
		System.out.println("\n|-------------------------------------------------------------------------------|");
		System.out.printf("%-1s%-19s%-3s%-17s%-1s%-19s%-3s%-17s%-1s", "|", item1, "| $", cost1, "|", quantity1, "| $", cost1* quantity1, "|");
		System.out.printf("\n%-1s%-19s%-3s%-17s%-1s%-19s%-3s%-17s%-1s", "|", item2, "| $", cost2, "|", quantity2, "| $", cost2* quantity2, "|");
		System.out.println("\n|-------------------------------------------------------------------------------|");
		System.out.printf("%80s","Subtotal");
		sc.close();

	}

}
