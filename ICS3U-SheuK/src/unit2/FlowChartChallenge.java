package unit2;
import java.util.Scanner;
/**
Description:
Date:
@author 
*/

class FlowChartChallenge {
 public static void main(String[] args) {
   /*Create a flow chart for this program. Add the Share link
   to your flowchart as a comment in this program.
   How would the flow chart of the do-while loop
    and while loop differ?
    For a while loop the condition (diamond) goes before the parallelogram 
    For the do while loop the condition (diamond) goes after the parallelogram.
    This is because in a while loop the condition is tested before the loop and in the do while loop it is tested after. 
   */
   
   Scanner sc = new Scanner(System.in);
   String name;
   do {
     System.out.print("What is your name? ");
     name = sc.nextLine();
   } while (!name.equals("Ms. Kemp"));

   System.out.println("You are welcome into the secret secret pogchamp club.");

   sc.close();
   //https://drive.google.com/file/d/1QTFhRVpqBi922-9uwFczoKf8f0djOvKZ/view?usp=sharing
   
 }
}