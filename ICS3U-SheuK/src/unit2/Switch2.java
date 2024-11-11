package unit2;
import java.util.Scanner;

/**
 * Description: This program prints the Switch2 work sheet.
 * Date: November 11, 2024
 * @author Kate Sheu 
 */

public class Switch2 {
    /**
     * Entry point into new program.
     * @param args
     */
    public static void main(String[] args) {
    	/*Create a program that asks for a month, and print out how many days there are in that month. (For "February", just put 28). This will be a part of your portfolio.

        Challenge: Ask for the year, and change "February" to 29 if the year is a leap year (divisible by 4)
        */

        //Can you create it such that you can remove some breaks?
    	
        Scanner sc = new Scanner(System.in);
        
      //Leap years
        System.out.println("Please enter the year:");
        int year = sc.nextInt();
        
        sc.nextLine(); 
        
        System.out.println("What month is it?");
        String month = sc.nextLine();
        int daysInMonth = 0; 

        switch(month) {
        case "January":
        case "March":
        case "May":
        case "July":
        case "August":
        case "October":
        case "December":
            daysInMonth = 31;
            break;

        case "April":
        case "June":
        case "September": 
        case "November":
            daysInMonth = 30;
            break;
            
        case "February":
            // Checking for leap year
            if (year % 4 == 0) {
                daysInMonth = 29;
            } else {
                daysInMonth = 28;
            }
            break;
            default:
                System.out.println("That's not a month.");
                break; 
        }

        // Printing the number of days
        System.out.println(month + " has " + daysInMonth + " days.");
        sc.close();  
    }
}