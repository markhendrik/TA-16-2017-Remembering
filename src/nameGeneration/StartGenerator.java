package nameGeneration;

import java.util.Random;

public class StartGenerator {
	public static void main(String[] args) {
		NameGenerator ng = new NameGenerator();
		System.out.println("Juhuslik eesnimi: " + ng.getRandomFirstName());
		
		
		//Random demo
		// Math.random() vs Random klass
		System.out.println("juhuslik ujuvkomaga arv 0-1; " + Math.random());
		System.out.println("juhuslik arv 100 piires: " + (int) (Math.random() * 101));
		
		System.out.println("juhuslik arv Random klassiga " + new Random().nextInt());
		System.out.println("juhuslik arv Random klassiga, piiritletud  " + new Random().nextInt(10));
	}
}
