package unit1;

/**
* Description: This program prints the Casting3 worksheet
* Date: October 15, 2024
* @author Kate Sheu
*/
public class Casting3 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
 public static void main(String[] args) {
    /* 
    * Strings and Back Again
    */
    //Recall:
    System.out.println("Part 1");
    System.out.println("1 + 2 + 3" + 4 + 5);
    //why did it print out this way?
    //It printed this way because only "1+2+3" were in quotes, making the computer add 4 and 5 just print it after 3, as a string, not as a math operation

    //Demonstrate casting a double value to a String in this way
    double myDouble = 10.0;
    System.out.println("10.0"+ 2.5);
    
    //Demonstrate casting a boolean value to a String in this way
    boolean myBoolean = true;
    System.out.println("true"+3);
    
    //Demonstrate casting a char value to a String in this way
    char myChar = 'a';
    System.out.println("a" + 3);

    System.out.println("Part 2");
    //In order to change a String into an integer, we need another set of code

    String strNum = "-5";
    int myNum = Integer.parseInt(strNum);

    System.out.println(strNum + " x 2 = " + (myNum + myNum));

    /*Change strNum to the following values, and see if they work:
     * "25.2" created error
     * "23c" created error
     * "2 3" created error
     * "Lol23" created error
     * "-5" worked
    */
    //What can you say about how we can use the function, Integer.parseInt()?
    // We can use the function Integer.parseInt to switch the data type of a string to an integer, however only if it can be converted into an integer

    // What do you think the code to change a String to double would look like?
    // double myNum = Double.parseDouble(strNum);
    //Similarly, test out the code and write down what instructions
    //I started by declaring a string called strDouble
    //Then I used the example int myNum = Integer.parseInt(strNum); and switched all the ints to doubles
    //Lastly I printed my string with double values
    
    String strDouble = "5.3";
    double doubleNum = Double.parseDouble(strDouble);
    System.out.println(strDouble + " x 2 = " + (doubleNum + doubleNum));

    //When do you think it might be necessary to change a string value into an integer value/double value?
    //It may be necessary to change a string value into an integer/ double value when doing mathematical operations with 2 strings
  }
}