import model.NumberGenerator;
import observers.PrintLowercase;
import observers.PrintUppercase;

/**
 * The Main class describes the
 * main entry point for the application
 * with the main method.
 *
 * @author Waswa Olunga
 */

public class Main {

	public static void main(String[] args) {

		NumberGenerator numberGenerator = new NumberGenerator();

		addAllRelevantObservers(numberGenerator);

		for(int i = 0; i < 100; i++) {

			numberGenerator.generateRandomUppercaseLetterAsciiValue();
			System.out.println();
		}
	}

	private static void addAllRelevantObservers(NumberGenerator numberGenerator) {

		PrintUppercase printUppercase = new PrintUppercase();
		numberGenerator.addObserver(printUppercase);

		PrintLowercase printLowercase = new PrintLowercase();
		numberGenerator.addObserver(printLowercase);
	}

}