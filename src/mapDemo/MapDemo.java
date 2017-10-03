package mapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> people = new HashMap<Integer, String>();
		
		people.put(1, "Veronica");
		people.put(2, "Niia");
		people.put(3, "Lumili");
		
		//System.out.println(people.get(2));
		
		for (Integer key : people.keySet()) {
			System.out.println(key + " " + people.get(key));
		}
	}

}
