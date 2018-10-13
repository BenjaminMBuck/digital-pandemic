package main;

import java.util.ArrayList;

import Cards.PlayerCard;
import GUI.InitialPrompt;

public class Main {
	public static int numPlayers;
	public static int numEpidemics;
	
	public static ArrayList<InfectionCard> infectionDrawPile;
	public static ArrayList<InfectionCard> infectionDiscardPile;
	public static ArrayList<PlayerCard> playerDrawPile;
	public static ArrayList<PlayerCard> playerDiscardPile;
	
	
	public static void main(String args[]) {
		InitialPrompt window = new InitialPrompt();
		numPlayers = window.getNumPlayers();
		numEpidemics = window.getNumEpidemic();
		
		//Red Cities
		City Beijing = new City("Beijing", 2,1,1,false);
		City Shanghai = new City("Shanghai", 2,1,1,false);
		City hongKong = new City("Hong Kong", 2,1,1,false);
		City Bangkok = new City("Bangkok", 2,1,1,false);
		City Jakarta = new City("Jakarta", 2,1,1,false);
		City HCMCity = new City("Ho Chi Minh City", 2,1,1,false);
		City Seoul = new City("Seoul", 2,1,1,false);
		City Osaka = new City("Osaka", 2,1,1,false);
		City Taipei = new City("Taipei", 2,1,1,false);
		City Manila = new City("Manila", 2,1,1,false);
		City Sydney = new City("Sydney", 2,1,1,false);
		City Tokyo = new City("Tokyo", 2,1,1,false);
		//Yellow Cities
		City LosAngeles = new City("Beijing", 1,1,1,false);
		City MexicoCity = new City("Beijing", 1,1,1,false);
		City  = new City("Beijing", 1,1,1,false);
		City  = new City("Beijing", 1,1,1,false);
		City  = new City("Beijing", 1,1,1,false);
		City  = new City("Beijing", 1,1,1,false);
		City  = new City("Beijing", 1,1,1,false);
		City  = new City("Beijing", 1,1,1,false);
		City  = new City("Beijing", 1,1,1,false);
		City  = new City("Beijing", 1,1,1,false);
		City  = new City("Beijing", 1,1,1,false);
		City  = new City("Beijing", 1,1,1,false);
	}
}
