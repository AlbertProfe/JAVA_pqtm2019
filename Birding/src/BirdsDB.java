
import java.util.ArrayList;

public class BirdsDB {
	//A DB made from a list
	//Contains all bird objects created in the program
	
	
	//create ArrayObject of Bird objects
	private ArrayList<Bird> birds;
	private String dbName;

	public BirdsDB( String name) {
		this.birds =  new ArrayList<Bird>();
		this.dbName = name;
	}
	
	
	//methods
	public ArrayList<Bird> getArray(){
		
		return this.birds;
	}
	
	public Bird getBird(int location) {
		
		return this.birds.get(location);
	}
	
	public int arraySize() {
		
		return this.birds.size();
	}
	
	////add bird
	public void addBird(Bird bird) {
		
		this.birds.add(bird);
		//System.out.println("Array length:" + birds.size() ); // Just for checking purposes
	}
	
	////dropBird
	public void deleteBird(Bird bird) {
		
		this.birds.remove(this.birds.indexOf(bird));
	}
	
	////addObservation
	public void addObservation(Bird bird, int observations) {	
	
		bird.setObservations(bird.getObservations() + observations);
	}
	
	////showBird
	public void showBird(Bird bird) {
		
		bird.toString();
	}
		
	
	//toString
	@Override
	public String toString() {
		String chain = "Bird list: \n";
		for (Bird bird : this.birds) {
			chain += bird.getName() + "\n";	
			//System.out.println("Chain status: "+ chain);
		}
		return chain;

	}


	public ArrayList<Bird> getBirds() {
		return birds;
	}


	public void setBirds(ArrayList<Bird> birds) {
		this.birds = birds;
	}
	
	
	

}

