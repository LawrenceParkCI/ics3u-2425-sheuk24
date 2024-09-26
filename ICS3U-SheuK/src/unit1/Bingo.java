package unit1;

public class Bingo {


	public static void main(String[] args) {
		// Bingo Rules
		System.out.println("Bingo Rules");
		System.out.println("--------------------------------------------");
		System.out.println("\n1. The caller randomly pulls a numbered bingo ball.");
		System.out.println("\n2. The number is placed on the bingo board and called out.");
		System.out.println("\n3. Players look for the called number on their bingo card.");
		System.out.println("\n4. If the number is located, it is marked off.");
		System.out.println("\n5. Steps 1 to 4 are epreated until a player matches the bingo pattern.");
		System.out.println("\n6. The winning player yells BINGO.");
		// Bingo template
		System.out.println("Sample Bingo Card");
		System.out.format("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.format("\n_______________________________");
		System.out.format("\n%-6s%-6s%-6s%-6s%-6s%-6s","|B","|I","|N","|G","|O","|");
		System.out.format("\n|=============================|");
		System.out.format("\n%-6s%-6s%-6s%-6s%-6s%-6s","|2","|20","|42","|60","|64","|");
		System.out.format("\n|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
		System.out.format("\n%-6s%-6s%-6s%-6s%-6s%-6s","|14","|25","|32","|55","|70","|");
		System.out.format("\n|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
		System.out.format("\n%-6s%-6s%-6s%-6s%-6s%-6s","|5","|18","|FREE","|53","|67","|");
		System.out.format("\n|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
		System.out.format("\n%-6s%-6s%-6s%-6s%-6s%-6s","|12","|16","|31","|46","|75","|");
		System.out.format("\n|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
		System.out.format("\n%-6s%-6s%-6s%-6s%-6s%-6s","|10","|22","|39","|59","|71","|");
		System.out.format("\n|_____________________________|");

	}

}
