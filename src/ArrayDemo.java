import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arrayInts = { 2, 3, 4 };
		System.out.println(Arrays.toString(arrayInts));
		int firstNum = arrayInts[0];
		System.out.println("Esimene v‰‰rtus on: " + firstNum);
		arrayInts[0] = 7;
		System.out.println("Muutunud massiiv on: " + Arrays.toString(arrayInts));
		
		int[] arrayInts2 = new int[5];
		arrayInts2[1] = 37;
		System.out.println("Uus massiiv: " + Arrays.toString(arrayInts2));
		
		// LOOP version 1
		for (int i = 0; i < arrayInts.length; i++) {
			int item = arrayInts[i];
			System.out.println(item);
		}
		
		System.out.println();
		
		// LOOP version 2
		for (int i : arrayInts2) {
			System.out.println(i);
		}

	}

}
