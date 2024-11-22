package unit2;
/**
Description: This program prints the DoWhile worksheet
Date: November 21, 2024
@author Kate Sheu
*/

import java.util.Scanner;

public class DoWhile {
 public static void main(String[] args) {
   /*
   A loop is another control structure that allows for repetition. It 
   does not make a decision on which branch to go on, like the 
   conditional.
   It makes a decision whether it should go back to redo a set of code.
   */
   /* Scanner in = new Scanner(System.in);
   String name;
   do {
     System.out.print("What is your name? ");
     name = in.nextLine();
   } while (!name.equals("Mr. Lee"));

   System.out.println("You are welcome into the secret secret pogchamp club.");

   in.close();
	/*
   //Run the code. Explain the code in your own words
   //The code asks the user for their name, then continues the loop until "Mr. Lee" is entered.
   //What code is repeated?
   /*
    *do {
    *System.out.print("What is your name? ");
    *name = in.nextLine();
    */
   //When does it decide whether to repeat or not?
	 // The while statement
   //What is the condition for repeating?
	 //!name.equals("Mr. Lee")

   /*
    Note:Pay attention to the brackets, and the semicolon
   */

   /*
     When constructing a loop, there are many strategies. I like to 
     break down the problems this way:
       1. What commands am I going to repeat?
       2. How many times/until when will I repeat the code?
   */

   //Create a do-while loop that asks for a word, and 
   //prints it out 20 times.
   
	 Scanner sc = new Scanner(System.in);
	   String word;
	   int timesPrinted = 0;
	   System.out.println("Please enter a word.");
	   word = sc.nextLine(); 
	  
	   do {  
	       System.out.println(word);  
	       timesPrinted++;           
	   } while (timesPrinted < 20); 
	   
	   sc.close();
 }
}
