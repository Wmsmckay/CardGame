import java.util.Scanner;


public class CardTrickApp {

	public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println("What is your name?");
		Player player1 = new Player(getPlayerName());
		
		int option = -1;
		while (option != 0) {
			showOptions();
			makeChoice(deck, player1, option);
			option = reader.nextInt();
			System.out.println();
				
		}
		System.out.println("Thanks for playing!");
	}
	
	
	
	//methods
	
	public static void showOptions() {
		System.out.println("Please pick an option.");
		String[] options = new String[] {"1: Draw a card", "2: Discard a card", "3: View player info", "0: Quit"};
		for (int i = 0; i < options.length; i++) {
			System.out.println(options[i]);
		}
	}
	
	public static String getPlayerName() {
		String playerName = reader.nextLine();
		return playerName;
	}
	
	
	public static void makeChoice(Deck deck, Player player, int option) {
		
		switch (option) {
		case 1:
			System.out.println();
			player.draw(deck);
			System.out.println();
			break;
		case 2:
			System.out.println();
			player.discard();
			System.out.println();
			break;
		case 3:
			System.out.println();
			player.describe();
			System.out.println();
			break;
		default:
			System.out.println("Please enter a valid option");			
			
		}
	}
}
