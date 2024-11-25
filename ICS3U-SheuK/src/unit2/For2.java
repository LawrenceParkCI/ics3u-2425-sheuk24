package unit2;
/**
Description: This program prints the For2 work sheet.
Date: November 25, 2024
@author Kate Sheu
*/

public class For2 {
  public static void main(String[] args) {
    //Recall - create a for loop printing 1 to 10:
	  System.out.println("Counting from 1-10");
	    for (int num = 0; num < 10; num++) {
	      System.out.println(num);
	    }

    //though we are repeating a certain number of times, we can use variables in our for loops as well
	System.out.println("part 2");
    int times = 20;

    for (int i = 15; i < times; i++) {
      System.out.println(i);
    }

    //In addition, the counter doesn't necessarily have to be an integer
    System.out.println("part 3");
    double increment = 0.1;
    for (double i = 0; i < 2; i += increment) {
      System.out.println(i);
    }

    //create a variable to store the starting number, and use it in a for loop. Be able to use a double value:
    System.out.println("part 4");
    double number;
    for (number = 10; number <=40; number += 2.4) {
        System.out.println(number);
      }

    

   //Look at the following code. Explain what is happening?
   //Keeps on adding the value of i to the sum until i is 9
   //The program stops running when i is less than 10 (9) and prints out the final value of 45
   //We only see 45 because the only print statement is to print out the final sum.

    System.out.println("part 5");
    int sum = 0; 

    for (int i = 1; i < 10; i++) {
      sum += i;
    }

    System.out.println(sum);


    
  }
}