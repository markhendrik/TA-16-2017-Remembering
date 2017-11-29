package codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingBatEx {

	public static void main(String[] args) {
		CodingBatEx cbe = new CodingBatEx();

		String[] stringArray = { "tahvel", "auk", "klass", "ahven" };
		List<String> stringList = new ArrayList<>(Arrays.asList("maja", "tuba", "allmaaraudtee"));
		int[] intArray = { 5, 6, 45, 99, 13, 5, 6 };
		List<Integer> listInts = new ArrayList<>();
		listInts.add(5);
		listInts.add(2);
		listInts.add(45);
		listInts.add(3);

		System.out.println("Massiivi pikkus " + intArray.length);
		System.out.println("Listi pikkust " + listInts.size());

		// massiivi lisamine
		intArray[0] = 17;
		System.out.println("Massiiv peale muutmist " + Arrays.toString(intArray));

		// elemendi v‰‰rtuse saamine
		System.out.println("Esimene element massiivis: " + intArray[0]);
		System.out.println("Esimene element listis: " + listInts.get(0));

		/* Sublist
		
		System.out.println("Sublisti elemendid " + listInts.subList(0, 2));
		listInts.subList(0, 2).clear();
		System.out.println("List peale eemaldamist " + listInts);
		*/
		
		// System.out.println(Arrays.toString(cbe.subArray(intArray, 1, 3)));

		// System.out.println(cbe.sameEnds(intArray, 2));
		//System.out.println("countA: " + cbe.countA(stringArray));
//		System.out.println("getLessThan5: " + cbe.getLessThan5(listInts));
		// System.out.println("getLongestString: " + cbe.getLongestString(stringList));
		System.out.println("is5InArray: " + cbe.is5InArray(intArray));

	}

	public boolean sameEnds(int[] nums, int len) {
		/*
		 * version 1 int[] beg = subArray(nums, 0, len); int[] end = subArray(nums,
		 * nums.length - len, nums.length); return Arrays.equals(beg, end);
		 */

		// version 2
		for (int i = 0; i < len; i++) {
			// System.out.println("Algus " + nums[i]);
			// System.out.println("Lıpust " + nums[nums.length-len+i]);
			if (nums[i] != nums[nums.length - len + i]) {
				return false;
			}
		}
		return true;
	}

	private int[] subArray(int[] array, int beg, int end) {
		int[] result = new int[end - beg];
		int index = 0;
		for (int i = beg; i < end; i++) {
			result[index] = array[i];
			index++;
		}
		return result;
	}

	// Etteantud massiivist loetleda kokku mitu sına algab ìaî t‰hega.
	// countA(["aken", "uks", "kollane"] => 1
	public int countA(String[] strings) {
		/*
		 * version 1 int count = 0; for (String str : strings) { if(str.substring(0,
		 * 1).equals("a")) { count++; } } return count;
		 */

		// version 2
		int count = 0;
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].startsWith("a")) {
				count++;
			}
		}
		return count;
	}

	
	// Listist, esialgset listi muutmata, vıtta v‰lja kıik 5 v‰iksemad arvud ning
	// tagastada list (vıi massiiv) nendest.
	// getLessThan5([1, 5, 4, 7] => [1, 4]
	public List<Integer> getLessThan5(List<Integer> list) {
		List<Integer> result = new ArrayList<>();
		for (Integer item : list) {
			if (item < 5) {
				result.add(item);
			}
		}
		return result;
	}
	
	//Leida etteantud massiivi pikim sına.
	// getLongestString(["uks", "aken", "lai"]) => "aken"
	public String getLongestString(List<String> strings) {
		String longest = "";
		for (String str : strings) {
			if (str.length() > longest.length()) {
				longest = str;
			}
		}
		return longest;
	}
	
	//Tagastada tıev‰‰rtus (boolean ñ true/false), kas massiivis on nr 5.
	public boolean is5InArray(int[] numbers) {
		for (int number : numbers) {
			if (number == 5) {
				return true;
			}
		}
		return false;
	}
}
