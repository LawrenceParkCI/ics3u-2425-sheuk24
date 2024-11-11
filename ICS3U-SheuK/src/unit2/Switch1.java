package unit2;
import java.util.Scanner;

/**
Description: This program prints the Switch1 work sheet
Date: November 11, 2024
@author Kate Sheu
*/

public class Switch1 {
/**
 * Entry point into new program
 * @param args
 */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //Getting user input
    System.out.println("What number day is it?");
    int day = in.nextInt();

    switch(day) {
      case 1:
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Tuesday");
        break;
      case 4:
        System.out.println("Wednesday");
        break;
      case 5:
        System.out.println("Thursday");
        break;
      case 6:
        System.out.println("Friday");
        break;
      case 7:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("We don't have that day yet");
        break;
    }

    //Run the program. Type in a number between 1-7, and then a number bigger than that. What is the result? 
    //Prints the day assigned to the inputed number
    //What do you think default means? Default is used when none of the declared cases are true
    //What do you think break means? What happens when you remove a break?
    //Break is used to tell the program to stop after finding the true case. Ends each case.

    //Create another program, this time asking what day it is (String), and printing out how many days until the weekend
    in.nextLine();
    
    //Getting user input
    System.out.println("What day is it?");
    System.out.println("Remeber that days start with a capital letter!");
    String dayName = in.nextLine();

    int daysUntilWeekend;

    switch(dayName) {
      case "Monday":
        daysUntilWeekend = 5;
        break;
      case "Tuesday":
        daysUntilWeekend = 4;
        break;
      case "Wednesday":
        daysUntilWeekend = 3;
        break;
      case "Thursday":
        daysUntilWeekend = 2;
        break;
      case "Friday":
        daysUntilWeekend = 1;
        break;
      case "Saturday":
      case "Sunday":
        daysUntilWeekend = 0;
        System.out.println("It's already the weekend!");
        break;
      default:
        daysUntilWeekend = -1; 
        System.out.println("That's not a day.");
        break;
    }

    //Printing how many days are left
    if (daysUntilWeekend > 0) {
      System.out.println("There are " + daysUntilWeekend + " days until the weekend!");
    }

    in.close();
    
  }
}