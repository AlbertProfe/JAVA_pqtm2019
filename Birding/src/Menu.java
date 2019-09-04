import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Menu {		
	private Scanner reader;
	private BirdsDB db;
	
	
	public Menu(Scanner reader, BirdsDB db) {
		this.reader = reader;
		this.db = db;
	}
		
	public  void loop(Scanner reader) {	
		MenuOptions options = new MenuOptions();
		
	    while (true) {
	        String command = Utils.ask(this.reader, "Option?");
	        
	        try {
	        	options.getOption(command);	        	
	        } catch (Exception e) {
	        	System.out.println("Unknown command!");
	        }
	
	        if (command.equals("Quit")) {
	            break;
	        } else if (command.equals("Add")) {
	        	Utils.add(this.reader,db);
	        } else if (command.equals("Observation")) {
	        	Utils.observation(this.reader,db);
	        } else if (command.equals("Show")) {
	        	Utils.show(this.reader,db);
	        } else if (command.equals("Statistics")) {
	        	Utils.statistics(db);
	        } 
	    }
	}
}
