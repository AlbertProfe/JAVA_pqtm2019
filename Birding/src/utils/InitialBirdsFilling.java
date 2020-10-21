package utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.Person;

public class InitialBirdsFilling {
	
	
	    //public static List<Bird> birds = new LinkedList<Bird>();
		public static ArrayList<Person> birds = new ArrayList<Person>();
	 
	    static {
	    	birds.add(new Person("Owls","Owls",5));
	    	birds.add(new Person("Columbidae","Columbidae",6));
	    	birds.add(new Person("Finches", "Finches",9));
	    }
	    
	    static {
	    	birds.add(new Person("Finches", "Finches",12));
	    	birds.add(new Person("Pigeon", "Pigeon",5));
	    }
	

}
