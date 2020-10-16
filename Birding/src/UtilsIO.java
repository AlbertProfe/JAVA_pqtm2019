import java.util.Scanner;

public class Utils {
	
	//static menu methods
	
	public static String ask(Scanner reader, String option) { 
		//Prompt
		System.out.println(option);
		
		//get the user answer
		option = reader.nextLine();
		
		return option;
	}
	
	public static void add(Scanner reader, BirdsDB db) {  
		//Ask for input data
		String name = askForName(reader);
		String nameLatin = askForNameLatin(reader);
		
		//Create object Bird
		Bird bird = new Bird(name, nameLatin, 0 );
		
		
		//Ask if bird is in BirdsDB
		if (isBirdInDb(bird, db)) {
			db.addBird(bird);
		}
	}
	
	public static String askForName(Scanner reader) {
		System.out.println("Name: ");
		return reader.nextLine();
	}
	
	public static String askForNameLatin(Scanner reader){
		System.out.println("Latin name: ");
		return reader.nextLine();
	}
	
	public static boolean isBirdInDb(Bird bird, BirdsDB db) {	
		//Check for empty array
		if (db.arraySize() == 0 ){
			return true;
		}
		//Ask if bird is in BirdsDB
		for( Bird dbBird : db.getArray()) {
			//System.out.println("bird object name: "+bird.getName());
			//System.out.println("dbBird object name: "+dbBird.getName());
			if( bird.getName().equals(dbBird.getName())) {
				return false;
				}			
		}

		//If not add bird to BirdsDB
		return true;
	}
	
	public static int isBirdInDb(String name, BirdsDB db) {		
		//Ask if bird is in BirdsDB
		int i = 0;
		for( Bird dbBird : db.getArray()) {
			if(name.equals(dbBird.getName())) {
				return i;
			}
			i ++;
		}		
		//If not add bird to BirdsDB
		return -1;
	}
	
	public static void observation(Scanner reader, BirdsDB db) {
		//adds observation to bird
		//get the bird
		String name = askForName(reader);
		
		//ask if bird is on the wire (Leonard Cohen)
		int location = isBirdInDb( name, db );
		//System.out.println("location: "+location); // Just for checking purposes
		if (location  != -1) {
			//true add observation
			db.getBird(location).addObservation();
		}
		else {
		//false prompt a message
		noBirdMessage();
		}
	}
	
	public static void noBirdMessage() {
		System.out.println("This bird doesn't exists. Create it first, please.");
	}
		
	public static void show(Scanner reader, BirdsDB db) { 
		//shows single bird data
		
		//get the bird
		////ask the user
		String name = askForName( reader );
		////check if bird exists
		int location = isBirdInDb(name, db);
		
		//Print the data
		if (location != -1) {
		//////true print the bird data
			System.out.println(db.getBird(location)); //Prints bird data by default as defined in toString
		}
		else {
			//////false prompt a message 
			noBirdMessage();
		}
	}
	
	public static void statistics(BirdsDB db) { 
		//Print the complete DB
		System.out.println(db.toString());
		
	}

}

