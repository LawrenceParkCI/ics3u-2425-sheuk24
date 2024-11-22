package unit2;
/**
Description: This program prints the While worksheet
Date: November 21, 2024
@author Kate Sheu
*/

import java.util.Scanner;

public class While {
 public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   System.out.println("How many people are you planning to see?");

   //Why do you think I coded it this way? 
   //Can't have a negative number of people, representing number of people as an integer.
   int numPeople = Integer.parseInt(in.nextLine());

   while (numPeople > 0) {
     System.out.print("What is this person's name? ");

     //Why do you think the variable is declared here? 
     //To store user information, Variable is only need if number of people is greater than 0
     String name = in.nextLine();
     System.out.println("Welcome, " + name + "!");

     numPeople = numPeople - 1;
   }
   

  
   //Run the code Using the debugger. 
   //Explain the code in your own words

   //What code is repeated?
   //The while loop is repeated.
   //When does it decide whether to repeat or not?
   //When numPeople becomes 0, the while loop ends.
   //What is the condition for repeating?
   //The condition for repeating is that numPeople must remain greater than 0


   //What is the difference between a while loop and a do-while loop?
   //In a while loop, the condition is checked before the loop body executes
   //so the body may not run if the condition is initially false. 
   //In a do-while loop, the body executes at least once since the condition is 
   //checked after the loop body.


   //Create a while loop that asks for a word, 
   //and prints it out 20 times.
   
   
   String word;
   int timesPrinted = 0;

   System.out.println("Please enter a word.");
   word = in.nextLine(); 

   while (timesPrinted < 20) { 
       System.out.println(word);  
       timesPrinted++;
   }

   in.close();
   }
}