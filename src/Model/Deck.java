package Model;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	public ArrayList<Card> cards = new ArrayList<>();

	public Deck() {
		super();
	}

	public void populate() {

		cards.add(new Card(Color.RED, Value.ONE));
		cards.add(new Card(Color.RED, Value.TWO));
		cards.add(new Card(Color.RED, Value.THREE));
		cards.add(new Card(Color.RED, Value.FOUR));
		cards.add(new Card(Color.RED, Value.FIVE));
		cards.add(new Card(Color.RED, Value.SIX));
		cards.add(new Card(Color.RED, Value.SEVEN));
		cards.add(new Card(Color.RED, Value.EIGHT));
		cards.add(new Card(Color.RED, Value.NINE));
		cards.add(new Card(Color.RED, Value.TEN));
		cards.add(new Card(Color.RED, Value.JACK));
		cards.add(new Card(Color.RED, Value.QUEEN));
		cards.add(new Card(Color.RED, Value.KING));
		cards.add(new Card(Color.RED, Value.ACE));
		
		cards.add(new Card(Color.RED, Value.ONE));
		cards.add(new Card(Color.RED, Value.TWO));
		cards.add(new Card(Color.RED, Value.THREE));
		cards.add(new Card(Color.RED, Value.FOUR));
		cards.add(new Card(Color.RED, Value.FIVE));
		cards.add(new Card(Color.RED, Value.SIX));
		cards.add(new Card(Color.RED, Value.SEVEN));
		cards.add(new Card(Color.RED, Value.EIGHT));
		cards.add(new Card(Color.RED, Value.NINE));
		cards.add(new Card(Color.RED, Value.TEN));
		cards.add(new Card(Color.RED, Value.JACK));
		cards.add(new Card(Color.RED, Value.QUEEN));
		cards.add(new Card(Color.RED, Value.KING));
		cards.add(new Card(Color.RED, Value.ACE));
		
		cards.add(new Card(Color.RED, Value.ONE));
		cards.add(new Card(Color.RED, Value.TWO));
		cards.add(new Card(Color.RED, Value.THREE));
		cards.add(new Card(Color.RED, Value.FOUR));
		cards.add(new Card(Color.RED, Value.FIVE));
		cards.add(new Card(Color.RED, Value.SIX));
		cards.add(new Card(Color.RED, Value.SEVEN));
		cards.add(new Card(Color.RED, Value.EIGHT));
		cards.add(new Card(Color.RED, Value.NINE));
		cards.add(new Card(Color.RED, Value.TEN));
		cards.add(new Card(Color.RED, Value.JACK));
		cards.add(new Card(Color.RED, Value.QUEEN));
		cards.add(new Card(Color.RED, Value.KING));
		cards.add(new Card(Color.RED, Value.ACE));

	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card dealCard(ArrayList<Card> discards) {
		if (cards.size() == 0) {
			cards.addAll(discards);
			discards.clear();
			discards.add(cards.remove(cards.size() - 1)); 
		}
		return cards.remove(cards.size() - 1);
	}

	@Override
	public String toString() {
		return "Deck [deck =" + cards + "]";

	}
}
