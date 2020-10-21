package controller;

import java.util.Scanner;

import model.Person;
import service.PeopleDB;
import utils.UtilsIO;

public class Controller {
	
	//static FrontController methods
	public static void add(Scanner reader, PeopleDB db) {  
		//Ask for input data
		
		
		
		String name = UtilsIO.askForName(reader);
		String nameLatin = UtilsIO.askForNameLatin(reader);
		
		//Create object Bird
		Person bird = new Person(name, nameLatin, 0 );
		
		
		//Ask if bird is in BirdsDB
		if (isBirdInDb(bird, db)) {
			db.addBird(bird);
		}
	}
			
	public static void observation(Scanner reader, PeopleDB db) {
		//adds observation to bird
		//get the bird
		String name = UtilsIO.askForName(reader);
		
		//ask if bird is on the wire (Leonard Cohen)
		int location = isBirdInDb( name, db );
		//System.out.println("location: "+location); // Just for checking purposes
		if (location  != -1) {
			//true add observation
			int observations = UtilsIO.askObservation(reader);
			db.getBird(location).addObservation(observations);
		}
		else {
		//false prompt a message
			UtilsIO.noBirdMessage(name);
		}
	}
	
	public static void show(Scanner reader, PeopleDB db) { 
		//shows single bird data
		
		//get the bird
		////ask the user
		String name = UtilsIO.askForName( reader );
		////check if bird exists
		int location = isBirdInDb(name, db);
		
		//Print the data
		if (location != -1) {
		//////true print the bird data
			System.out.println(db.getBird(location)); //Prints bird data by default as defined in toString
		}
		else {
			//////false prompt a message 
			UtilsIO.noBirdMessage(name);
		}
	}
	
	public static void statistics(PeopleDB db) { 
		//Print the complete DB
		System.out.println(db.toString());
		
	}
	
	//static Controller methods
	public static boolean isBirdInDb(Person bird, PeopleDB db) {	
		//Check for empty array
		if (db.arraySize() == 0 ){
			return true;
		}
		//Ask if bird is in BirdsDB
		for( Person dbBird : db.getArray()) {
			//System.out.println("bird object name: "+bird.getName());
			//System.out.println("dbBird object name: "+dbBird.getName());
			if( bird.getName().equals(dbBird.getName())) {
				return false;
				}			
		}

		//If not add bird to BirdsDB
		return true;
	}
	
	public static int isBirdInDb(String name, PeopleDB db) {		
		//Ask if bird is in BirdsDB
		int i = 0;
		for( Person dbBird : db.getArray()) {
			if(name.equals(dbBird.getName())) {
				return i;
			}
			i ++;
		}		
		//If not add bird to BirdsDB
		return -1;
	}



}

