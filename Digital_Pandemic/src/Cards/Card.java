package Cards;

import java.util.ArrayList;

public class Card {

  public Card(){
  
  }
  
  public static ArrayList<Card> shuffleCardDeck(ArrayList<Card> deck) {
	  ArrayList<Card> shuffledDeck = new ArrayList<Card>(deck);
	   for(int i = 0; i < deck.size(); i++) {
		   int rand = (int) (Math.random() * (deck.size() - 1));
		   Card randomCard = deck.get(rand);
		   deck.remove(rand);
		   shuffledDeck.add(randomCard);
	   }
	  
	  return shuffledDeck;
  }
  
}
