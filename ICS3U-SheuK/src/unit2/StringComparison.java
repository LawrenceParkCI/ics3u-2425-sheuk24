package unit2;
import java.util.Scanner;

/**
 * Description: This program prints the StringComparison work sheet
 * Date: November 10, 2024
 * @author Kate Sheu 
*/

class StringComparison {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    
    String answer;

    System.out.println("What is the capital of Ontario?");
    answer = in.nextLine();

    if (answer == "Toronto") {
      System.out.println("Correct!");
    } else {
      System.out.println("Sorry, that's incorrect.");
    }
    
    //Run the code. What happens when you type the correct answer? The incorrect answer?
    //Prints the opposite, if its correct, its prints the incorrect 

    /*
      Strings are objects, not primitives and as such are a 
      *reference* data type. These variables hold an address 
      to the value. (Scanner is also a reference data type)

      int, double, char, etc. are all *primitive* data types. 
      These variables hold the actual value.

      Look at the website:
      https://www.javatpoint.com/string-comparison-in-java

      Demonstrate the use of the functions:
        .compareTo()
        .equals()
        .equalsIgnoreCase()
    */


    //What values does compareTo() return? How can we 
    //interpret the value?

    //what value does equals() and equalsIgnoreCase() return? 
    //What is the difference between these two functions?
  }
}