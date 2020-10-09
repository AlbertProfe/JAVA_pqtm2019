package intro2;

public class Car {
	
	public int doors;
	public int places;
	public String color;
		
	
	

	/*
	 * public Car(int doors, int places, String color) { this.doors = doors;
	 * this.places = places; this.color = color; }
	 * 
	 * public Car(int doors) { this.doors = doors;
	 * 
	 * }
	 */
	
	
	public Car(int doors, int places, String color) {
		super();
		this.doors = doors;
		this.places = places;
		this.color = color;
	}


	@Override
	public String toString() {
		return "Car [toString()=" + super.toString() + "]";
	}




	

	
	
}
