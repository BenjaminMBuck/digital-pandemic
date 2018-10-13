package Cards;

import java.util.ArrayList;

public class Card {
	String imagePath;
  public Card(){
  
  }
  
  public static ArrayList<Card> shuffleCardDeck(ArrayList<Card> deck) {
	  for(int i = 0; i < deck.size(); i++) {
		   int rand = (int) (Math.random() * (deck.size() - 1 - i));
		   Card randomCard = deck.get(rand);


	   }
	  return deck;
  }
  public String getImagePath() {
		return imagePath;
	}
  
}
