package unit1;
/**
 * Description: PlayingWithStrings worksheet
 * Date: October 3, 2024
 * @author Kate Sheu
 */
public class PlayingWithStrings {
/**
 * Entry point to new program.
 * @param args
 */
	public static void main(String[] args) {
		String msg = "I am enjoying this class.";
		
		String msg1 = msg.toUpperCase();
		String msg2 = msg.toLowerCase();
		char letter = msg.charAt(6);
		System.out.println(msg);
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println("Character at index 6 = "+ letter);
		System.out.println("msg has "+msg.length()+ "characters.");
				
				
		
				
	}

}
