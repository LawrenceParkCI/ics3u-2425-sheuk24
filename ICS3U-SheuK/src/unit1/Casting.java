package unit1;

/**
 * Description: 
 * Date: Oct 10, 2024
 * @author Kate Sheu
 */ 

import java.util.Scanner;

public class Casting {
	
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
  public static void main(String[] args) {
    /*
    *Casting* means to change data from one type to another.

    Implicit casting - changing of data types without specifically writing extra code

    Explicit casting - changing of data types by specifically writing extra code
    */

    System.out.println("Part 1");

    int intNum;
    intNum = 10;

    double doubleNum;
    
    //implicit casting
    doubleNum = intNum;

    //What type of data is printed here? Why?
    System.out.println(doubleNum);
    //A double number is being printed.

    //can you explain what is happening in this code?
    doubleNum = doubleNum + 2.2;
    //A double number + 2.2 is being printed

    //explicit casting
    intNum = (int) doubleNum;

    //What type of data is printed here? Why?
    System.out.println(intNum);
    //An integer is being printed.
    /*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      int to double: explicit
      intNum = (int) doubleNum;
      
      double to int: inplicit
      doubleNum = intNum;
      
      int to long: 
      long to int:

    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)
    */
    //Double is longer than an int, so switching from double --> int is implicit because there is no need to add extra code.
    
    

    System.out.println("Part 2");

    //understanding what you can do with casting, can you round the following variable to the nearest 10th?
    double myNum;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Give me decimal number up to the hundredth");
    

    System.out.print("Rounding down to the nearest tenth, it is: ");
    
  }
}