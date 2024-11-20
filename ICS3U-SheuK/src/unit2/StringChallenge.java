package unit2;
import java.util.Scanner;

/**
 * Description: This program prints the StringChallenge work sheet
 * Date: November 11, 2024
 * @author Kate Sheu
*/

public class StringChallenge {
/**
 * Entry point into new program. 
 * @param args
 */
  public static void main(String[] args) {
    //This is for the portfolio

    /*
    Create a program that demonstrates the use of .equals(), .equalsIgnoreCase(), .compareTo().  You should be using if statements for this program.

    Also, include an example of explicit and implicit casting.

    Comment to explain:
      -when you use the different String functions
      -when you are casting and how the value is changed
    */
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Enter a name: ");
	  String name1 = sc.nextLine();
	  System.out.print("Enter another name: ");
	  String name2 = sc.nextLine();

	  // Using .equals() to check if the names are the exactly
	  
	  if (name1.equals(name2)) {
	    System.out.println("The names are exactly the same.");
	  } else {
	    System.out.println("The names are different.");
	  }

	    // Using .equalsIgnoreCase() to check if the names have the same letters
	    if (name1.equalsIgnoreCase(name2)) {
	      System.out.println("The names are the same ignoring the case.");
	    } else {
	      System.out.println("The names are still different even ignoring the case.");
	    }

	    // Using .compareTo() to compare names lexicographically
	    int comparison = name1.compareTo(name2);
	    if (comparison == 0) {
	      System.out.println("The names are lexicographically equal.");
	    } else if (comparison < 0) {
	      System.out.println("The first name comes before the second name lexicographically.");
	    } else {
	      System.out.println("The first name comes after the second name lexicographically.");
	    }

	    //Casting
	    System.out.print("Enter a whole number: ");
	    int wholeNumber = sc.nextInt();
	    
	    // Implicit casting of int to double
	    double doubleNumber = wholeNumber;
	    System.out.println("Implicit casting (int to double): " + doubleNumber);

	    // Explicit casting of double to int
	    System.out.print("Enter a decimal number: ");
	    double decimalNumber = sc.nextDouble();
	    int intNumber = (int) decimalNumber;
	    System.out.println("Explicit casting (double to int): " + intNumber);
	  
	    sc.close();
  }
}