package unit3;
/**
 * Description: This program runs an interactive hotel management system.
 * Date: Jan 15, 2025
 * @author Kate Sheu
 */
import java.util.Scanner;

public class Summative {
	public static void main(String[] args) {
		System.out.println("Welcome to Kate's Hotel Management System!");
		System.out.println("This program will allow you to manage the charges, availability, and prices of hotel rooms.");
		System.out.println("Let's start by gathering some general information about your hotel!");

		// Declare Variables 
		int numOfFloors;
		int roomsPerFloor;
		String command;

		//Declare Arrays 
		String[] roomTypes; 

		// Scanner for user input
		Scanner sc = new Scanner(System.in);

		// Gather hotel-specific information
		System.out.println("Please enter the number of floors in the hotel:");
		numOfFloors = sc.nextInt();

		System.out.println("Please enter the number of rooms on each floor:");
		roomsPerFloor = sc.nextInt();

		sc.nextLine(); 

		// Initialize the roomTypes array
		roomTypes = new String[numOfFloors];

		// Gather user information
		for (int i = 0; i < numOfFloors; i++) {
			System.out.println("Please specify the room type for floor " + (i + 1) + " (single, double, suite):");
			String roomType = sc.nextLine();

			if (roomType.equals("single") || roomType.equals("double") || roomType.equals("suite")) {
				roomTypes[i] = roomType; 
			} else {
				System.out.println("Invalid room type. Please enter single, double, or suite.");
				i--; // Repeat the current floor
			}
		}

		

		// Output the results
		System.out.println("\nHotel Summary:");
		System.out.println("Total # of Floors: " + numOfFloors);
		System.out.println("Total # of rooms on each floor: " + roomsPerFloor);
		for (int i = 0; i < numOfFloors; i++) {
			System.out.println("Floor " + (i + 1) + ": " + roomTypes[i] + " rooms");
		}

		//List Commands
		System.out.println("\nHere is a list of all the commands: ");
		System.out.println("R - Reserves/checks in a room\nO - Checks out a room\nF - Finds room details using last name");
		System.out.println("L - List of all rooms in hotel and availbility\nB - Display bill\nRC - Reset all rooms in hotel\nC - Add additional charges\n# - Display commands");

		// take user input for command
		System.out.println("\nEnter a command:");
		command = sc.nextLine();
		
		//If user inputs "#"
		if (command.equals("#")) {
			System.out.println("R - Reserves/checks in a room\nO - Checks out a room\nF - Finds room details using last name");
			System.out.println("L - List of all rooms in hotel and availbility\nB - Display bill\nRC - Reset all rooms in hotel\nC - Add additional charges\n# - Display commands");
		//If user inputs "R"
		} else if (command.equals("R")) {
			System.out.println("Please enter room number:");
			System.out.println("Please enter last name:");
			System.out.println("Please enter length of intended stay: ");
		//If user inputs "O"
		} else if (command.equals("O")) {
		
		//If user inputs "F"	
		} else if (command.equals("F")) {
			
		//If user inputs "L"
		} else if (command.equals("L")) {
			
		//If user inputs "B"
		} else if (command.equals("B")) {
			
		//If user inputs "RC"
		} else if (command.equals("RC")) {
			
		//If user inputs "C"
		} else if (command.equals("C")) {
			
		//If invalid command
		} else {
			System.out.println("Sorry that is not a valid command.");
		}
		
		//Method for checking in 
		/**
		 * Checks guest into a specific room in hotel, records room number, room type, intended length of stay and last name 
		 * @param roomNum the room number of command 
		 * @param stayDays intended length of stay 
		 * @param lastName the last name of guest 
		 * @param roomType type of room of command 
		 */
		//public static void checkIn (int roomNum, int stayDays, string lastName, string roomType)
		{
			
		}
		
		//Method for checking out
		/**
		 * Changes availability in room from occupied to available 
		 * @param roomNum 
		 * @param lastName 
		 */
		//public static void checkOut (int roomNum, string lastName)
		{
			
		}

		
		sc.close();
		
		

	}
}
