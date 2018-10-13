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
		City LosAngeles = new City("Los Angeles", 1,1,1,false);
		City MexicoCity = new City("Mexico Cities", 1,1,1,false);
		City Miami = new City("Miami", 1,1,1,false);
		City Bogota = new City("Bogota", 1,1,1,false);
		City Lima = new City("Lima", 1,1,1,false);
		City Santiago = new City("Santiago", 1,1,1,false);
		City BuneosAires = new City("Buneos Aires", 1,1,1,false);
		City SaoPaulo = new City("Sao Paulo", 1,1,1,false);
		City Lagos = new City("Lagos", 1,1,1,false);
		City Kinshasa = new City("Kinshasa", 1,1,1,false);
		City Johannesburg = new City("Johannesburg", 1,1,1,false);
		City Khartoum = new City("Khartoum", 1,1,1,false);
		//Blue Cities
		City SanFrancisco = new City("San Francisco", 0,1,1,false);
		City Chicago = new City("Chicago", 0,1,1,false);
		City Washington = new City("Washington", 0,1,1,false);
		City NewYork = new City("New York", 0,1,1,false);
		City Montreal = new City("Montreal", 0,1,1,false);
		City London = new City("London", 0,1,1,false);
		City Madrid = new City("Madrid", 0,1,1,false);
		City Paris = new City("Paris", 0,1,1,false);
		City Milan = new City("Milan", 0,1,1,false);
		City StPetersburg = new City("St. Petersburg", 0,1,1,false);
		City Essen = new City("Essen", 0,1,1,false);
		City Atlanta = new City("Atlanta", 0,1,1,true);
		//Black Cities
		City Moscow = new City("Moscow", 3,1,1,false);
		City Tehran = new City("Tehran", 3,1,1,false);
		City Delhi = new City("Delhi", 3,1,1,false);
		City Kolkata = new City("Kolkata", 3,1,1,false);
		City Chennai = new City("Chennai", 3,1,1,false);
		City Mumbai = new City("Mumbai", 3,1,1,false);
		City Karachi = new City("Karachi", 3,1,1,false);
		City Riyadh = new City("Riyadh", 3,1,1,false);
		City Cairo = new City("Cairo", 3,1,1,false);
		City Istanbul = new City("Istanbul", 3,1,1,false);
		City Baghdad = new City("Baghdad", 3,1,1,false);
		City Algiers = new City("Algiers", 3,1,1,false);

	}
}
