import java.util.ArrayList;
import java.util.Collections;

public class MenuOptions {
	private ArrayList<String> options;
	
	public MenuOptions() {
		options = new ArrayList<String>();
		Collections.addAll(options, "Quit", "Add", "Observation", "Show", "Statistics");
		
	}
	
	public String getOption(String option) {
		return options.get(options.indexOf(option));
	}

}
