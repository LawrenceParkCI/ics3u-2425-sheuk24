package unit2;

/**
 * Description: This program prints the DoubleDiceContest work sheet
 * Date: November 18, 2024
 * @author Kate Sheu
 */
public class DoubleDiceContest {

	public static void main(String[] args) {
		/*
		 * Write code that simulates rolling two dice for the user and then two dice for the computer. 
		 * The program should output the total of the two dice for both the user and the computer, 
		 * then announce who won: the computer, the user, or say it was a tie.
		 */
		int userDie1 = (int)(Math.random()*6)+1;
		int userDie2 = (int)(Math.random()*6)+1;
		int userDice = (userDie1 + userDie2);
		
		int computerDie1 = (int)(Math.random()*6)+1;
		int computerDie2 = (int)(Math.random()*6)+1;
		int computerDice = (computerDie1 + computerDie2);
		
		System.out.println("User:");
		System.out.println(userDice);
		System.out.println("Computer:");
		System.out.println(computerDice);
		
		if (userDice > computerDice) {
		    System.out.println("User won!");
		} else if (userDice < computerDice){
		    System.out.println("Computer won!");
		} else {
		    System.out.println("It's a tie!");
		}
		


	}

}
