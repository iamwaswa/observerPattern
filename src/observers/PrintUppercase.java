package observers;

import interfaces.Observer;

/**
 * The PrintUppercase class handles
 * printing the uppercase letter value
 * of the number generated by the
 * NumberGenerator class.
 *
 * @author Waswa Olunga
 */

public class PrintUppercase implements Observer {

	@Override
	public void stateChanged(int num) {
		System.out.println(Character.toString((char) num));
	}
}