package Model;

public class Card {

	public Card(Suit suit, Value Value) {
		super();
		this.suit = suit;
		this.Value = Value;
	}
	public Suit getSuit() {
		return suit;
	}


	public Value getValue() {
		return Value;
	}
	
	public boolean equals(Card card) {
		if (this.suit == card.suit || this.Value == card.Value) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Card [suit=" + suit + ", value=" + Value + "]";
	}

	public Suit suit;
	public Value Value;

}
