package interfaces;

/**
 * The interfaces.Subject interface describes
 * an implementable interface
 * for the subject model.NumberGenerator.
 *
 * @author Waswa Olunga
 */

public interface Subject {

	void addObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers(int num);
}