import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InitialBirdsFilling {
	
	
	    //public static List<Bird> birds = new LinkedList<Bird>();
		public static ArrayList<Bird> birds = new ArrayList<Bird>();
	 
	    static {
	    	birds.add(new Bird("Owls","Owls",5));
	    	birds.add(new Bird("Columbidae","Columbidae",6));
	    	birds.add(new Bird("Finches", "Finches",9));
	    }
	    
	    static {
	    	birds.add(new Bird("Finches", "Finches",12));
	    	birds.add(new Bird("Pigeon", "Pigeon",5));
	    }
	

}
