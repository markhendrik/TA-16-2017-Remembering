package codingBat;

import java.util.Arrays;

public class CodingBatEx {

	public static void main(String[] args) {
		CodingBatEx cbe = new CodingBatEx();
		
		int[] intArray = {5, 6, 45, 99, 13, 5, 6};
		//System.out.println(Arrays.toString(cbe.subArray(intArray, 1, 3)));
		
		System.out.println(cbe.sameEnds(intArray, 2));
		
	}
	
	public boolean sameEnds(int[] nums, int len) {
		int[] beg = subArray(nums, 0, len);
		int[] end = subArray(nums, nums.length - len, nums.length);
		System.out.println("Algus " + Arrays.toString(beg));
		System.out.println("Lõpp " + Arrays.toString(end));
		
		return Arrays.equals(beg, end);
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
