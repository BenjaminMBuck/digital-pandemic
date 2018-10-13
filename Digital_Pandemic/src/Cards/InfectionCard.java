package Cards;

import main.City;

public class InfectionCard extends Card{
	City city;
	String imagePath;
	
	public InfectionCard(City city){
		this(city, "./"+city.getName()+".png");
	}
	public InfectionCard(City city, String imagePath){
		this.city = city;
		this.imagePath = imagePath;
	}
  
  
  

}
