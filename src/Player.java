import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
	// Fields, hand list of card)
	private String name;
	private List<Card> hand = new ArrayList<Card>();
	private int score = 0;

	public Player(String name) {
		this.name = name;
	}
	//Methods:
public void describe() {
	// print out info about the user
	calculateScore();
	System.out.println("Name: " + name + "\nScore: " + score + "\nCards in hand: ");
	if (hand.isEmpty()) {
		System.out.print("None");
	}else {
	for (int i = 0; i < hand.size(); i++) {
		hand.get(i).display();
		}	
	}
}
public int calculateScore() {
	score = 0;
	for (int i = 0; i < hand.size(); i++) {
		score += hand.get(i).getCardValue();
	}
	return score;
}

public void discard() {
	Scanner scanner = new Scanner(System.in);
	if (hand.isEmpty()) {
		System.out.print("None");
	}else {
	for (int i = 0; i < hand.size(); i++) {
		System.out.print((i + 1) +": ");
		hand.get(i).display();
		}	
	}
	System.out.print("What card would you like to discard?: ");
	int card = scanner.nextInt();
	
	hand.remove(card - 1);
	//get rid of a card
	
}

public void draw(Deck deck) {
	//return card to the list hand
	hand.add(deck.draw());
	
}


//Getters and setters
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<Card> getHand() {
	return hand;
}

public void setHand(List<Card> hand) {
	this.hand = hand;
}

public int getScore() {
	return score;
}

public void setScore(int score) {
	this.score = score;
}

}