package app;

import java.util.Scanner;

import service.PeopleDB;
import utils.InitialBirdsFilling;
import view.Menu;

public class Main {

	public static void main(String[] args) {
		// Watching up birds!
		
		//Create a Birds Data Base
		PeopleDB db = new PeopleDB( "birding" );
		//BirdsDB dbRoger = new BirdsDB( "Rogerbirding" );
		db.setBirds(InitialBirdsFilling.birds);
		
		//Ask user from menu by scanner
		Scanner reader = new Scanner(System.in);
		
		Menu menu = new Menu(reader, db );
		menu.loop(reader);
		
		System.out.println("See you in the sky!");
	}	

}


