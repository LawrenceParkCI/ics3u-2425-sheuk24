package unit2;

import java.util.Scanner;

/**
Description: This program prints the DNAStringChallenge worksheet
Date: November 27, 2024
@author: Kate Sheu
*/

public class DNAStringChallenge {
  public static void main(String[] args) {
    /**
     http://rosalind.info/problems/dna/
    */
	  
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Please enter a DNA sequence:");
	 String dnaSequence = sc.nextLine();
	 
	 int numOfA = 0;
	 int numOfC = 0;
	 int numOfG = 0;
	 int numOfT = 0;
	 
	 for (int i = 0; i < dnaSequence.length(); i++) {
		 char total = dnaSequence.charAt(i);
		 if (total == 'A') {
             numOfA++;
         } else if (total == 'C') {
             numOfC++;
         } else if (total == 'G') {
             numOfG++;
         } else if (total == 'T') {
             numOfT++;
         }
     }

	        System.out.println("The number of each nucleotide:"); 
	        System.out.println("Number of A:" + numOfA);
	        System.out.println("Number of C:" + numOfC);
	        System.out.println("Number of G:" + numOfG);
	        System.out.println("Number of T:" + numOfT);
	 sc.close();
  }
}