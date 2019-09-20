package loadJSON;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class LoadJSON {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//URL url = new URL("https://sheets.googleapis.com/v4/spreadsheets/1QQnJadZm5iwF2aBqy5ByllxV-WIH9Wf-7D4wmtzibsk/values/dades!A:g?key=AIzaSyB6KLXPqUPIAB05O4r4C8goHZx3e3dAYKc");
			URL url = new URL("https://api.backendless.com/B9F8A799-6738-90EC-FFAA-222A5E74B000/B6CDEBD0-0F91-7EAE-FF90-FF74F1410F00/data/dades");
			BufferedReader buffer = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String stringLoader = "";
			
			
			while (null != (stringLoader = buffer.readLine())) {
				System.out.println(stringLoader);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		   
	}
}