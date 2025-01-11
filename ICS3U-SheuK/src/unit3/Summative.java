package unit3;
/**
 * Description: This program runs an interactive hotel management system.
 * Date: Jan 15, 2025
 * @author Kate Sheu
 */
import java.util.Scanner;

public class Summative {

    public static void main(String[] args) {
    	//Introduction
        System.out.println("Welcome to Kate's Hotel Management System!");
        System.out.println("This program will allow you to manage the charges, availability, and prices of hotel rooms.");

        Scanner sc = new Scanner(System.in);

        // Gather hotel-specific information
        System.out.println("Please enter the number of floors in the hotel:");
        int numOfFloors = sc.nextInt();

        System.out.println("Please enter the number of rooms on each floor:");
        int roomsPerFloor = sc.nextInt();

        sc.nextLine(); 

        int totalRooms = numOfFloors * roomsPerFloor;
        boolean[] availability = new boolean[totalRooms];
        String[] guestNames = new String[totalRooms];
        int[] stayDurations = new int[totalRooms];

        // Initialize arrays
        for (int i = 0; i < totalRooms; i++) {
        	// All rooms start as available, no guests, no stay durations
        	availability[i] = true; 
            guestNames[i] = ""; 
            stayDurations[i] = 0; 
        }

        // List Commands
        System.out.println("\nHere is a list of all the commands:");
        System.out.println("R - Reserves/checks in a room\nO - Checks out a room\nF - Finds room details using last name");
        System.out.println("L - List of all rooms in hotel and availability\n# - Display commands");

        //Loops "Enter a command:" until user quits program
        while (true) {
            System.out.println("\nEnter a command:");
            String command = sc.nextLine();

            if (command.equals("#")) {
                System.out.println("R - Reserves/checks in a room\nO - Checks out a room\nF - Finds room details using last name");
                System.out.println("L - List of all rooms in hotel and availability\n# - Display commands");
            } else if (command.equals("R")) {
                checkIn(sc, availability, guestNames, stayDurations);
            } else if (command.equals("O")) {
                checkOut(sc, availability, guestNames, stayDurations);
            } else if (command.equals("F")) {
                findRoomByGuest(sc, guestNames);
            } else if (command.equals("L")) {
                listRooms(availability, guestNames);
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }
    }

    public static void checkIn(Scanner sc, boolean[] availability, String[] guestNames, int[] stayDurations) {
        System.out.println("Please enter the room number (1 - " + availability.length + "):");
        int roomNumber = sc.nextInt() - 1;
        sc.nextLine(); 

        if (roomNumber < 0 || roomNumber >= availability.length) {
            System.out.println("Invalid room number!");
        } else if (!availability[roomNumber]) {
            System.out.println("Room is already occupied!");
        } else {
            System.out.println("Please enter the guest's last name:");
            String guestName = sc.nextLine();

            System.out.println("Please enter the length of stay (in days):");
            int stayDays = sc.nextInt();
            sc.nextLine(); 

            availability[roomNumber] = false; 
            guestNames[roomNumber] = guestName;
            stayDurations[roomNumber] = stayDays;

            System.out.println("Guest " + guestName + " has been checked into room " + (roomNumber + 1) + ".");
        }
    }

    public static void checkOut(Scanner sc, boolean[] availability, String[] guestNames, int[] stayDurations) {
        System.out.println("Please enter the room number (1 - " + availability.length + "):");
        int roomNumber = sc.nextInt() - 1;
        sc.nextLine(); 

        if (roomNumber < 0 || roomNumber >= availability.length) {
            System.out.println("Invalid room number!");
        } else if (availability[roomNumber]) {
            System.out.println("Room is already empty!");
        } else {
            availability[roomNumber] = true; 
            guestNames[roomNumber] = "";
            stayDurations[roomNumber] = 0;

            System.out.println("Room " + (roomNumber + 1) + " has been checked out.");
        }
    }

    public static void findRoomByGuest(Scanner sc, String[] guestNames) {
        System.out.println("Please enter the guest's last name:");
        String guestName = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < guestNames.length; i++) {
            if (guestNames[i].equalsIgnoreCase(guestName)) {
                System.out.println("Guest " + guestName + " is in room " + (i + 1) + ".");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No guest found with that name.");
        }
    }

    public static void listRooms(boolean[] availability, String[] guestNames) {
        for (int i = 0; i < availability.length; i++) {
            String status;
            if (availability[i]) {
                status = "Available";
            } else {
                status = "Occupied by " + guestNames[i];
            }
            System.out.println("Room " + (i + 1) + ": " + status);
        }
    }
}
