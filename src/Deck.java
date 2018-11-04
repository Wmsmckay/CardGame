import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {

	//fields
	private List<Card> fullDeck = new ArrayList<Card>();
	private String[] suit = new String[] {"Hearts", "Clubs", "Diamonds", "Spades"};
	
	
	
	
	//methods
	
	//fills the deck with all of the cards
	public Deck() {
		for(int i = 0; i < suit.length; i++) {
			for(int value = 1; value < 14; value++) {
				fullDeck.add(new Card(suit[i], value));
			}
		}
	}
	
	//add an individual card to the deck
	public void add(Card card) {
		fullDeck.add(card);
	}
	
	//prints out all of the cards in the deck
	public void showDeck() {
		for(int i = 1; i < fullDeck.size(); i++){
			fullDeck.get(i).display();
		}
	}
	//shuffles the cards in the deck
	public void shuffle() {
		Collections.shuffle(fullDeck);
	}

	public Card draw() {	
		Card topCard = fullDeck.get(0);
		fullDeck.remove(0);
		return topCard;
	}
	
	
	// getters and setters
	public List<Card> getFullDeck() {
		return fullDeck;
	}

	public void setFullDeck(List<Card> fullDeck) {
		this.fullDeck = fullDeck;
	}

	public String[] getSuit() {
		return suit;
	}

	public void setSuit(String[] suit) {
		this.suit = suit;
	}
}
