package unit2;

import java.util.Scanner;

/**
Description: This program prints the LoopChallenge1 worksheet.
Date: November 21, 2024
@author Kate Sheu
*/

public class LoopChallenge1 {
 public static void main(String[] args) {
   /*
     Create a program that will ask for the password.  If they answer 
     incorrectly, tell them, and repeat. If they answer correctly, 
     welcome them in.
     
     Extra: if they don't give a proper answer within 3 
     Decide on whether you should use the while or do while loop.
   */
	 
	 Scanner sc = new Scanner(System.in);
	 String password = ("LoopChallenge1");
	 String userInput;
	 int attempts = 0;
	 int maxAttempts = 3;
	
	 //Getting user input
	 do {
         System.out.println("Please enter the password:");
         userInput = sc.nextLine();
         attempts++;

         if (userInput.equals(password)) {
             System.out.println("Access granted, welcome!");
         } else {
             System.out.println("Incorrect password. Try again.");
         }
         //Testing if user inputs more than 3 wrong answers
     } while (!userInput.equals(password)&&attempts < maxAttempts); 

     if (!userInput.equals(password)) {
         System.out.println("Too many failed attempts. Access denied.");
     }

     sc.close();
 }
}