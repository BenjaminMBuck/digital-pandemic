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
		
	}
}
