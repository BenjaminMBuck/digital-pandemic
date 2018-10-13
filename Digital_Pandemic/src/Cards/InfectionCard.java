package Cards;

import main.City;

public class InfectionCard extends Card{
	City city;
	String imagePath;
	
	public InfectionCard(City city){
		this(city, "./assets/infectionCards/"+city.getName()+".png");
	}
	public InfectionCard(City city, String imagePath){
		this.city = city;
		this.imagePath = imagePath;
	}
	public String getImagePath() {
		return imagePath;
	}
  
  

}
