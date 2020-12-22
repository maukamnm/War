package Model;

import java.util.ArrayList;

public class Hand {
	public Hand() {
		cards = new ArrayList<Card>();
	}

	public void drawCard(Card card) {
		cards.add(card);
	}

	public int CardCount() {
		return cards.size();
	}

	public void add(ArrayList<Card> cards) {
		this.cards.addAll(cards);
	}

	public Card playCard() {
		return cards.remove(0);
	}

	@Override
	public String toString() {
		return "Hand=" + cards;
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public ArrayList<Card> cards;

	public Card hasMatch(ArrayList<Card> discards) {
		Card card = null;
		Card topCard = discards.get(discards.size() - 1);
		for (int i = 0; i < cards.size(); i++) {
			if (cards.get(i).equals(topCard)); // finding match
				discards.add(card); // taking card and putting in discard pile
				cards.remove(i); // taking card out of hand
					if (card.getSuit() != ()) { // if its not a match
						System.out.println("No match, next play");
					}
				break;
			}
		return card;
	}
}
