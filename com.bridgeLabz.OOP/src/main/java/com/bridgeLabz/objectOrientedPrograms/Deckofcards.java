package com.bridgeLabz.objectOrientedPrograms;

import java.util.Random;

/**
 * @author Sourabh Magdum
 * @Purpose - Distribute cards among 4 players
 * Date  - 28/10/2019
 */
public class Deckofcards {
	private String[] suits = { "Hearts", "Clubs", "Diamonds", "Spades" };
	private String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	private static String[] cards = new String[52];

	public static void main(String[] args) {

		Deckofcards deck = new Deckofcards();

		deck.getCards();
		deck.shuffleCard();

		String playerCards[][] = deck.distribute(4, 9);

		deck.displayCards(playerCards);

	}

	/**
	 * @Purpose - Used to display cards of all players
	 * @param playerCards 
	 */
	public void displayCards(String[][] playerCards) {

		int i = 1;
		for (String[] playerCard : playerCards) {
			System.out.println();
			System.out.println("player :" + (i++) + " cards : ");

			for (String card : playerCard) {
				System.out.print(card + "  ");
			}
			System.out.println();

		}

	}

	/**
	 * @Purpose - Used to distribute all card among all players
	 * @param numOfPlayers
	 * @param numberOfCards
	 * @return
	 */
	public String[][] distribute(int numOfPlayers, int numberOfCards) {

		String playerCards[][] = new String[numOfPlayers][numberOfCards];
		int k = 0;
		for (int i = 0; i < numOfPlayers; i++) {

			for (int j = 0; j < numberOfCards; j++) {
				playerCards[i][j] = cards[k];
				k++;
			}
		}
		return playerCards;
	}

	/**
	*@Purpose - shffulecard using random function
	*/
	public void shuffleCard() {

		Random random = new Random();
		for (int i = 0; i < cards.length; i++) {
			int index = random.nextInt(52);
			String temp = cards[index];
			cards[index] = cards[i];
			cards[i] = temp;
		}
	}

	/**
	 * @Purpose - Used to store all cards in a string array
	 * @return store in 2d array
	 */
	public String[] getCards() {
		int i = 0;
		for (String suit : suits) {
			for (String card : ranks) {
				cards[i] = card + "-" + suit;
				i++;
			}
		}
		return cards;
	}
}
