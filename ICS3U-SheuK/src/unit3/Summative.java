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

        // Room type and price setup for each floor
        String[] floorRoomTypes = new String[numOfFloors];
        double[] floorRoomPrices = new double[numOfFloors];

        for (int i = 0; i < numOfFloors; i++) {
            System.out.println("Enter the type of rooms on floor " + (i + 1) + " (Single, Double, Suite):");
            String roomType = sc.nextLine().trim();

            // Validate room type input
            while (!roomType.equalsIgnoreCase("Single") &&
                    !roomType.equalsIgnoreCase("Double") &&
                    !roomType.equalsIgnoreCase("Suite")) {
                System.out.println("Invalid room type. Please enter 'Single', 'Double', or 'Suite':");
                roomType = sc.nextLine();
            }
            floorRoomTypes[i] = roomType;
        }

        // Set prices for room types
        System.out.println("Enter the price per night for Single rooms:");
        double singlePrice = sc.nextDouble();
        System.out.println("Enter the price per night for Double rooms:");
        double doublePrice = sc.nextDouble();
        System.out.println("Enter the price per night for Suite rooms:");
        double suitePrice = sc.nextDouble();
        sc.nextLine(); 

        double[] prices = {singlePrice, doublePrice, suitePrice};

        // Initialize 
        int totalRooms = numOfFloors * roomsPerFloor;
        boolean[] availability = new boolean[totalRooms];
        String[] guestNames = new String[totalRooms];
        int[] stayDurations = new int[totalRooms];
        double[] additionalCharges = new double[totalRooms];

        for (int i = 0; i < totalRooms; i++) {
            availability[i] = true;
            guestNames[i] = "";
            stayDurations[i] = 0;
            additionalCharges[i] = 0.0;
        }

        // List Commands
        System.out.println("\nHere is a list of all the commands:");
        System.out.println("R - Reserves/checks in a room\nO - Checks out a room\nF - Finds room details using last name");
        System.out.println("L - List of all rooms in hotel and availability\nA - Add additional charges to a room");
        System.out.println("P - Print bill for a room\n# - Display commands\nQ - Quit program");

        // Command loop
        while (true) {
            System.out.println("\nEnter a command:");
            String command = sc.nextLine();

            if (command.equals("#")) {
                System.out.println("R - Reserves/checks in a room\nO - Checks out a room\nF - Finds room details using last name");
                System.out.println("L - List of all rooms in hotel and availability\nA - Add additional charges to a room");
                System.out.println("P - Print bill for a room\n# - Display commands");
            } else if (command.equals("R")) {
                checkIn(sc, availability, guestNames, stayDurations);
            } else if (command.equals("O")) {
                checkOut(sc, availability, guestNames, stayDurations, floorRoomPrices, additionalCharges, roomsPerFloor);
            } else if (command.equals("F")) {
                findRoomByGuest(sc, guestNames);
            } else if (command.equals("L")) {
                listRooms(availability, guestNames, floorRoomTypes, roomsPerFloor);
            } else if (command.equals("A")) {
                addAdditionalCharges(sc, additionalCharges);
            } else if (command.equals("P")) {
                printBill(sc, stayDurations, floorRoomPrices, additionalCharges, roomsPerFloor);
            } else if (command.equals("Q")) {
                System.out.println("Thanks for using Kate's Hotel Management System!");
                break; // Exit the loop
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }
    }
    /**
     * Checks users into a hotel room and stores room number, guest's last name, and duration of stay.
     * @param sc Scanner object for user input
     * @param availability Array indicating whether rooms are available (true) or occupied (false)
     * @param guestNames Array storing the names of the guests in each room
     * @param stayDurations Array storing the duration of stay (in days) for each room
     */
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
   
    /**
     * Checks a guest out of a hotel room, calculates and prints the bill, and resets room data.
     * @param sc Scanner object for user input
     * @param availability Array indicating whether rooms are available (true) or occupied (false)
     * @param guestNames Array storing the names of the guests in each room
     * @param stayDurations Array storing the duration of stay (in days) for each room
     * @param floorRoomPrices Array storing room prices per floor
     * @param additionalCharges Array storing additional charges for each room
     * @param roomsPerFloor Number of rooms on each floor
     */
    public static void checkOut(Scanner sc, boolean[] availability, String[] guestNames, int[] stayDurations,
                                double[] floorRoomPrices, double[] additionalCharges, int roomsPerFloor) {
        System.out.println("Please enter the room number (1 - " + availability.length + "):");
        int roomNumber = sc.nextInt() - 1;
        sc.nextLine();

        if (roomNumber < 0 || roomNumber >= availability.length) {
            System.out.println("Invalid room number!");
        } else if (availability[roomNumber]) {
            System.out.println("Room is already empty!");
        } else {
            printBill(sc, stayDurations, floorRoomPrices, additionalCharges, roomsPerFloor);
            availability[roomNumber] = true;
            guestNames[roomNumber] = "";
            stayDurations[roomNumber] = 0;
            additionalCharges[roomNumber] = 0.0;

            System.out.println("Room " + (roomNumber + 1) + " has been checked out.");
        }
    }

    /**
     * Finds and displays the room number occupied by a guest with a specified last name.
     * @param sc Scanner object for user input
     * @param guestNames Array storing the names of the guests in each room
     */
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

    /**
     * Lists all rooms in the hotel, their type, and availability status.
     * @param availability Array indicating whether rooms are available (true) or occupied (false)
     * @param guestNames Array storing the names of the guests in each room
     * @param floorRoomTypes Array storing room types for each floor (e.g., Single, Double, Suite)
     * @param roomsPerFloor Number of rooms on each floor
     */
    public static void listRooms(boolean[] availability, String[] guestNames, String[] floorRoomTypes, int roomsPerFloor) {
        for (int i = 0; i < availability.length; i++) {
            int floor = i / roomsPerFloor;
            String roomType = floorRoomTypes[floor];
            String status = availability[i] ? "Available" : "Occupied by " + guestNames[i];
            System.out.println("Room " + (i + 1) + " (Type: " + roomType + "): " + status);
        }
    }

    /**
     * Adds additional charges to a specified room.
     * @param sc Scanner object for user input
     * @param additionalCharges Array storing additional charges for each room
     */
    public static void addAdditionalCharges(Scanner sc, double[] additionalCharges) {
        System.out.println("Please enter the room number (1 - " + additionalCharges.length + "):");
        int roomNumber = sc.nextInt() - 1;
        sc.nextLine();

        if (roomNumber < 0 || roomNumber >= additionalCharges.length) {
            System.out.println("Invalid room number!");
        } else {
            System.out.println("Enter the additional charge amount:");
            double charge = sc.nextDouble();
            sc.nextLine();

            additionalCharges[roomNumber] += charge;
            System.out.println("Additional charge of $" + charge + " added to room " + (roomNumber + 1) + ".");
        }
    }

    /**
     * Calculates and prints the total bill for a specified room based on the stay duration,
     * room rate, and any additional charges.
     * @param sc Scanner object for user input
     * @param stayDurations Array storing the duration of stay (in days) for each room
     * @param floorRoomPrices Array storing room prices per floor
     * @param additionalCharges Array storing additional charges for each room
     * @param roomsPerFloor Number of rooms on each floor
     */
    public static void printBill(Scanner sc, int[] stayDurations, double[] floorRoomPrices, double[] additionalCharges, int roomsPerFloor) {
        int totalRooms = floorRoomPrices.length * roomsPerFloor; // Calculate total rooms once

        System.out.println("Please enter the room number (1 - " + totalRooms + "):");
        int roomNumber = sc.nextInt(); // No -1 here; assume user inputs 1-based room numbers
        sc.nextLine(); // Consume newline

        // Validate room number based on totalRooms
        if (roomNumber < 1 || roomNumber > totalRooms) {
            System.out.println("Invalid room number");
            return;
        }

        int roomIndex = roomNumber - 1;

        int floor = roomIndex / roomsPerFloor;
        double roomRate = floorRoomPrices[floor];
        double additionalCharge = additionalCharges[roomIndex];
        int stayDuration = stayDurations[roomIndex];

        // Check if the room is occupied
        if (stayDuration <= 0) {
            System.out.println("Room " + roomNumber + " is not currently occupied.");
            return;
        }

        // Calculate and print the bill
        double totalBill = (roomRate * stayDuration) + additionalCharge;
        System.out.println("\n--- Bill for Room " + roomNumber + " ---");
        System.out.println("Floor: " + (floor + 1));
        System.out.println("Room Rate (per night): $" + roomRate);
        System.out.println("Stay Duration: " + stayDuration + " nights");
        System.out.println("Additional Charges: $" + additionalCharge);
        System.out.println("Total Bill: $" + totalBill);
        System.out.println("-----------------------------");
    }
}