package unit2;

public class IfStatements1 {
	  public static void main(String[] args) {
	    int firstNum = 10;
	    int secondNum = 30;

	    System.out.println("Part 1: If");
	    System.out.println("----------");
	    if (firstNum > secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGLUL");
	    }    

	    //What prints out? Why?
	    //Nothing comes out, no else statement.

	    System.out.println("\nPart 2: If, Else");
	    System.out.println("----------------");
	    if (firstNum > secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGALUL");
	    } else {
	      System.out.println("XQCL");
	    }

	    //What prints out? Why?
	    //XQCL because firstnum is not greater than secondnum

	    System.out.println("\nPart 3: If, Else if, Else");
	    System.out.println("-------------------------");
	    if (firstNum > secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGALUL");
	    } else if (firstNum % 2 == 0 && secondNum % 3 == 0){
	      System.out.println("sykSHY");
	    } else {
	      System.out.println("XQCL");
	    }

	    //What prints out? Why? sykSHY prints out 10 is divisible by 2 and 30 is divisible by 3.

	    System.out.println("\nPart 4: What's the difference?");
	    System.out.println("------------------------------");
	    System.out.println(1);
	    if (firstNum < secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGALUL");
	    } else if (firstNum % 2 == 0 && secondNum % 3 == 0){
	      System.out.println("sykSHY");
	    } else {
	      System.out.println("XQCL");
	    }

	    System.out.println(2);
	    if (firstNum < secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGALUL");
	    }

	    if (firstNum % 2 == 0 && secondNum % 3 == 0){
	      System.out.println("sykSHY");
	    }

	    if (!(firstNum < secondNum)) {
	      System.out.println("XQCL");
	    }

	    //What prints out? Why?
	    //1
	    //KEKW
	    //OMEGALUL
	    //2
	    //KEKW
	    //OMEGALUL
	    //sykSHY
	    //What is the difference between the first and second part?
	    //It is different because the first part used an else if statement meaning it would only print if the the if statement was false. 
	    //On the other hand 
	    
	  }
	}		