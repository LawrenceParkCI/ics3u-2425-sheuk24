package unit2;
import java.util.Scanner;

/**
 * Description: This program prints a biology quiz
 * Date: November 13, 2024
 * @author Kate Sheu
*/

public class IfChallenge3 {
	/**
	 * Entry point into new program
	 * @param args
	 */
  public static void main(String[] args) {
    //This is for the portfolio

    /*
    Write an interactive quiz. It should ask the user three 
    multiple-choice or true/false questions about something. 
    It must keep track of how many they get wrong, and print 
    out a "score" at the end.

    Sample:

    Are you ready for a quiz?  N
    Okay, here it comes!

    Q1) What is the capital of Alaska?
      1) Melbourne
      2) Anchorage
      3) Juneau

    > 3

    That's right!
    */
	
	Scanner sc = new Scanner(System.in);
	//Declaring variables 
	String name;
	String userAnswer1;
	String correctAnswer1 = "d";
	String userAnswer2;
	String correctAnswer2 = "c";
	String userAnswer3;
	String correctAnswer3 = "b";
	int score = 0;
	
	//Test title and explanation
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~ Unit 3 Biology Quiz: Taxonomy ~~~~~~~~~~~~~~~~~~~~~~");
	System.out.print("Name: ");
	name = sc.nextLine();
	System.out.println("\nWelcome to the Unit 3 Taxonomy quiz! Each question will be worth 1 point.\nPlease type in the letter as the answer.\nGood luck!");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("Let's go!");
	
	
	//Quiz questions
	//Q1
	System.out.println("Question 1. What is Taxonomy?\n\ta) Identifying species\n\tb) Naming species\n\tc) Classifying Species\n\td) All of the above");
	System.out.print("Answer: ");
	//Calculations
	userAnswer1 = sc.nextLine();
		if (userAnswer1.equalsIgnoreCase(correctAnswer1)) {
			System.out.println("You are correct!");
			score++;
	    } else {
	      System.out.println("The correct answer is d) All of the above");
	    }
		
	//Q2
	System.out.println("\nQuestion 2. What species classification species concept refers to body shape, \nsize and other structural features?\n\ta) Biological\n\tb) Phylogenetic\n\tc) Morphological\ntd) Binomial");
	System.out.print("Answer: ");
	//Calculations
	userAnswer2 = sc.nextLine();
		if (userAnswer2.equalsIgnoreCase(correctAnswer2)) {
			System.out.println("You are correct!");
			score++;
	    } else {
	      System.out.println("The correct answer is c) Morphological");
	    }
		

	//Q3
	System.out.println("\nQuestion 3. What number in the hierarcy is the classification group GENUS?\n\ta) 4\n\tb) 7\n\tc) 2\n\td) None of the above");
	System.out.print("Answer: ");
	//Calculations
	userAnswer3 = sc.nextLine();
		if (userAnswer3 == correctAnswer3) {
			System.out.println("You are correct!");
			score++;
		} else {
			System.out.println("The correct answer is b) 7");
		}

	//Total score
	System.out.println("Great job! Your score is " + score +"/3!");
		sc.close();
  }
}
