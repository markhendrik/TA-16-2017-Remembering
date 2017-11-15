package codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingBatEx {

	public static void main(String[] args) {
		CodingBatEx cbe = new CodingBatEx();
		
		int[] intArray = {5, 6, 45, 99, 13, 5, 6};
		List<Integer> listInts = new ArrayList<>();
		listInts.add(5);
		listInts.add(6);
		listInts.add(45);
		listInts.add(99);
		
		System.out.println("Massiivi pikkus " + intArray.length);
		System.out.println("Listi pikkust " + listInts.size());
		
		//massiivi lisamine
		intArray[0] = 17;
		System.out.println(Arrays.toString(intArray));
		
		//elemendi v‰‰rtuse saamine
		System.out.println("Esimene element masiivis: " + intArray[0]);
		System.out.println("Esimene element listis: " + listInts.get(0));
		
		//Sublist
		System.out.println("Sublisti elemendid " + listInts.subList(0, 2));
		listInts.subList(0, 2).clear();
		System.out.println("List peale eemaldamist " + listInts);
		
		
		//System.out.println(Arrays.toString(cbe.subArray(intArray, 1, 3)));
		
		
		System.out.println(cbe.sameEnds(intArray, 2));
		
	}
	
	public boolean sameEnds(int[] nums, int len) {
		/* version 1
		int[] beg = subArray(nums, 0, len);
		int[] end = subArray(nums, nums.length - len, nums.length);	
		return Arrays.equals(beg, end); */
		
		// version 2
		for (int i = 0; i < len; i++) {
//			System.out.println("Algus " + nums[i]);
//			System.out.println("Lıpust " + nums[nums.length-len+i]);
			if (nums[i] != nums[nums.length-len+i]) {
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

}
