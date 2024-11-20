package unit1;
/**
 * Description: Net pay question and answer
 * Date: October 7,2024
 * @author Kate Sheu 
 */
public class NetPay {
	/**
	 * This is the entry point to the program
	 * @param args
	 */

	public static void main(String[] args) {
		//Find the net pay (netPay) for an employee who works 40 hours (hours) at 5.00 per hour (wage) and has 2.00 (insurance) deducted for insurance and must pay 22% for tax (tax). Display your answer in sentence form and use the following formula:
		//netPay = (hours*wage-insurance) - tax*(hours*wage-insurance)
		// Declaring Variables 
		int hours = 40;
		double wage = 5.00;
		double insurance = 2.00;
		double tax = 0.22;
		double netPay;
		// Calculating netPay
		netPay = (hours*wage-insurance) - tax*(hours*wage-insurance);
		// Printing output
		System.out.println("The employees net pay is " + netPay);
				

	}

}
