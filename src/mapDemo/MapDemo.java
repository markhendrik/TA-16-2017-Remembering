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
		demoMap.put(7, "J�ri");
		
		System.out.println(demoMap);
		
		// V��rtuse v�lja k�simine.
		System.out.println(demoMap.get(3));
		
		// Paari eemaldamine.
		demoMap.remove(2);
		System.out.println(demoMap);
		
		// Kontroll, kas vastava v�tmega paar on olemas.
		System.out.println(demoMap.containsKey(1));
		System.out.println("_________________________");
		
		// Mapi l�bimine
		for (Map.Entry<Integer, String> entry : demoMap.entrySet()) {
			System.out.println("V�ti: " + entry.getKey() + " v��rtus: " + entry.getValue());
		}
		
		System.out.println("_________________________");
		// Mapi k�ik v�tmed.
		System.out.println("Mapi v�tmed: " + demoMap.keySet());
		for (Integer key : demoMap.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("_________________________");
		// Mapi k�ik v��rtused
		System.out.println("Mapi v��rtused: " + demoMap.values());
		
	}
	
	public String myMethod(Map<Integer, String> map) {
		return map.get(1);
	}

}
