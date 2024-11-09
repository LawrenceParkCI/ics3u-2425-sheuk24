package unit2;
import java.util.Scanner;

/**
* Description: This program prints the IfStatements2 worksheet
* Date: November 9, 2024
* @author Kate Sheu
*/

public class IfStatements2 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("What is your age?");
    int userAge = in.nextInt();
    /*
    if (userAge > 18) { //If they're over 18, they are titled an adult
      String title = "Adult";
    } else {  //if they're not over 18, I don't want a title
      System.out.println("Sorry, not quite yet.");
    }

    System.out.println(title);
    */
    //Looking at the logic above, why do you think the 
    //program won't work? 18 is not considered an adult, doesn't print anything when user is an adult, declaring string for no reason?

    //Copy the code below, and try to find a solution.
    //Comment the code above to avoid compilation errors.
    
    if (userAge >= 18) { //If they're over 18, they are titled an adult
        System.out.println("You are an adult.");
      } else {  //if they're not over 18, I don't want a title
        System.out.println("Sorry, not quite yet.");
      }


  }
}