package unit2;
/**

https://www.geeksforgeeks.org/java-math-random-method-examples/

Description:This program prints the randomness work sheet
Date: November 18, 2024
@author: Kate Sheu
*/


public class Randomness {
  public static void main(String[] args) {
    
    int max = 1000;
    int min = 100;
    int range = max - min + 1;
    
    for (int i = 0; i < 1; i++) {
        System.out.println((int)(Math.random() * range) + min);
    }

    //Run the program a few times. What do you think is the 
    //range of the numbers generated?
//The range is between 0-1
    //Read the demo program. Write the code so that the program 
    //will produce a random number between 100 and 1000.
    
  }
}