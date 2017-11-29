package mapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		MapDemo md = new MapDemo();
		
		//Uue mapi loomine
		Map<Integer, String> demoMap = new HashMap<Integer, String>();
		
		md.myMethod(demoMap);
		
		//Mapi uue v�ti-v��rtuspaari lisamine.
		demoMap.put(1, "Valdur");
		demoMap.put(2, "Kalmer");
		demoMap.put(1, "Indrek");
		demoMap.put(3, "Indrek");
		
		System.out.println(demoMap);
		
		// V��rtuse v�lja k�simine.
		System.out.println(demoMap.get(3));
		
		// Paari eemaldamine.
		demoMap.remove(2);
		System.out.println(demoMap);
		
		// Kontroll, kas vastava v�tmega paar on olemas.
		System.out.println(demoMap.containsKey(1));
		
	}
	
	public String myMethod(Map<Integer, String> map) {
		return map.get(1);
	}

}
