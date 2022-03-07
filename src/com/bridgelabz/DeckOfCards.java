/*
 * Program for Deck Of Card using oops concept
 */
package com.bridgelabz;

import java.util.ArrayList;

public class DeckOfCards {
	// creation of arraylist
	public ArrayList<String> deck = new ArrayList<String>();
	static String[] suit = { "clubs", "Diamonds", "Heart", "Spades" };
	static String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queue", "King", "Ace" };

	/*
	 * @purpose: Ability to Setup the initial game with deck of cards
	 * 
	 * @function : To get combination of suit and rank
	 */
	public void uniqueCards() {
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				deck.add(suit[i] + rank[j]);
			}
		}
		System.out.println(deck);
	}

	/*
	 * @purpose: This is the main method which makes use of uniqueCards method.
	 * 
	 * @function : creating object of DeckOfCards class as deckOfCards calling
	 * non-static uniqueCards method using that class object reference
	 * 
	 * @return: Nothing.
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Deck Of Cards Program..");
		DeckOfCards deckOfCards = new DeckOfCards();
		deckOfCards.uniqueCards();
	}
}
