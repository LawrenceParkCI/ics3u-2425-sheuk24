package unit1;
/**
 * Date: October 1, 2024
 * Description: This program is a worksheet of math operations.
 * @author Kate Sheu
*/
public class MathOperators {
/**
 *Entry point to program
 * @param
 */
   public static void main (String [] args) {
      /*
         Pre: Kind of Math, but not really
         What do you notice is happening?
         // It is also adding words together not just numbers.
      */
      
          System.out.println("Butter" + "fly");
      
          System.out.println("1 + 2 + 3 + 4 + 5");
      
          System.out.println(1 + 2 + 3 + 4 + 5);
      
          System.out.println(1 + 2 + "3 + 4 + 5");
      
          System.out.println("1 + 2 + 3" + 4 + 5);
      
      
      //Why do you think the last two outputs act so differently?
      // They will act differently because of the placement of the quotation marks.
      
      //Summary: What are two possible roles of the + operator?
	  // Adding numbers and putting words together.
     
      
      /*
         Part 1 
         Figure out what is the meaning of each operator. Use print statements
         to verify your answer and explain.
      */
         
      // + means: add
       System.out.println("Addition");     
	   System.out.println("Butter" + "fly");
	   
      // - means: subtract
	   System.out.println("Subtract");
	   System.out.println(3 - 1);
	   
      // * means: multiply
	   System.out.println("Multiplication");
	   System.out.println(3*4);
	   
      // / means: divide
	   System.out.println("Division");
	   System.out.println(24/12);
      
      
      
      //Print the following expression: (3 + 2) * 5
	   System.out.println((3+2)*5);
      //Print the following expression: 3 + 2 * 5
	   System.out.println(3+2*5);
      //Was this expected? Why or why not?
	  // Yes it was expected. By putting brackets around "2+3" requires BEDMAS which changes what value is multiplied by 5.
      /*
         Part 2 - Calculate Using Operators
         Print out, using one println statement, what 45 degrees Celsius is in Fahrenheit
         Print out, using a print and a println statement, what 900 Fahrenheit is in Celsius
      */     
	   System.out.println(45*2+30);
       System.out.println(900/2-30);
      /*
         Part 3
         Figure out what is the meaning of % as a math operator. Use print statements
         to check your answer.
      */
      
      //I think % means: The remainder of division.
       System.out.println(14%4);
       
      
   }
}