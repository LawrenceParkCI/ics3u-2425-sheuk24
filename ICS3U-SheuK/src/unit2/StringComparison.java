package unit2;
import java.util.Scanner;

/**
 * Description: This program prints the StringComparison work sheet
 * Date: November 10, 2024
 * @author Kate Sheu 
 */

class StringComparison {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        String answer;

        System.out.println("What is the capital of Ontario?");
        answer = in.nextLine();

        // Correcting the string comparison here to use .equals
        if (answer.equals("Toronto")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Sorry, that's incorrect.");
        }
        
        //Run the code. What happens when you type the correct answer? The incorrect answer?
        //Both the correct answers print that the statement is incorrect

        /*
          Strings are objects, not primitives and as such are a 
          *reference* data type. These variables hold an address 
          to the value. (Scanner is also a reference data type)

          int, double, char, etc. are all *primitive* data types. 
          These variables hold the actual value.

          Look at the website:
          https://www.javatpoint.com/string-comparison-in-java

          Demonstrate the use of the functions:
            .compareTo()
            .equals()
            .equalsIgnoreCase()
        */

        // COMPARE TO
        String str1 = "A";  
        String str2 = "A";  
        String str3 = "B";  
        System.out.println(str1.compareTo(str2));      // 0  
        System.out.println(str1.compareTo(str3));      // -1 (str1 < str3)  
        System.out.println(str3.compareTo(str1));      // 1 (str3 > str1)  

        // EQUALS
        String s1 = "A";  
        String s2 = "A";  
        String s3 = new String("A");  
        String s4 = "B";  
        System.out.println(s1.equals(s2)); // true  
        System.out.println(s1.equals(s3)); // true  
        System.out.println(s1.equals(s4)); // false  

        // EQUALSIGNORECASE
        String string1 = "Kate";  
        String string2 = "kATE";  
        // Using equals() method for case-sensitive comparison  
        boolean equalsResult = string1.equals(string2);  
        System.out.println("Using equals() method: " + equalsResult); // Output: false  
        // Using equalsIgnoreCase() method for case-insensitive comparison  
        boolean equalsIgnoreCaseResult = string1.equalsIgnoreCase(string2);  
        System.out.println("Using equalsIgnoreCase() method: " + equalsIgnoreCaseResult); // Output: true  
        
        //What values does compareTo() return? How can we 
        //interpret the value?
      	//compareTo() returns positive, negative and neutral numerical values. (-1,0,1)
      	//The number represent how far apart the letters are lexicographically 
      	//Calculates the output using ASCII values

        //what value does equals() and equalsIgnoreCase() return? 
        //What is the difference between these two functions?
    	//equals() takes capitalization into account, equalsIgnoreCase() doesn't
        
        in.close();
    }  
}