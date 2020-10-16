import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Watching up birds!
		
		//Create a Birds Data Base
		BirdsDB db = new BirdsDB( "birding" );
		//BirdsDB dbRoger = new BirdsDB( "Rogerbirding" );
		db.setBirds(InitialBirdsFilling.birds);
		
		//Ask user from menu by scanner
		Scanner reader = new Scanner(System.in);
		
		Menu menu = new Menu(reader, db );
		menu.loop(reader);
		
		System.out.println("See you in the sky!");
	}	

}


