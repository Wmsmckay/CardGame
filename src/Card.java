public class Card {

	//fields
	private int cardValue;
	private String cardSuit;
	
	//constructor
	public Card(String cardSuit, int cardValue) {
		this.cardValue = cardValue;
		this.cardSuit = cardSuit;
	}
	
	
	//getters and setters
	public int getCardValue() {
		return cardValue;
	}
	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}
	public String getCardSuit() {
		return cardSuit;
	}
	public void setCardSuit(String cardSuit) {
		this.cardSuit = cardSuit;
	}
	

	//methods
	public void display() {
		String faceCard = null;
		if(cardValue == 1) {
			faceCard = "Ace";
		}else if(cardValue == 11) {
			faceCard = "Jack";
		}else if(cardValue == 12) {
			faceCard = "Queen";
		}else if (cardValue == 13) {
			faceCard = "King";
		}
		
		if(faceCard == null) {		
		System.out.print(cardValue + " of " + cardSuit);
		}else {
			System.out.print(faceCard + " of " + cardSuit);
		}
		System.out.println("");
}
}