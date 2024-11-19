package unit2;

import java.util.Scanner;

/**
 * Description: This program prints the NameGame worksheet
 * Date: November 19, 2024
 * @author Kate Sheu
 */
public class NameGame {

	public static void main(String[] args) {
		/*
		 * The application should prompt the user for their name. 
		 * 70% of the time the program should output that the user's name is their favourite, 
		 * and 30% of the time says they hate that name.
		 * */
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your name:");
	sc.nextLine();
	
	//declaring variables
	int userPercentage = (int)(Math.random()*10);
	if (userPercentage<=7) {
		System.out.println("Your name is my favourite!");
    } else {
      System.out.println("I hate that name.");
    }
	
	sc.close();


	}

}
