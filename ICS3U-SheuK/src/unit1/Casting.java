package unit1;

/**
 * Description: This program prints the Casting worksheet
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
    //A double number is being printed because the int was implicitly casted to a double.

    //can you explain what is happening in this code?
    doubleNum = doubleNum + 2.2;
    //A double number is increased by 2.2 and is being printed

    //explicit casting
    intNum = (int) doubleNum;

    //What type of data is printed here? Why?
    System.out.println(intNum);
    //An integer is being printed because doubleNum was explicitly casted to int
    /*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      int to double: implicit
      double doubleNum = intNum;
      
      double to int: explicit
      int intNum = (int) doubleNum;
      
      int to long: implicit 
      long longNum = intNum;
      
      long to int: explicit
      int intNum = (int) longNum;

    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)
    */
    //Implicit casting is when the type of data can hold all the information from the original data type (e.g. int --> long)
    //Explicit casting is when the type of data cannot hold all the information from the original data type (e.g. double --> int)
    
    

    System.out.println("Part 2");

    //understanding what you can do with casting, can you round the following variable to the nearest 10th?
    double myNum;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Give me decimal number up to the hundredth");
    
    myNum = in.nextDouble();
    myNum = (int)(myNum*10)/10.0;
    System.out.print("Rounding down to the nearest tenth, it is: " + myNum);
    
    in.close();
    
  

    
  }
}