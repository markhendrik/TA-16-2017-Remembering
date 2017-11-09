package nameGeneration;

import java.util.Random;

public class NameGenerator {

	private String[] firstNames = {"Kati", "Mati", "Jaanus", "Peeter", "Mari" };
	private String[] lastNames = {"Tamm", "Kask", "Pilv", "Saar", "Oja", "Luts" };
	Random random = new Random();
	
	/*TODO Kui ülesanded on valmis, siis teha need ümbes selliselt, 
	et oleks võimalik valida mehe ja naiste nimedele vahel. */
	
	public String getRandomFirstName() {
		return firstNames[random.nextInt(firstNames.length)];
	}
	
	public String getRandomLastName() {
		//TODO
		return "";
	}
	
	public String getRandomFullName() {
		//TODO
		return "";
	}
	
	// Juhuslikest tähtedest sõne etteantud tähtede arvust.
	public String generateRandomString(int charNumber) {
		//TODO
		return "";
	}
	
	private char getRandomChar() {
		return 0;
	}
	
	public Integer generateRandomNumberBetween(int beg, int end) {
		//TODO
		return 0;
	}
	
	public boolean flipPenny() {
		//TODO
		return true;
	}
}
