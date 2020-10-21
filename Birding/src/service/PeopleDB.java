package service;


import java.util.ArrayList;
import model.Person;

//A DB made from a list
//Contains all bird objects created in the program	
public class PeopleDB {
	
	
	//create ArrayObject of Bird objects
	private ArrayList<Person> birds;
	private String dbName;

	public PeopleDB( String name) {
		this.birds =  new ArrayList<Person>();
		this.setDbName(name);
	}
	
	
	//methods
	public ArrayList<Person> getArray(){
		
		return this.birds;
	}
	
	public Person getBird(int location) {
		
		return this.birds.get(location);
	}
	
	public int arraySize() {
		
		return this.birds.size();
	}
	
	////add bird
	public void addBird(Person bird) {
		
		this.birds.add(bird);
		//System.out.println("Array length:" + birds.size() ); // Just for checking purposes
	}
	
	////dropBird
	public void deleteBird(Person bird) {
		
		//this.birds.remove(this.birds.indexOf(bird));
		this.birds.remove(bird);
	}
	
	////addObservation
	public void addObservation(Person bird, int observations) {	
	
		bird.setObservations(bird.getObservations() + observations);
	}
	
	////showBird
	public void showBird(Person bird) {
		
		bird.toString();
	}
		
	
	//toString
	@Override
	public String toString() {
		String chain = "\rBirds list: \n";
		for (Person bird : this.birds) {
			chain += "\t" + bird.getName() + ", " + bird.getObservations() + " obs.\n";	
			//System.out.println("Chain status: "+ chain);
		}
		return chain;

	}


	public ArrayList<Person> getBirds() {
		return birds;
	}


	public void setBirds(ArrayList<Person> birds) {
		this.birds = birds;
	}
	
	


	public String getDbName() {
		return dbName;
	}


	public void setDbName(String dbName) {
		this.dbName = dbName;
	}


	
	
	
	

}

