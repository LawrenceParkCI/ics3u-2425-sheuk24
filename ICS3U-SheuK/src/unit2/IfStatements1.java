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

	    //What prints out? Why?

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
	    //What is the difference between the first and second part?
	    
	  }
	}		