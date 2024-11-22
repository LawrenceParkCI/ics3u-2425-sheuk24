package unit2;
import java.util.Scanner;

/**
 Description: This program prints the LoopChallenge2 worksheet
 Date: November 21, 2024
 @author Kate Sheu
*/

public class LoopChallenge2 {
  public static void main(String[] args) {
    /*
      Write a program to take the square root of a number typed in by 
      the user. Your program should use a loop to ensure that the number 
      they typed in is positive. If the number is negative, you should 
      print out some sort of warning and make them type it in again.
      
      You can get the square root of a number n with Math.sqrt(n). Make 
      sure you don't do this until the loop is done and you know for 
      sure you've got a positive number.
      
      Use the loop that you didn't use in LoopChallenge1
    */
	 
	 int number;
	 //Getting user input
	 System.out.println("Please enter an integer:");
	 Scanner sc = new Scanner(System.in);
	 number = sc.nextInt();
	 while (number <= 0) {
	     System.out.print("You can't square root a negative number, please enter a different number");
	 }
	 //Printing square root of user integer
	 System.out.println("The square root of your number is " + Math.sqrt(number));
	 
	 sc.close();
  }
}