package unit3;
/**
 * Description: This program runs an interactive hotel management system.
 * Date: Jan 15, 2025
 * @author Kate Sheu
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Summative {

    public static void main(String[] args) {
        // Introduction
        System.out.println("Welcome to Kate's Hotel Management System!");
        System.out.println("This program will allow you to manage the charges, availability, and prices of hotel rooms.");

        Scanner sc = new Scanner(System.in);

        // Gather hotel-specific information
        System.out.println("Please enter the number of floors in the hotel:");
        int numOfFloors = sc.nextInt();

        System.out.println("Please enter the number of rooms on each floor:");
        int roomsPerFloor = sc.nextInt();
        sc.nextLine();

        // Room type setup for each floor
        String[] floorRoomTypes = new String[numOfFloors];
        

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
        DecimalFormat price = new DecimalFormat("0.00");

        System.out.print("Enter the price per night for Single rooms: $");
        double singlePrice = sc.nextDouble();
        System.out.println("Single room price set to: $" + price.format(singlePrice));

        System.out.print("Enter the price per night for Double rooms: $");
        double doublePrice = sc.nextDouble();
        System.out.println("Double room price set to: $" + price.format(doublePrice));

        System.out.print("Enter the price per night for Suite rooms: $");
        double suitePrice = sc.nextDouble();
        System.out.println("Suite room price set to: $" + price.format(suitePrice));
        sc.nextLine();
        double[] prices = {singlePrice, doublePrice, suitePrice};

        // Initialize room data
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
                System.out.println("P - Print bill for a room\n# - Display commands\nQ - Quit program");
            } else if (command.equalsIgnoreCase("R")) {
                checkIn(sc, availability, guestNames, stayDurations);
            } else if (command.equalsIgnoreCase("O")) {
                checkOut(sc, availability, guestNames, stayDurations, prices, additionalCharges, roomsPerFloor);
            } else if (command.equalsIgnoreCase("F")) {
                findRoomByGuest(sc, guestNames);
            } else if (command.equalsIgnoreCase("L")) {
                listRooms(availability, guestNames, floorRoomTypes, roomsPerFloor);
            } else if (command.equalsIgnoreCase("A")) {
                addAdditionalCharges(sc, additionalCharges);
            } else if (command.equalsIgnoreCase("P")) {
                printBill(sc, stayDurations, prices, additionalCharges, roomsPerFloor);
            } else if (command.equalsIgnoreCase("Q")) {
                System.out.println("Thanks for using Kate's Hotel Management System!");
                break;
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

    public static void checkOut(Scanner sc, boolean[] availability, String[] guestNames, int[] stayDurations,
                                 double[] prices, double[] additionalCharges, int roomsPerFloor) {
        System.out.println("Please enter the room number (1 - " + availability.length + "):");
        int roomNumber = sc.nextInt() - 1;
        sc.nextLine();

        if (roomNumber < 0 || roomNumber >= availability.length) {
            System.out.println("Invalid room number!");
        } else if (availability[roomNumber]) {
            System.out.println("Room is already empty!");
        } else {
            printBillForRoom(roomNumber, stayDurations, prices, additionalCharges, roomsPerFloor);
            availability[roomNumber] = true;
            guestNames[roomNumber] = "";
            stayDurations[roomNumber] = 0;
            additionalCharges[roomNumber] = 0.0;

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

    public static void listRooms(boolean[] availability, String[] guestNames, String[] floorRoomTypes, int roomsPerFloor) {
        for (int i = 0; i < availability.length; i++) {
            int floor = i / roomsPerFloor;
            String roomType = floorRoomTypes[floor];
            String status = availability[i] ? "Available" : "Occupied by " + guestNames[i];
            System.out.println("Room " + (i + 1) + " (Type: " + roomType + "): " + status);
        }
    }

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

    public static void printBill(Scanner sc, int[] stayDurations, double[] prices, double[] additionalCharges, int roomsPerFloor) {
        System.out.println("Please enter the room number (1 - " + stayDurations.length + "):");
        int roomNumber = sc.nextInt() - 1;
        sc.nextLine();

        if (roomNumber < 0 || roomNumber >= stayDurations.length) {
            System.out.println("This room is not occupied!");
            return;
        }

        printBillForRoom(roomNumber, stayDurations, prices, additionalCharges, roomsPerFloor);
    }

    public static void printBillForRoom(int roomIndex, int[] stayDurations, double[] floorRoomPrices, double[] additionalCharges, int roomsPerFloor) {
        int floor = roomIndex / roomsPerFloor; 
        double roomRate = floorRoomPrices[floor]; 
        double additionalCharge = additionalCharges[roomIndex];
        int stayDuration = stayDurations[roomIndex];

        if (stayDuration <= 0) {
            System.out.println("Room " + (roomIndex + 1) + " is not currently occupied.");
            return;
        }

        double totalBill = (roomRate * stayDuration) + additionalCharge;

        System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~Bill for Room " + (roomIndex + 1) + "~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
        System.out.println("|---------------------------------------------------------------------|");
        System.out.printf("%-15s%-15s%-20s%-20s%-15s\n", "|Floor", "|Room Rate", "|Stay Duration", "|Additional Charges", "|");
        System.out.println("|---------------------------------------------------------------------|");
        System.out.printf("%-15s%-15s%-20s%-20s%-15s", "|" + floor + 1, "| $" + roomRate, "|" + stayDuration, "| $" + additionalCharge, "|");
        System.out.println("\n|---------------------------------------------------------------------|");
        System.out.printf("%-55s%-15.2f%-15s\n", "|Total Bill: $", totalBill, "|");
        System.out.println("+---------------------------------------------------------------------+");
    }
}
