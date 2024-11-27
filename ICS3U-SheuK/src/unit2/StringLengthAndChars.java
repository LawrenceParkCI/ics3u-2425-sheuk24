package unit2;

import java.util.Scanner;

/**
Description: This program prints the StringLengthAndChars worksheet
Date: November 27, 2024
@author Kate Sheu
*/

public class StringLengthAndChars {

/**
* @param args unused
*/

  public static void main(String[] args) {
    /*
      Goal: Using string methods with a for loop
        .length()
        .charAt(<position>)
    */
    
    String name = "Ms. Kemp";

    //write comments for the following code - what does it print out, and why?
    //8
    //s
    //.
    // 
    //This is printed out because the length of the string is 8 and the characters at 1, 2, and 3 are "s", ".", and " "
    System.out.println(name.length()); 
    System.out.println(name.charAt(1)); 
    System.out.println(name.charAt(2)); 
    System.out.println(name.charAt(3)); 
  
    //.length() gets the number of characters including spaces of a name
    //.charAt(position) gets the character at a certain index 
        //counting starts at 0

    /**
      Ask for user input for name. Print out each individual letter of the name on separate lines, using a for loop
    */
    Scanner in = new Scanner(System.in);
    //Declaring variables 
    System.out.println("Please enter a name:");
    name = in.nextLine();
    
    for (int i = 0; i < name.length(); i++) {
        System.out.println(name.charAt(i)); 
    }
    
    in.close();
    }

  }
