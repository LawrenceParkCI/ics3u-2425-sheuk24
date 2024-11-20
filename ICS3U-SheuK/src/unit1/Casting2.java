package unit1;

/**
* Description: The program prints the Casting2 worksheet
* Date: October 15, 2024
* @author Kate Sheu
*/
public class Casting2 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
  public static void main(String[] args) {
    /*
    Char and int
    */
    char myChar = 'a';
    System.out.println(myChar);
    System.out.println(myChar + 1);

    char myChar2 = (char) (myChar + 1);

    System.out.println(myChar2);

    //Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?
    //Firstly, The character "a" is being printed 
    //Then implicit casting occurs and the char is switched to an ACSII number because there is a +1, turning the char into a int
    //The number 98 is printed because the ASCII number for "a" is 97 and 97+1= 98
    //Explicit casting then occurs in the line char myChar2 = (char) (myChar + 1);
    //This changes the integer back to a char
    //b is printed because (myChar + 1) is being casted and myChar + 1 = 98, and 98 is the ASCII value for "b"

    //Why do you think this happens?
    //The code is being casted to different data types, while using the ASCII values
    //Investigate what is ASCII. What is it?
    //ASCII stands for American Standard Code for Information Interchange
    //ASCII is a encoding format for electronic communication that represents characters in a numeric value
    //Can you find the number value for 'a'? Does it match with your findings above?
    //The number value for a is 97, it matches my findings above

    //create a new character myCharCap, and transform myChar into a capital 'A' and print it
    
    char myCharCap;
    myCharCap = (char) (myChar - 32);
    System.out.println(myCharCap);


    

  }
}