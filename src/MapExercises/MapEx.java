package MapExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		MapEx me = new MapEx();
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("Valdur", 65);
		map1.put("Jana", 21);
		map1.put("Maða", 42);

		System.out.println(Arrays.toString(me.getMapKeys(map1)));
		System.out.println(me.getMapKeysList(map1));
		System.out.println(Arrays.toString(me.getMapValues(map1)));
	}

	// 1. Mapi kõik võtmed panna eraldi massiivi.
	public String[] getMapKeys(Map<String, Integer> map) {
		String[] keys = new String[map.size()];
		int index = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			keys[index] = entry.getKey();
			index++;
		}
		return keys;
	}

	// 1.ül. Listiga
	public List<String> getMapKeysList(Map<String, Integer> map) {
		List<String> keys = new ArrayList<>();

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			keys.add(entry.getKey());
		}
		return keys;
	}

	// 2. Mapi väärtused saada eraldi massiivina/list.
	// Ainult sellised väärtused, mis on suuremad kui 30.
	public int[] getMapValues(Map<String, Integer> map) {
		int[] keys = new int[map.size()];
		int index = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {

			Integer value = entry.getValue();
			if (value > 30) {
				keys[index] = value;
				index++;
			}

		}
		return Arrays.copyOf(keys, index);
	}

}
