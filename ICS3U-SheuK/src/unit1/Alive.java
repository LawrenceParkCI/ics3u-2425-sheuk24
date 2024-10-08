package unit1;

import java.util.Scanner;

/**
 * Description: This program calculates how long someone has been sleeping for in hours and how long they've been alive in days. 
 * Date: October 7, 2024
 * @author Kate Sheu
 */
public class Alive {
/**
 * Entry point to new program
 * @param args
 */
	public static void main(String[] args) {
		//Write a program, called Alive, that calculates the number of hours of your life that you have spent sleeping. Assume that you sleep 8 hours each night. To simplify the problem, assume that there are 30 days in each month and 365 days in each year. The program output should look similar to:
		Scanner sc = new Scanner(System.in);
		
		// Declaring variables
		int Year1, Month1, Day1;
		// Calculating user input
		System.out.println("Are you intrested in disocvering how long you've been alive for? Or how many hours you've spent sleeping?\nFollow the 2 easy steps below to find out!");
		System.out.println("\nStep 1: Enter your BIRTHDATE ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Lest's start with your birth year!");
		System.out.println("Year: ");
		Year1 = sc.nextInt();
		
		System.out.println("Great job! Now enter what month you were born!");
		System.out.println("Month: ");
		Month1 = sc.nextInt();
		
		System.out.println("Now enter the day of your birth month!");
		System.out.println("Day: ");
		Day1 = sc.nextInt();
		
		// Declaring variables
		System.out.println("Amazing! You're half way there! Now all your have to do is enter todays date!");
		System.out.println("\nStep 2: Enter TODAYS DATE ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		// Calculating user input
		int Year2, Month2, Day2;
		System.out.println("Start by entering the year!");
		System.out.println("Year: ");
		Year2 = sc.nextInt();
		
		System.out.println("Fantastic! Now enter the month");
		System.out.println("Month: ");
		Month2 = sc.nextInt();
		
		System.out.println("Lastly, enter the day!");
		System.out.println("Day: ");
		Day2 = sc.nextInt();
		
		// Calculations
		int alive, slept;
		alive = ((Year2 - Year1)* 365 + (Month2 - Month1)*30 + (Day2 - Day1));
		slept = (alive*8);
	
		System.out.println("Results");
		System.out.println("--------");
		System.out.println("You have been alive for " + alive + " days");
		System.out.println("You have slept for " + slept + " hours");
		System.out.println("Isn't that so cool? Thanks for playing!");
		System.out.println("     .-\"\"\"\"\"\"-.");
		System.out.println("   .'          '.");
		System.out.println("  /   O      O   \\");
		System.out.println(" :                :");
		System.out.println(" |                |");
		System.out.println(" : ',          ,' :");
		System.out.println("  \\  '-......-'  /");
		System.out.println("   '.          .'");
		System.out.println("     '-......-'");

		sc.close();
	}

}
