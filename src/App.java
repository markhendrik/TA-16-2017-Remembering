import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		App appObject = new App();

//		System.out.println("sayHello() result: " + appObject.sayHello("David") + "\n");

//		System.out.println("generateHtmlElement() result: " + appObject.generateHtmlElement("h4", "V‰iksem pealkiri"));

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

	// ‹lesanne: tervita kasutajat, tervitusteksti saad ise valida.
	// Kasutajale nime saad parameetrina.

	private String sayHello(String name) {
		return "Hello " + name;
	}

	// generateHtmlElement(ìh1î, ìThis is a Headingî) -> ì<h1>This is a
	// Heading</h1>î
	private String generateHtmlElement(String tag, String value) {
		// 1. variant
		// return "<" + tag + ">" + value + "</" + tag + ">";

		// 2. variant
		// String htmlElement = String.format("<%1$s>%2$s</%1$s>", tag, value);

		// 3.variant
		StringBuilder htmlElement = new StringBuilder("<");

		return htmlElement.append(tag).append(">").append(value).append("</").append(tag).append(">").toString();

	}

}
